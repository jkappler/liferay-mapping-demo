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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.starship.service.http.StarshipEntryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class StarshipEntrySoap implements Serializable {

	public static StarshipEntrySoap toSoapModel(StarshipEntry model) {
		StarshipEntrySoap soapModel = new StarshipEntrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStarshipEntryId(model.getStarshipEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setStarshipFileImageId(model.getStarshipFileImageId());
		soapModel.setUrlTitle(model.getUrlTitle());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static StarshipEntrySoap[] toSoapModels(StarshipEntry[] models) {
		StarshipEntrySoap[] soapModels = new StarshipEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StarshipEntrySoap[][] toSoapModels(StarshipEntry[][] models) {
		StarshipEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StarshipEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new StarshipEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StarshipEntrySoap[] toSoapModels(List<StarshipEntry> models) {
		List<StarshipEntrySoap> soapModels = new ArrayList<StarshipEntrySoap>(
			models.size());

		for (StarshipEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StarshipEntrySoap[soapModels.size()]);
	}

	public StarshipEntrySoap() {
	}

	public long getPrimaryKey() {
		return _starshipEntryId;
	}

	public void setPrimaryKey(long pk) {
		setStarshipEntryId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStarshipEntryId() {
		return _starshipEntryId;
	}

	public void setStarshipEntryId(long starshipEntryId) {
		_starshipEntryId = starshipEntryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getStarshipFileImageId() {
		return _starshipFileImageId;
	}

	public void setStarshipFileImageId(long starshipFileImageId) {
		_starshipFileImageId = starshipFileImageId;
	}

	public String getUrlTitle() {
		return _urlTitle;
	}

	public void setUrlTitle(String urlTitle) {
		_urlTitle = urlTitle;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private String _uuid;
	private long _starshipEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private long _starshipFileImageId;
	private String _urlTitle;
	private int _status;

}