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

package com.liferay.starship.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StarshipEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntry
 * @generated
 */
public class StarshipEntryWrapper
	extends BaseModelWrapper<StarshipEntry>
	implements ModelWrapper<StarshipEntry>, StarshipEntry {

	public StarshipEntryWrapper(StarshipEntry starshipEntry) {
		super(starshipEntry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("starshipEntryId", getStarshipEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("starshipFileImageId", getStarshipFileImageId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long starshipEntryId = (Long)attributes.get("starshipEntryId");

		if (starshipEntryId != null) {
			setStarshipEntryId(starshipEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long starshipFileImageId = (Long)attributes.get("starshipFileImageId");

		if (starshipFileImageId != null) {
			setStarshipFileImageId(starshipFileImageId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	 * Returns the company ID of this starship entry.
	 *
	 * @return the company ID of this starship entry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this starship entry.
	 *
	 * @return the create date of this starship entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this starship entry.
	 *
	 * @return the description of this starship entry
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this starship entry.
	 *
	 * @return the group ID of this starship entry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this starship entry.
	 *
	 * @return the modified date of this starship entry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this starship entry.
	 *
	 * @return the name of this starship entry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this starship entry.
	 *
	 * @return the primary key of this starship entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the starship entry ID of this starship entry.
	 *
	 * @return the starship entry ID of this starship entry
	 */
	@Override
	public long getStarshipEntryId() {
		return model.getStarshipEntryId();
	}

	/**
	 * Returns the starship file image ID of this starship entry.
	 *
	 * @return the starship file image ID of this starship entry
	 */
	@Override
	public long getStarshipFileImageId() {
		return model.getStarshipFileImageId();
	}

	@Override
	public String getStarshipImageURL(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay) {

		return model.getStarshipImageURL(themeDisplay);
	}

	/**
	 * Returns the status of this starship entry.
	 *
	 * @return the status of this starship entry
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this starship entry.
	 *
	 * @return the user ID of this starship entry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this starship entry.
	 *
	 * @return the user name of this starship entry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this starship entry.
	 *
	 * @return the user uuid of this starship entry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this starship entry.
	 *
	 * @return the uuid of this starship entry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this starship entry.
	 *
	 * @param companyId the company ID of this starship entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this starship entry.
	 *
	 * @param createDate the create date of this starship entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this starship entry.
	 *
	 * @param description the description of this starship entry
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this starship entry.
	 *
	 * @param groupId the group ID of this starship entry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this starship entry.
	 *
	 * @param modifiedDate the modified date of this starship entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this starship entry.
	 *
	 * @param name the name of this starship entry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this starship entry.
	 *
	 * @param primaryKey the primary key of this starship entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the starship entry ID of this starship entry.
	 *
	 * @param starshipEntryId the starship entry ID of this starship entry
	 */
	@Override
	public void setStarshipEntryId(long starshipEntryId) {
		model.setStarshipEntryId(starshipEntryId);
	}

	/**
	 * Sets the starship file image ID of this starship entry.
	 *
	 * @param starshipFileImageId the starship file image ID of this starship entry
	 */
	@Override
	public void setStarshipFileImageId(long starshipFileImageId) {
		model.setStarshipFileImageId(starshipFileImageId);
	}

	/**
	 * Sets the status of this starship entry.
	 *
	 * @param status the status of this starship entry
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this starship entry.
	 *
	 * @param userId the user ID of this starship entry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this starship entry.
	 *
	 * @param userName the user name of this starship entry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this starship entry.
	 *
	 * @param userUuid the user uuid of this starship entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this starship entry.
	 *
	 * @param uuid the uuid of this starship entry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected StarshipEntryWrapper wrap(StarshipEntry starshipEntry) {
		return new StarshipEntryWrapper(starshipEntry);
	}

}