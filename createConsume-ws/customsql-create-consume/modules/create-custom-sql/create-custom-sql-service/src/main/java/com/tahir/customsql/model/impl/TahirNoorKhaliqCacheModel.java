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

package com.tahir.customsql.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.tahir.customsql.model.TahirNoorKhaliq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TahirNoorKhaliq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliq
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqCacheModel implements CacheModel<TahirNoorKhaliq>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TahirNoorKhaliqCacheModel)) {
			return false;
		}

		TahirNoorKhaliqCacheModel tahirNoorKhaliqCacheModel = (TahirNoorKhaliqCacheModel)obj;

		if (id == tahirNoorKhaliqCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
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
		sb.append(", dob=");
		sb.append(dob);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TahirNoorKhaliq toEntityModel() {
		TahirNoorKhaliqImpl tahirNoorKhaliqImpl = new TahirNoorKhaliqImpl();

		if (uuid == null) {
			tahirNoorKhaliqImpl.setUuid(StringPool.BLANK);
		}
		else {
			tahirNoorKhaliqImpl.setUuid(uuid);
		}

		tahirNoorKhaliqImpl.setId(id);
		tahirNoorKhaliqImpl.setGroupId(groupId);
		tahirNoorKhaliqImpl.setCompanyId(companyId);
		tahirNoorKhaliqImpl.setUserId(userId);

		if (userName == null) {
			tahirNoorKhaliqImpl.setUserName(StringPool.BLANK);
		}
		else {
			tahirNoorKhaliqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tahirNoorKhaliqImpl.setCreateDate(null);
		}
		else {
			tahirNoorKhaliqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tahirNoorKhaliqImpl.setModifiedDate(null);
		}
		else {
			tahirNoorKhaliqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			tahirNoorKhaliqImpl.setName(StringPool.BLANK);
		}
		else {
			tahirNoorKhaliqImpl.setName(name);
		}

		if (dob == Long.MIN_VALUE) {
			tahirNoorKhaliqImpl.setDob(null);
		}
		else {
			tahirNoorKhaliqImpl.setDob(new Date(dob));
		}

		tahirNoorKhaliqImpl.resetOriginalValues();

		return tahirNoorKhaliqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		dob = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(dob);
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long dob;
}