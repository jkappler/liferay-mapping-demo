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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.starship.exception.NoSuchEntryException;
import com.liferay.starship.model.StarshipEntry;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the starship entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryUtil
 * @generated
 */
@ProviderType
public interface StarshipEntryPersistence
	extends BasePersistence<StarshipEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StarshipEntryUtil} to access the starship entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the starship entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching starship entries
	 */
	public java.util.List<StarshipEntry> findByUuid(String uuid);

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
	public java.util.List<StarshipEntry> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<StarshipEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

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
	public java.util.List<StarshipEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

	/**
	 * Returns the starship entries before and after the current starship entry in the ordered set where uuid = &#63;.
	 *
	 * @param starshipEntryId the primary key of the current starship entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public StarshipEntry[] findByUuid_PrevAndNext(
			long starshipEntryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the starship entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of starship entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching starship entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the starship entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchEntryException;

	/**
	 * Returns the starship entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the starship entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the starship entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the starship entry that was removed
	 */
	public StarshipEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchEntryException;

	/**
	 * Returns the number of starship entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching starship entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the starship entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching starship entries
	 */
	public java.util.List<StarshipEntry> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<StarshipEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<StarshipEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

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
	public java.util.List<StarshipEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last starship entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

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
	public StarshipEntry[] findByUuid_C_PrevAndNext(
			long starshipEntryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the starship entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of starship entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching starship entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the starship entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching starship entries
	 */
	public java.util.List<StarshipEntry> findByGroupId(long groupId);

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
	public java.util.List<StarshipEntry> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<StarshipEntry> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

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
	public java.util.List<StarshipEntry> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

	/**
	 * Returns the last starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

	/**
	 * Returns the starship entries before and after the current starship entry in the ordered set where groupId = &#63;.
	 *
	 * @param starshipEntryId the primary key of the current starship entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public StarshipEntry[] findByGroupId_PrevAndNext(
			long starshipEntryId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the starship entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of starship entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching starship entries
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the starship entries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching starship entries
	 */
	public java.util.List<StarshipEntry> findByCompanyId(long companyId);

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
	public java.util.List<StarshipEntry> findByCompanyId(
		long companyId, int start, int end);

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
	public java.util.List<StarshipEntry> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

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
	public java.util.List<StarshipEntry> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

	/**
	 * Returns the last starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

	/**
	 * Returns the starship entries before and after the current starship entry in the ordered set where companyId = &#63;.
	 *
	 * @param starshipEntryId the primary key of the current starship entry
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public StarshipEntry[] findByCompanyId_PrevAndNext(
			long starshipEntryId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the starship entries where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of starship entries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching starship entries
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns the starship entry where groupId = &#63; and name = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByG_N(long groupId, String name)
		throws NoSuchEntryException;

	/**
	 * Returns the starship entry where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByG_N(long groupId, String name);

	/**
	 * Returns the starship entry where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByG_N(
		long groupId, String name, boolean useFinderCache);

	/**
	 * Removes the starship entry where groupId = &#63; and name = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the starship entry that was removed
	 */
	public StarshipEntry removeByG_N(long groupId, String name)
		throws NoSuchEntryException;

	/**
	 * Returns the number of starship entries where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching starship entries
	 */
	public int countByG_N(long groupId, String name);

	/**
	 * Returns the starship entry where groupId = &#63; and urlTitle = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the matching starship entry
	 * @throws NoSuchEntryException if a matching starship entry could not be found
	 */
	public StarshipEntry findByG_U(long groupId, String urlTitle)
		throws NoSuchEntryException;

	/**
	 * Returns the starship entry where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByG_U(long groupId, String urlTitle);

	/**
	 * Returns the starship entry where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching starship entry, or <code>null</code> if a matching starship entry could not be found
	 */
	public StarshipEntry fetchByG_U(
		long groupId, String urlTitle, boolean useFinderCache);

	/**
	 * Removes the starship entry where groupId = &#63; and urlTitle = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the starship entry that was removed
	 */
	public StarshipEntry removeByG_U(long groupId, String urlTitle)
		throws NoSuchEntryException;

	/**
	 * Returns the number of starship entries where groupId = &#63; and urlTitle = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the number of matching starship entries
	 */
	public int countByG_U(long groupId, String urlTitle);

	/**
	 * Caches the starship entry in the entity cache if it is enabled.
	 *
	 * @param starshipEntry the starship entry
	 */
	public void cacheResult(StarshipEntry starshipEntry);

	/**
	 * Caches the starship entries in the entity cache if it is enabled.
	 *
	 * @param starshipEntries the starship entries
	 */
	public void cacheResult(java.util.List<StarshipEntry> starshipEntries);

	/**
	 * Creates a new starship entry with the primary key. Does not add the starship entry to the database.
	 *
	 * @param starshipEntryId the primary key for the new starship entry
	 * @return the new starship entry
	 */
	public StarshipEntry create(long starshipEntryId);

	/**
	 * Removes the starship entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry that was removed
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public StarshipEntry remove(long starshipEntryId)
		throws NoSuchEntryException;

	public StarshipEntry updateImpl(StarshipEntry starshipEntry);

	/**
	 * Returns the starship entry with the primary key or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry
	 * @throws NoSuchEntryException if a starship entry with the primary key could not be found
	 */
	public StarshipEntry findByPrimaryKey(long starshipEntryId)
		throws NoSuchEntryException;

	/**
	 * Returns the starship entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param starshipEntryId the primary key of the starship entry
	 * @return the starship entry, or <code>null</code> if a starship entry with the primary key could not be found
	 */
	public StarshipEntry fetchByPrimaryKey(long starshipEntryId);

	/**
	 * Returns all the starship entries.
	 *
	 * @return the starship entries
	 */
	public java.util.List<StarshipEntry> findAll();

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
	public java.util.List<StarshipEntry> findAll(int start, int end);

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
	public java.util.List<StarshipEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator);

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
	public java.util.List<StarshipEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarshipEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the starship entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of starship entries.
	 *
	 * @return the number of starship entries
	 */
	public int countAll();

}