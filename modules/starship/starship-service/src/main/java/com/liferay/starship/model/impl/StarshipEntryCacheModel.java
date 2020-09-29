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

package com.liferay.starship.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.starship.model.StarshipEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StarshipEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StarshipEntryCacheModel
	implements CacheModel<StarshipEntry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StarshipEntryCacheModel)) {
			return false;
		}

		StarshipEntryCacheModel starshipEntryCacheModel =
			(StarshipEntryCacheModel)object;

		if (starshipEntryId == starshipEntryCacheModel.starshipEntryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, starshipEntryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", starshipEntryId=");
		sb.append(starshipEntryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", starshipFileImageId=");
		sb.append(starshipFileImageId);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StarshipEntry toEntityModel() {
		StarshipEntryImpl starshipEntryImpl = new StarshipEntryImpl();

		if (uuid == null) {
			starshipEntryImpl.setUuid("");
		}
		else {
			starshipEntryImpl.setUuid(uuid);
		}

		starshipEntryImpl.setStarshipEntryId(starshipEntryId);
		starshipEntryImpl.setGroupId(groupId);
		starshipEntryImpl.setCompanyId(companyId);
		starshipEntryImpl.setUserId(userId);

		if (userName == null) {
			starshipEntryImpl.setUserName("");
		}
		else {
			starshipEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			starshipEntryImpl.setCreateDate(null);
		}
		else {
			starshipEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			starshipEntryImpl.setModifiedDate(null);
		}
		else {
			starshipEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			starshipEntryImpl.setName("");
		}
		else {
			starshipEntryImpl.setName(name);
		}

		if (description == null) {
			starshipEntryImpl.setDescription("");
		}
		else {
			starshipEntryImpl.setDescription(description);
		}

		starshipEntryImpl.setStarshipFileImageId(starshipFileImageId);
		starshipEntryImpl.setStatus(status);

		starshipEntryImpl.resetOriginalValues();

		return starshipEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		starshipEntryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		starshipFileImageId = objectInput.readLong();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(starshipEntryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(starshipFileImageId);

		objectOutput.writeInt(status);
	}

	public String uuid;
	public long starshipEntryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public long starshipFileImageId;
	public int status;

}