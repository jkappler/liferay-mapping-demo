/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.starship.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ModelHintsUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.FriendlyURLNormalizerUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.starship.exception.DuplicateStarshipEntryNameException;
import com.liferay.starship.exception.StarshipEntryNameException;
import com.liferay.starship.model.StarshipEntry;
import com.liferay.starship.service.base.StarshipEntryLocalServiceBaseImpl;

import java.io.File;
import java.io.IOException;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * @author Jürgen Kappler
 */
@Component(
	property = "model.class.name=com.liferay.starship.model.StarshipEntry",
	service = AopService.class
)
public class StarshipEntryLocalServiceImpl
	extends StarshipEntryLocalServiceBaseImpl {

	@Override
	public StarshipEntry addStarshipEntry(
			long userId, long groupId, String name, String description,
			File starshipFileImage, int status, ServiceContext serviceContext)
		throws PortalException {

		_validateName(groupId, name);

		User user = userLocalService.getUser(userId);

		long starshipEntryId = counterLocalService.increment();

		StarshipEntry starshipEntry = starshipEntryPersistence.create(
			starshipEntryId);

		starshipEntry.setUuid(serviceContext.getUuid());
		starshipEntry.setGroupId(groupId);
		starshipEntry.setCompanyId(user.getCompanyId());
		starshipEntry.setUserId(user.getUserId());
		starshipEntry.setUserName(user.getFullName());
		starshipEntry.setCreateDate(serviceContext.getCreateDate(new Date()));
		starshipEntry.setModifiedDate(
			serviceContext.getModifiedDate(new Date()));
		starshipEntry.setName(name);
		starshipEntry.setDescription(description);

		long starshipFileImageId = 0;

		if (starshipFileImage != null) {
			byte[] starhipImageBytes = null;

			try {
				starhipImageBytes = FileUtil.getBytes(starshipFileImage);

				if (starhipImageBytes != null) {
					starshipFileImageId = counterLocalService.increment();

					imageLocalService.updateImage(
						starshipFileImageId, starhipImageBytes);
				}
			}
			catch (IOException ioException) {
			}
		}

		starshipEntry.setStarshipFileImageId(starshipFileImageId);
		starshipEntry.setUrlTitle(
			FriendlyURLNormalizerUtil.normalizeWithEncoding(name));
		starshipEntry.setStatus(status);

		starshipEntry = starshipEntryPersistence.update(starshipEntry);

		// Resources

		resourceLocalService.addResources(
			starshipEntry.getCompanyId(), starshipEntry.getGroupId(),
			starshipEntry.getUserId(), StarshipEntry.class.getName(),
			starshipEntry.getPrimaryKey(), false, true, true);

		return starshipEntry;
	}

	@Override
	public StarshipEntry deleteStarshipEntry(long starshipEntryId)
		throws PortalException {

		return deleteStarshipEntry(getStarshipEntry(starshipEntryId));
	}

	@Override
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public StarshipEntry deleteStarshipEntry(StarshipEntry starshipEntry)
		throws PortalException {

		starshipEntryPersistence.remove(starshipEntry);

		resourceLocalService.deleteResource(
			starshipEntry, ResourceConstants.SCOPE_INDIVIDUAL);

		return starshipEntry;
	}

	@Override
	public List<StarshipEntry> getStarshipEntries(long groupId) {
		return starshipEntryPersistence.findByGroupId(groupId);
	}

	@Override
	public StarshipEntry getStarshipEntry(long groupId, String urlTitle)
		throws PortalException {

		return starshipEntryPersistence.findByG_U(groupId, urlTitle);
	}

	@Override
	public StarshipEntry updateStarshipEntry(
			long starshipEntryId, String name, String description,
			File starshipFileImage, int status)
		throws PortalException {

		StarshipEntry starshipEntry = starshipEntryPersistence.findByPrimaryKey(
			starshipEntryId);

		if (!Objects.equals(starshipEntry.getName(), name)) {
			_validateName(starshipEntry.getGroupId(), name);
		}

		starshipEntry.setModifiedDate(new Date());
		starshipEntry.setName(name);
		starshipEntry.setDescription(description);
		starshipEntry.setStatus(status);

		starshipEntry = starshipEntryPersistence.update(starshipEntry);

		// Image

		if (starshipFileImage != null) {
			byte[] starhipImageBytes = null;

			try {
				starhipImageBytes = FileUtil.getBytes(starshipFileImage);

				if (starhipImageBytes != null) {
					imageLocalService.updateImage(
						starshipEntry.getStarshipFileImageId(),
						starhipImageBytes);
				}
			}
			catch (IOException ioException) {
			}
		}

		return starshipEntry;
	}

	private void _validateName(long groupId, String name)
		throws PortalException {

		if (Validator.isNull(name)) {
			throw new StarshipEntryNameException("Name is null");
		}

		int nameMaxLength = ModelHintsUtil.getMaxLength(
			StarshipEntry.class.getName(), "name");

		if (name.length() > nameMaxLength) {
			throw new StarshipEntryNameException(
				"Name has more than " + nameMaxLength + " characters");
		}

		StarshipEntry starship = starshipEntryPersistence.fetchByG_N(
			groupId, name);

		if (starship != null) {
			throw new DuplicateStarshipEntryNameException();
		}
	}

}