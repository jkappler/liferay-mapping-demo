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
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.starship.constants.StarshipActionKeys;
import com.liferay.starship.model.StarshipEntry;
import com.liferay.starship.service.base.StarshipEntryServiceBaseImpl;

import java.io.File;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jürgen Kappler
 */
@Component(
	property = {
		"json.web.service.context.name=starship",
		"json.web.service.context.path=StarshipEntry"
	},
	service = AopService.class
)
public class StarshipEntryServiceImpl extends StarshipEntryServiceBaseImpl {

	@Override
	public StarshipEntry addStarshipEntry(
			long userId, long groupId, String name, String description,
			File starshipFileImage, int status, ServiceContext serviceContext)
		throws PortalException {

		_portletResourcePermission.check(
			getPermissionChecker(), groupId,
			StarshipActionKeys.ADD_STARSHIP_ENTRY);

		return starshipEntryLocalService.addStarshipEntry(
			userId, groupId, name, description, starshipFileImage, status,
			serviceContext);
	}

	@Override
	public StarshipEntry deleteStarshipEntry(long starshipEntryId)
		throws PortalException {

		_starshipEntryModelResourcePermission.check(
			getPermissionChecker(),
			starshipEntryLocalService.getStarshipEntry(starshipEntryId),
			ActionKeys.DELETE);

		return starshipEntryLocalService.deleteStarshipEntry(starshipEntryId);
	}

	@Override
	public StarshipEntry fetchStarshipEntry(long starshipEntryId) {
		return starshipEntryLocalService.fetchStarshipEntry(starshipEntryId);
	}

	@Override
	public List<StarshipEntry> getStarshipEntries(long groupId) {
		return starshipEntryLocalService.getStarshipEntries(groupId);
	}

	@Override
	public List<StarshipEntry> getStarshipEntries(
		long groupId, int start, int end) {

		return starshipEntryPersistence.findByGroupId(groupId, start, end);
	}

	@Override
	public StarshipEntry getStarshipEntry(long starshipEntryId)
		throws PortalException {

		StarshipEntry starshipEntry =
			starshipEntryLocalService.getStarshipEntry(starshipEntryId);

		_starshipEntryModelResourcePermission.check(
			getPermissionChecker(), starshipEntry, ActionKeys.VIEW);

		return starshipEntry;
	}

	@Override
	public StarshipEntry getStarshipEntry(long groupId, String name)
		throws PortalException {

		StarshipEntry starshipEntry =
			starshipEntryLocalService.getStarshipEntry(groupId, name);

		_starshipEntryModelResourcePermission.check(
			getPermissionChecker(), starshipEntry, ActionKeys.VIEW);

		return starshipEntry;
	}

	@Override
	public int getStarshipEntryCount(long groupId) {
		return starshipEntryPersistence.countByGroupId(groupId);
	}

	@Override
	public StarshipEntry updateStarshipEntry(
			long starshipEntryId, String name, String description,
			File starshipFileImage, int status)
		throws PortalException {

		_starshipEntryModelResourcePermission.check(
			getPermissionChecker(),
			starshipEntryLocalService.getStarshipEntry(starshipEntryId),
			ActionKeys.UPDATE);

		return starshipEntryLocalService.updateStarshipEntry(
			starshipEntryId, name, description, starshipFileImage, status);
	}

	@Reference(target = "(resource.name=com.liferay.starship)")
	private PortletResourcePermission _portletResourcePermission;

	@Reference(
		target = "(model.class.name=com.liferay.starship.model.StarshipEntry)"
	)
	private ModelResourcePermission<StarshipEntry>
		_starshipEntryModelResourcePermission;

}