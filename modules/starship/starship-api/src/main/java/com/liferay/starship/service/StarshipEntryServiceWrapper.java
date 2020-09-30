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

package com.liferay.starship.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StarshipEntryService}.
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryService
 * @generated
 */
public class StarshipEntryServiceWrapper
	implements ServiceWrapper<StarshipEntryService>, StarshipEntryService {

	public StarshipEntryServiceWrapper(
		StarshipEntryService starshipEntryService) {

		_starshipEntryService = starshipEntryService;
	}

	@Override
	public com.liferay.starship.model.StarshipEntry addStarshipEntry(
			long userId, long groupId, String name, String description,
			java.io.File starshipFileImage, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryService.addStarshipEntry(
			userId, groupId, name, description, starshipFileImage, status,
			serviceContext);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry deleteStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryService.deleteStarshipEntry(starshipEntryId);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry fetchStarshipEntry(
		long starshipEntryId) {

		return _starshipEntryService.fetchStarshipEntry(starshipEntryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _starshipEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(long groupId) {

		return _starshipEntryService.getStarshipEntries(groupId);
	}

	@Override
	public java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(long groupId, int start, int end) {

		return _starshipEntryService.getStarshipEntries(groupId, start, end);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryService.getStarshipEntry(starshipEntryId);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long groupId, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryService.getStarshipEntry(groupId, name);
	}

	@Override
	public int getStarshipEntryCount(long groupId) {
		return _starshipEntryService.getStarshipEntryCount(groupId);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry updateStarshipEntry(
			long starshipEntryId, String name, String description,
			java.io.File starshipFileImage, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryService.updateStarshipEntry(
			starshipEntryId, name, description, starshipFileImage, status);
	}

	@Override
	public StarshipEntryService getWrappedService() {
		return _starshipEntryService;
	}

	@Override
	public void setWrappedService(StarshipEntryService starshipEntryService) {
		_starshipEntryService = starshipEntryService;
	}

	private StarshipEntryService _starshipEntryService;

}