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

package com.liferay.starship.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.starship.model.StarshipEntry;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the starship entry service. This utility wraps <code>com.liferay.starship.service.persistence.impl.StarshipEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryPersistence
 * @generated
 */
public class StarshipEntryUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(StarshipEntry starshipEntry) {
		getPersistence().clearCache(starshipEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, StarshipEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StarshipEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StarshipEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StarshipEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StarshipEntry update(StarshipEntry starshipEntry) {
		return getPersistence().update(starshipEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StarshipEntry update(
		StarshipEntry starshipEntry, ServiceContext serviceContext) {

		return getPersistence().update(starshipEntry, serviceContext);
	}

	/**
	 * Returns all the starship entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching starship entries
	 */
	public static List<StarshipEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the starship entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @return the range of matching starship entries
	 */
	public static List<StarshipEntry> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the starship entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the starship entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByUuid_First(
			String uuid, OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByUuid_First(
		String uuid, OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByUuid_Last(
			String uuid, OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByUuid_Last(
		String uuid, OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the starship entries before and after the current starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param starshipEntryId the primary key of the current starship entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public static StarshipEntry[] findByUuid_PrevAndNext(
			long starshipEntryId, String uuid,
			OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			starshipEntryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the starship entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of starship entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching starship entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the starship entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByUUID_G(String uuid, long groupId)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the starship entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the starship entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the starship entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the starship entry that was removed
	 */
	public static StarshipEntry removeByUUID_G(String uuid, long groupId)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of starship entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching starship entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the starship entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching starship entries
	 */
	public static List<StarshipEntry> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the starship entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @return the range of matching starship entries
	 */
	public static List<StarshipEntry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the starship entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the starship entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the starship entries before and after the current starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param starshipEntryId the primary key of the current starship entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public static StarshipEntry[] findByUuid_C_PrevAndNext(
			long starshipEntryId, String uuid, long companyId,
			OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			starshipEntryId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the starship entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of starship entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching starship entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the starship entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching starship entries
	 */
	public static List<StarshipEntry> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the starship entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @return the range of matching starship entries
	 */
	public static List<StarshipEntry> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the starship entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the starship entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByGroupId_First(
			long groupId, OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByGroupId_First(
		long groupId, OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByGroupId_Last(
			long groupId, OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByGroupId_Last(
		long groupId, OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the starship entries before and after the current starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param starshipEntryId the primary key of the current starship entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public static StarshipEntry[] findByGroupId_PrevAndNext(
			long starshipEntryId, long groupId,
			OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByGroupId_PrevAndNext(
			starshipEntryId, groupId, orderByComparator);
	}

	/**
	 * Removes all the starship entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of starship entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching starship entries
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the starship entries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching starship entries
	 */
	public static List<StarshipEntry> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the starship entries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @return the range of matching starship entries
	 */
	public static List<StarshipEntry> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the starship entries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the starship entries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching starship entries
	 */
	public static List<StarshipEntry> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByCompanyId_First(
			long companyId, OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByCompanyId_First(
		long companyId, OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByCompanyId_Last(
			long companyId, OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByCompanyId_Last(
		long companyId, OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the starship entries before and after the current starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param starshipEntryId the primary key of the current starship entry
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public static StarshipEntry[] findByCompanyId_PrevAndNext(
			long starshipEntryId, long companyId,
			OrderByComparator<StarshipEntry> orderByComparator)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByCompanyId_PrevAndNext(
			starshipEntryId, companyId, orderByComparator);
	}

	/**
	 * Removes all the starship entries where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of starship entries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching starship entries
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns the starship entry where groupId = &#63; and name = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public static StarshipEntry findByG_N(long groupId, String name)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByG_N(groupId, name);
	}

	/**
	 * Returns the starship entry where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByG_N(long groupId, String name) {
		return getPersistence().fetchByG_N(groupId, name);
	}

	/**
	 * Returns the starship entry where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public static StarshipEntry fetchByG_N(
		long groupId, String name, boolean useFinderCache) {

		return getPersistence().fetchByG_N(groupId, name, useFinderCache);
	}

	/**
	 * Removes the starship entry where groupId = &#63; and name = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the starship entry that was removed
	 */
	public static StarshipEntry removeByG_N(long groupId, String name)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().removeByG_N(groupId, name);
	}

	/**
	 * Returns the number of starship entries where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching starship entries
	 */
	public static int countByG_N(long groupId, String name) {
		return getPersistence().countByG_N(groupId, name);
	}

	/**
	 * Caches the starship entry in the entity cache if it is enabled.
	 *
	 * @param starshipEntry the starship entry
	 */
	public static void cacheResult(StarshipEntry starshipEntry) {
		getPersistence().cacheResult(starshipEntry);
	}

	/**
	 * Caches the starship entries in the entity cache if it is enabled.
	 *
	 * @param starshipEntries the starship entries
	 */
	public static void cacheResult(List<StarshipEntry> starshipEntries) {
		getPersistence().cacheResult(starshipEntries);
	}

	/**
	 * Creates a new starship entry with the primary key. Does not add the starship entry to the database.
	 *
	 * @param starshipEntryId the primary key for the new starship entry
	 * @return the new starship entry
	 */
	public static StarshipEntry create(long starshipEntryId) {
		return getPersistence().create(starshipEntryId);
	}

	/**
	 * Removes the starship entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry that was removed
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public static StarshipEntry remove(long starshipEntryId)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().remove(starshipEntryId);
	}

	public static StarshipEntry updateImpl(StarshipEntry starshipEntry) {
		return getPersistence().updateImpl(starshipEntry);
	}

	/**
	 * Returns the starship entry with the primary key or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public static StarshipEntry findByPrimaryKey(long starshipEntryId)
		throws com.liferay.starship.exception.NoSuchEntryException {

		return getPersistence().findByPrimaryKey(starshipEntryId);
	}

	/**
	 * Returns the starship entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry, or <code>null</code> if a starship entry with the primary key could not be found
	 */
	public static StarshipEntry fetchByPrimaryKey(long starshipEntryId) {
		return getPersistence().fetchByPrimaryKey(starshipEntryId);
	}

	/**
	 * Returns all the starship entries.
	 *
	 * @return the starship entries
	 */
	public static List<StarshipEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the starship entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @return the range of starship entries
	 */
	public static List<StarshipEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the starship entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of starship entries
	 */
	public static List<StarshipEntry> findAll(
		int start, int end,
		OrderByComparator<StarshipEntry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the starship entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StarshipEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of starship entries
	 * @param end the upper bound of the range of starship entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of starship entries
	 */
	public static List<StarshipEntry> findAll(
		int start, int end, OrderByComparator<StarshipEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the starship entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of starship entries.
	 *
	 * @return the number of starship entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StarshipEntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<StarshipEntryPersistence, StarshipEntryPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StarshipEntryPersistence.class);

		ServiceTracker<StarshipEntryPersistence, StarshipEntryPersistence>
			serviceTracker =
				new ServiceTracker
					<StarshipEntryPersistence, StarshipEntryPersistence>(
						bundle.getBundleContext(),
						StarshipEntryPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}