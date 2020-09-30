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
 * Provides a wrapper for {@link StarshipEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryLocalService
 * @generated
 */
public class StarshipEntryLocalServiceWrapper
	implements ServiceWrapper<StarshipEntryLocalService>,
			   StarshipEntryLocalService {

	public StarshipEntryLocalServiceWrapper(
		StarshipEntryLocalService starshipEntryLocalService) {

		_starshipEntryLocalService = starshipEntryLocalService;
	}

	@Override
	public com.liferay.starship.model.StarshipEntry addStarshipEntry(
			long userId, long groupId, String name, String description,
			java.io.File starshipFileImage, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.addStarshipEntry(
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
	@Override
	public com.liferay.starship.model.StarshipEntry addStarshipEntry(
		com.liferay.starship.model.StarshipEntry starshipEntry) {

		return _starshipEntryLocalService.addStarshipEntry(starshipEntry);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new starship entry with the primary key. Does not add the starship entry to the database.
	 *
	 * @param starshipEntryId the primary key for the new starship entry
	 * @return the new starship entry
	 */
	@Override
	public com.liferay.starship.model.StarshipEntry createStarshipEntry(
		long starshipEntryId) {

		return _starshipEntryLocalService.createStarshipEntry(starshipEntryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.liferay.starship.model.StarshipEntry deleteStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.deleteStarshipEntry(starshipEntryId);
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
	@Override
	public com.liferay.starship.model.StarshipEntry deleteStarshipEntry(
			com.liferay.starship.model.StarshipEntry starshipEntry)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.deleteStarshipEntry(starshipEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _starshipEntryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _starshipEntryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _starshipEntryLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _starshipEntryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _starshipEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _starshipEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry fetchStarshipEntry(
		long starshipEntryId) {

		return _starshipEntryLocalService.fetchStarshipEntry(starshipEntryId);
	}

	/**
	 * Returns the starship entry matching the UUID and group.
	 *
	 * @param uuid the starship entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	@Override
	public com.liferay.starship.model.StarshipEntry
		fetchStarshipEntryByUuidAndGroupId(String uuid, long groupId) {

		return _starshipEntryLocalService.fetchStarshipEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _starshipEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _starshipEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _starshipEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _starshipEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(int start, int end) {

		return _starshipEntryLocalService.getStarshipEntries(start, end);
	}

	@Override
	public java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(long groupId) {

		return _starshipEntryLocalService.getStarshipEntries(groupId);
	}

	/**
	 * Returns all the starship entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the starship entries
	 * @param companyId the primary key of the company
	 * @return the matching starship entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _starshipEntryLocalService.getStarshipEntriesByUuidAndCompanyId(
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
	@Override
	public java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.starship.model.StarshipEntry> orderByComparator) {

		return _starshipEntryLocalService.getStarshipEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of starship entries.
	 *
	 * @return the number of starship entries
	 */
	@Override
	public int getStarshipEntriesCount() {
		return _starshipEntryLocalService.getStarshipEntriesCount();
	}

	/**
	 * Returns the starship entry with the primary key.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry
	 * @throws PortalException if a starship entry with the primary key could not be found
	 */
	@Override
	public com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.getStarshipEntry(starshipEntryId);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry getStarshipEntry(
			long groupId, String urlTitle)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.getStarshipEntry(groupId, urlTitle);
	}

	/**
	 * Returns the starship entry matching the UUID and group.
	 *
	 * @param uuid the starship entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching starship entry
	 * @throws PortalException if a matching starship entry could not be found
	 */
	@Override
	public com.liferay.starship.model.StarshipEntry
			getStarshipEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.getStarshipEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.starship.model.StarshipEntry updateStarshipEntry(
			long starshipEntryId, String name, String description,
			java.io.File starshipFileImage, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _starshipEntryLocalService.updateStarshipEntry(
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
	@Override
	public com.liferay.starship.model.StarshipEntry updateStarshipEntry(
		com.liferay.starship.model.StarshipEntry starshipEntry) {

		return _starshipEntryLocalService.updateStarshipEntry(starshipEntry);
	}

	@Override
	public StarshipEntryLocalService getWrappedService() {
		return _starshipEntryLocalService;
	}

	@Override
	public void setWrappedService(
		StarshipEntryLocalService starshipEntryLocalService) {

		_starshipEntryLocalService = starshipEntryLocalService;
	}

	private StarshipEntryLocalService _starshipEntryLocalService;

}