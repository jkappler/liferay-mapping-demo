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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for StarshipEntry. This utility wraps
 * <code>com.liferay.starship.service.impl.StarshipEntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryService
 * @generated
 */
public class StarshipEntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.starship.service.impl.StarshipEntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.starship.model.StarshipEntry addStarshipEntry(
			long userId, long groupId, String name, String description,
			java.io.File starshipFileImage, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addStarshipEntry(
			userId, groupId, name, description, starshipFileImage, status,
			serviceContext);
	}

	public static com.liferay.starship.model.StarshipEntry deleteStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteStarshipEntry(starshipEntryId);
	}

	public static com.liferay.starship.model.StarshipEntry fetchStarshipEntry(
		long starshipEntryId) {

		return getService().fetchStarshipEntry(starshipEntryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(long groupId) {

		return getService().getStarshipEntries(groupId);
	}

	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(long groupId, int start, int end) {

		return getService().getStarshipEntries(groupId, start, end);
	}

	public static com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStarshipEntry(starshipEntryId);
	}

	public static com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long groupId, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStarshipEntry(groupId, name);
	}

	public static int getStarshipEntryCount(long groupId) {
		return getService().getStarshipEntryCount(groupId);
	}

	public static com.liferay.starship.model.StarshipEntry updateStarshipEntry(
			long starshipEntryId, String name, String description,
			java.io.File starshipFileImage, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateStarshipEntry(
			starshipEntryId, name, description, starshipFileImage, status);
	}

	public static StarshipEntryService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StarshipEntryService, StarshipEntryService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StarshipEntryService.class);

		ServiceTracker<StarshipEntryService, StarshipEntryService>
			serviceTracker =
				new ServiceTracker<StarshipEntryService, StarshipEntryService>(
					bundle.getBundleContext(), StarshipEntryService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}