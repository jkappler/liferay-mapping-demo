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
 * Provides the local service utility for StarshipEntry. This utility wraps
 * <code>com.liferay.starship.service.impl.StarshipEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryLocalService
 * @generated
 */
public class StarshipEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.starship.service.impl.StarshipEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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

	/**
	 * Adds the starship entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StarshipEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param starshipEntry the starship entry
	 * @return the starship entry that was added
	 */
	public static com.liferay.starship.model.StarshipEntry addStarshipEntry(
		com.liferay.starship.model.StarshipEntry starshipEntry) {

		return getService().addStarshipEntry(starshipEntry);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new starship entry with the primary key. Does not add the starship entry to the database.
	 *
	 * @param starshipEntryId the primary key for the new starship entry
	 * @return the new starship entry
	 */
	public static com.liferay.starship.model.StarshipEntry createStarshipEntry(
		long starshipEntryId) {

		return getService().createStarshipEntry(starshipEntryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the starship entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StarshipEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry that was removed
	 * @throws PortalException if a starship entry with the primary key could not be found
	 */
	public static com.liferay.starship.model.StarshipEntry deleteStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteStarshipEntry(starshipEntryId);
	}

	/**
	 * Deletes the starship entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StarshipEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param starshipEntry the starship entry
	 * @return the starship entry that was removed
	 * @throws PortalException
	 */
	public static com.liferay.starship.model.StarshipEntry deleteStarshipEntry(
			com.liferay.starship.model.StarshipEntry starshipEntry)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteStarshipEntry(starshipEntry);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.starship.model.impl.StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.starship.model.impl.StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.starship.model.StarshipEntry fetchStarshipEntry(
		long starshipEntryId) {

		return getService().fetchStarshipEntry(starshipEntryId);
	}

	/**
	 * Returns the starship entry matching the UUID and group.
	 *
	 * @param uuid the starship entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static com.liferay.starship.model.StarshipEntry
		fetchStarshipEntryByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchStarshipEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the starship entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.starship.model.impl.StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @return the range of starship entries
	 */
	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(int start, int end) {

		return getService().getStarshipEntries(start, end);
	}

	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(long groupId) {

		return getService().getStarshipEntries(groupId);
	}

	/**
	 * Returns all the starship entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the starship entries
	 * @param companyId the primary key of the company
	 * @return the matching starship entries, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getStarshipEntriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of starship entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the starship entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching starship entries, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.starship.model.StarshipEntry> orderByComparator) {

		return getService().getStarshipEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of starship entries.
	 *
	 * @return the number of starship entries
	 */
	public static int getStarshipEntriesCount() {
		return getService().getStarshipEntriesCount();
	}

	/**
	 * Returns the starship entry with the primary key.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry
	 * @throws PortalException if a starship entry with the primary key could not be found
	 */
	public static com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStarshipEntry(starshipEntryId);
	}

	public static com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long groupId, String urlTitle)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStarshipEntry(groupId, urlTitle);
	}

	/**
	 * Returns the starship entry matching the UUID and group.
	 *
	 * @param uuid the starship entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching starship entry
	 * @throws PortalException if a matching starship entry could not be found
	 */
	public static com.liferay.starship.model.StarshipEntry
			getStarshipEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStarshipEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.starship.model.StarshipEntry updateStarshipEntry(
			long starshipEntryId, String name, String description,
			java.io.File starshipFileImage, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateStarshipEntry(
			starshipEntryId, name, description, starshipFileImage, status);
	}

	/**
	 * Updates the starship entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StarshipEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param starshipEntry the starship entry
	 * @return the starship entry that was updated
	 */
	public static com.liferay.starship.model.StarshipEntry updateStarshipEntry(
		com.liferay.starship.model.StarshipEntry starshipEntry) {

		return getService().updateStarshipEntry(starshipEntry);
	}

	public static StarshipEntryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<StarshipEntryLocalService, StarshipEntryLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			StarshipEntryLocalService.class);

		ServiceTracker<StarshipEntryLocalService, StarshipEntryLocalService>
			serviceTracker =
				new ServiceTracker
					<StarshipEntryLocalService, StarshipEntryLocalService>(
						bundle.getBundleContext(),
						StarshipEntryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}