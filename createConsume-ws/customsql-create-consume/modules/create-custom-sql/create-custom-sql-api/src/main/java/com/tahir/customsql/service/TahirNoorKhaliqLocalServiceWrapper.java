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

package com.tahir.customsql.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TahirNoorKhaliqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliqLocalService
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqLocalServiceWrapper
	implements TahirNoorKhaliqLocalService,
		ServiceWrapper<TahirNoorKhaliqLocalService> {
	public TahirNoorKhaliqLocalServiceWrapper(
		TahirNoorKhaliqLocalService tahirNoorKhaliqLocalService) {
		_tahirNoorKhaliqLocalService = tahirNoorKhaliqLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tahirNoorKhaliqLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tahirNoorKhaliqLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _tahirNoorKhaliqLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tahirNoorKhaliqLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tahirNoorKhaliqLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tahirNoorKhaliqLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the tahir noor khaliq to the database. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was added
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq addTahirNoorKhaliq(
		com.tahir.customsql.model.TahirNoorKhaliq tahirNoorKhaliq) {
		return _tahirNoorKhaliqLocalService.addTahirNoorKhaliq(tahirNoorKhaliq);
	}

	/**
	* Creates a new tahir noor khaliq with the primary key. Does not add the tahir noor khaliq to the database.
	*
	* @param id the primary key for the new tahir noor khaliq
	* @return the new tahir noor khaliq
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq createTahirNoorKhaliq(
		long id) {
		return _tahirNoorKhaliqLocalService.createTahirNoorKhaliq(id);
	}

	/**
	* Deletes the tahir noor khaliq from the database. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was removed
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq deleteTahirNoorKhaliq(
		com.tahir.customsql.model.TahirNoorKhaliq tahirNoorKhaliq) {
		return _tahirNoorKhaliqLocalService.deleteTahirNoorKhaliq(tahirNoorKhaliq);
	}

	/**
	* Deletes the tahir noor khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq that was removed
	* @throws PortalException if a tahir noor khaliq with the primary key could not be found
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq deleteTahirNoorKhaliq(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _tahirNoorKhaliqLocalService.deleteTahirNoorKhaliq(id);
	}

	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq fetchTahirNoorKhaliq(
		long id) {
		return _tahirNoorKhaliqLocalService.fetchTahirNoorKhaliq(id);
	}

	/**
	* Returns the tahir noor khaliq matching the UUID and group.
	*
	* @param uuid the tahir noor khaliq's UUID
	* @param groupId the primary key of the group
	* @return the matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq fetchTahirNoorKhaliqByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _tahirNoorKhaliqLocalService.fetchTahirNoorKhaliqByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the tahir noor khaliq with the primary key.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq
	* @throws PortalException if a tahir noor khaliq with the primary key could not be found
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq getTahirNoorKhaliq(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tahirNoorKhaliqLocalService.getTahirNoorKhaliq(id);
	}

	/**
	* Returns the tahir noor khaliq matching the UUID and group.
	*
	* @param uuid the tahir noor khaliq's UUID
	* @param groupId the primary key of the group
	* @return the matching tahir noor khaliq
	* @throws PortalException if a matching tahir noor khaliq could not be found
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq getTahirNoorKhaliqByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tahirNoorKhaliqLocalService.getTahirNoorKhaliqByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the tahir noor khaliq in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was updated
	*/
	@Override
	public com.tahir.customsql.model.TahirNoorKhaliq updateTahirNoorKhaliq(
		com.tahir.customsql.model.TahirNoorKhaliq tahirNoorKhaliq) {
		return _tahirNoorKhaliqLocalService.updateTahirNoorKhaliq(tahirNoorKhaliq);
	}

	/**
	* Returns the number of tahir noor khaliqs.
	*
	* @return the number of tahir noor khaliqs
	*/
	@Override
	public int getTahirNoorKhaliqsCount() {
		return _tahirNoorKhaliqLocalService.getTahirNoorKhaliqsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tahirNoorKhaliqLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tahirNoorKhaliqLocalService.getOSGiServiceIdentifier();
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
		return _tahirNoorKhaliqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.customsql.model.impl.TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tahirNoorKhaliqLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.customsql.model.impl.TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tahirNoorKhaliqLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getAllEnteries() {
		return _tahirNoorKhaliqLocalService.getAllEnteries();
	}

	/**
	* Returns a range of all the tahir noor khaliqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.customsql.model.impl.TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @return the range of tahir noor khaliqs
	*/
	@Override
	public java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getTahirNoorKhaliqs(
		int start, int end) {
		return _tahirNoorKhaliqLocalService.getTahirNoorKhaliqs(start, end);
	}

	/**
	* Returns all the tahir noor khaliqs matching the UUID and company.
	*
	* @param uuid the UUID of the tahir noor khaliqs
	* @param companyId the primary key of the company
	* @return the matching tahir noor khaliqs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getTahirNoorKhaliqsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _tahirNoorKhaliqLocalService.getTahirNoorKhaliqsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of tahir noor khaliqs matching the UUID and company.
	*
	* @param uuid the UUID of the tahir noor khaliqs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching tahir noor khaliqs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getTahirNoorKhaliqsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.tahir.customsql.model.TahirNoorKhaliq> orderByComparator) {
		return _tahirNoorKhaliqLocalService.getTahirNoorKhaliqsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _tahirNoorKhaliqLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tahirNoorKhaliqLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public TahirNoorKhaliqLocalService getWrappedService() {
		return _tahirNoorKhaliqLocalService;
	}

	@Override
	public void setWrappedService(
		TahirNoorKhaliqLocalService tahirNoorKhaliqLocalService) {
		_tahirNoorKhaliqLocalService = tahirNoorKhaliqLocalService;
	}

	private TahirNoorKhaliqLocalService _tahirNoorKhaliqLocalService;
}