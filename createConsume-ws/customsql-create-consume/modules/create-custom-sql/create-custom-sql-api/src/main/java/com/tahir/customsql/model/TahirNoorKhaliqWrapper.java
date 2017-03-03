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

package com.tahir.customsql.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TahirNoorKhaliq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliq
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqWrapper implements TahirNoorKhaliq,
	ModelWrapper<TahirNoorKhaliq> {
	public TahirNoorKhaliqWrapper(TahirNoorKhaliq tahirNoorKhaliq) {
		_tahirNoorKhaliq = tahirNoorKhaliq;
	}

	@Override
	public Class<?> getModelClass() {
		return TahirNoorKhaliq.class;
	}

	@Override
	public String getModelClassName() {
		return TahirNoorKhaliq.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("dob", getDob());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}
	}

	@Override
	public TahirNoorKhaliq toEscapedModel() {
		return new TahirNoorKhaliqWrapper(_tahirNoorKhaliq.toEscapedModel());
	}

	@Override
	public TahirNoorKhaliq toUnescapedModel() {
		return new TahirNoorKhaliqWrapper(_tahirNoorKhaliq.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _tahirNoorKhaliq.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tahirNoorKhaliq.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tahirNoorKhaliq.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tahirNoorKhaliq.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<TahirNoorKhaliq> toCacheModel() {
		return _tahirNoorKhaliq.toCacheModel();
	}

	@Override
	public int compareTo(TahirNoorKhaliq tahirNoorKhaliq) {
		return _tahirNoorKhaliq.compareTo(tahirNoorKhaliq);
	}

	@Override
	public int hashCode() {
		return _tahirNoorKhaliq.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tahirNoorKhaliq.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TahirNoorKhaliqWrapper((TahirNoorKhaliq)_tahirNoorKhaliq.clone());
	}

	/**
	* Returns the name of this tahir noor khaliq.
	*
	* @return the name of this tahir noor khaliq
	*/
	@Override
	public java.lang.String getName() {
		return _tahirNoorKhaliq.getName();
	}

	/**
	* Returns the user name of this tahir noor khaliq.
	*
	* @return the user name of this tahir noor khaliq
	*/
	@Override
	public java.lang.String getUserName() {
		return _tahirNoorKhaliq.getUserName();
	}

	/**
	* Returns the user uuid of this tahir noor khaliq.
	*
	* @return the user uuid of this tahir noor khaliq
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _tahirNoorKhaliq.getUserUuid();
	}

	/**
	* Returns the uuid of this tahir noor khaliq.
	*
	* @return the uuid of this tahir noor khaliq
	*/
	@Override
	public java.lang.String getUuid() {
		return _tahirNoorKhaliq.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _tahirNoorKhaliq.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tahirNoorKhaliq.toXmlString();
	}

	/**
	* Returns the create date of this tahir noor khaliq.
	*
	* @return the create date of this tahir noor khaliq
	*/
	@Override
	public Date getCreateDate() {
		return _tahirNoorKhaliq.getCreateDate();
	}

	/**
	* Returns the dob of this tahir noor khaliq.
	*
	* @return the dob of this tahir noor khaliq
	*/
	@Override
	public Date getDob() {
		return _tahirNoorKhaliq.getDob();
	}

	/**
	* Returns the modified date of this tahir noor khaliq.
	*
	* @return the modified date of this tahir noor khaliq
	*/
	@Override
	public Date getModifiedDate() {
		return _tahirNoorKhaliq.getModifiedDate();
	}

	/**
	* Returns the company ID of this tahir noor khaliq.
	*
	* @return the company ID of this tahir noor khaliq
	*/
	@Override
	public long getCompanyId() {
		return _tahirNoorKhaliq.getCompanyId();
	}

	/**
	* Returns the group ID of this tahir noor khaliq.
	*
	* @return the group ID of this tahir noor khaliq
	*/
	@Override
	public long getGroupId() {
		return _tahirNoorKhaliq.getGroupId();
	}

	/**
	* Returns the ID of this tahir noor khaliq.
	*
	* @return the ID of this tahir noor khaliq
	*/
	@Override
	public long getId() {
		return _tahirNoorKhaliq.getId();
	}

	/**
	* Returns the primary key of this tahir noor khaliq.
	*
	* @return the primary key of this tahir noor khaliq
	*/
	@Override
	public long getPrimaryKey() {
		return _tahirNoorKhaliq.getPrimaryKey();
	}

	/**
	* Returns the user ID of this tahir noor khaliq.
	*
	* @return the user ID of this tahir noor khaliq
	*/
	@Override
	public long getUserId() {
		return _tahirNoorKhaliq.getUserId();
	}

	@Override
	public void persist() {
		_tahirNoorKhaliq.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tahirNoorKhaliq.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this tahir noor khaliq.
	*
	* @param companyId the company ID of this tahir noor khaliq
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tahirNoorKhaliq.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this tahir noor khaliq.
	*
	* @param createDate the create date of this tahir noor khaliq
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_tahirNoorKhaliq.setCreateDate(createDate);
	}

	/**
	* Sets the dob of this tahir noor khaliq.
	*
	* @param dob the dob of this tahir noor khaliq
	*/
	@Override
	public void setDob(Date dob) {
		_tahirNoorKhaliq.setDob(dob);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tahirNoorKhaliq.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tahirNoorKhaliq.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tahirNoorKhaliq.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this tahir noor khaliq.
	*
	* @param groupId the group ID of this tahir noor khaliq
	*/
	@Override
	public void setGroupId(long groupId) {
		_tahirNoorKhaliq.setGroupId(groupId);
	}

	/**
	* Sets the ID of this tahir noor khaliq.
	*
	* @param id the ID of this tahir noor khaliq
	*/
	@Override
	public void setId(long id) {
		_tahirNoorKhaliq.setId(id);
	}

	/**
	* Sets the modified date of this tahir noor khaliq.
	*
	* @param modifiedDate the modified date of this tahir noor khaliq
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_tahirNoorKhaliq.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this tahir noor khaliq.
	*
	* @param name the name of this tahir noor khaliq
	*/
	@Override
	public void setName(java.lang.String name) {
		_tahirNoorKhaliq.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_tahirNoorKhaliq.setNew(n);
	}

	/**
	* Sets the primary key of this tahir noor khaliq.
	*
	* @param primaryKey the primary key of this tahir noor khaliq
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tahirNoorKhaliq.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tahirNoorKhaliq.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this tahir noor khaliq.
	*
	* @param userId the user ID of this tahir noor khaliq
	*/
	@Override
	public void setUserId(long userId) {
		_tahirNoorKhaliq.setUserId(userId);
	}

	/**
	* Sets the user name of this tahir noor khaliq.
	*
	* @param userName the user name of this tahir noor khaliq
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tahirNoorKhaliq.setUserName(userName);
	}

	/**
	* Sets the user uuid of this tahir noor khaliq.
	*
	* @param userUuid the user uuid of this tahir noor khaliq
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_tahirNoorKhaliq.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this tahir noor khaliq.
	*
	* @param uuid the uuid of this tahir noor khaliq
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_tahirNoorKhaliq.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TahirNoorKhaliqWrapper)) {
			return false;
		}

		TahirNoorKhaliqWrapper tahirNoorKhaliqWrapper = (TahirNoorKhaliqWrapper)obj;

		if (Objects.equals(_tahirNoorKhaliq,
					tahirNoorKhaliqWrapper._tahirNoorKhaliq)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _tahirNoorKhaliq.getStagedModelType();
	}

	@Override
	public TahirNoorKhaliq getWrappedModel() {
		return _tahirNoorKhaliq;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tahirNoorKhaliq.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tahirNoorKhaliq.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tahirNoorKhaliq.resetOriginalValues();
	}

	private final TahirNoorKhaliq _tahirNoorKhaliq;
}