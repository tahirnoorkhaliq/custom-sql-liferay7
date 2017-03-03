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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for TahirNoorKhaliq. This utility wraps
 * {@link com.tahir.customsql.service.impl.TahirNoorKhaliqLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliqLocalService
 * @see com.tahir.customsql.service.base.TahirNoorKhaliqLocalServiceBaseImpl
 * @see com.tahir.customsql.service.impl.TahirNoorKhaliqLocalServiceImpl
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.tahir.customsql.service.impl.TahirNoorKhaliqLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the tahir noor khaliq to the database. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was added
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq addTahirNoorKhaliq(
		com.tahir.customsql.model.TahirNoorKhaliq tahirNoorKhaliq) {
		return getService().addTahirNoorKhaliq(tahirNoorKhaliq);
	}

	/**
	* Creates a new tahir noor khaliq with the primary key. Does not add the tahir noor khaliq to the database.
	*
	* @param id the primary key for the new tahir noor khaliq
	* @return the new tahir noor khaliq
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq createTahirNoorKhaliq(
		long id) {
		return getService().createTahirNoorKhaliq(id);
	}

	/**
	* Deletes the tahir noor khaliq from the database. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was removed
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq deleteTahirNoorKhaliq(
		com.tahir.customsql.model.TahirNoorKhaliq tahirNoorKhaliq) {
		return getService().deleteTahirNoorKhaliq(tahirNoorKhaliq);
	}

	/**
	* Deletes the tahir noor khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq that was removed
	* @throws PortalException if a tahir noor khaliq with the primary key could not be found
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq deleteTahirNoorKhaliq(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTahirNoorKhaliq(id);
	}

	public static com.tahir.customsql.model.TahirNoorKhaliq fetchTahirNoorKhaliq(
		long id) {
		return getService().fetchTahirNoorKhaliq(id);
	}

	/**
	* Returns the tahir noor khaliq matching the UUID and group.
	*
	* @param uuid the tahir noor khaliq's UUID
	* @param groupId the primary key of the group
	* @return the matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq fetchTahirNoorKhaliqByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchTahirNoorKhaliqByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the tahir noor khaliq with the primary key.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq
	* @throws PortalException if a tahir noor khaliq with the primary key could not be found
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq getTahirNoorKhaliq(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTahirNoorKhaliq(id);
	}

	/**
	* Returns the tahir noor khaliq matching the UUID and group.
	*
	* @param uuid the tahir noor khaliq's UUID
	* @param groupId the primary key of the group
	* @return the matching tahir noor khaliq
	* @throws PortalException if a matching tahir noor khaliq could not be found
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq getTahirNoorKhaliqByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTahirNoorKhaliqByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the tahir noor khaliq in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was updated
	*/
	public static com.tahir.customsql.model.TahirNoorKhaliq updateTahirNoorKhaliq(
		com.tahir.customsql.model.TahirNoorKhaliq tahirNoorKhaliq) {
		return getService().updateTahirNoorKhaliq(tahirNoorKhaliq);
	}

	/**
	* Returns the number of tahir noor khaliqs.
	*
	* @return the number of tahir noor khaliqs
	*/
	public static int getTahirNoorKhaliqsCount() {
		return getService().getTahirNoorKhaliqsCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.customsql.model.impl.TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.customsql.model.impl.TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getAllEnteries() {
		return getService().getAllEnteries();
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
	public static java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getTahirNoorKhaliqs(
		int start, int end) {
		return getService().getTahirNoorKhaliqs(start, end);
	}

	/**
	* Returns all the tahir noor khaliqs matching the UUID and company.
	*
	* @param uuid the UUID of the tahir noor khaliqs
	* @param companyId the primary key of the company
	* @return the matching tahir noor khaliqs, or an empty list if no matches were found
	*/
	public static java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getTahirNoorKhaliqsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService()
				   .getTahirNoorKhaliqsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getTahirNoorKhaliqsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.tahir.customsql.model.TahirNoorKhaliq> orderByComparator) {
		return getService()
				   .getTahirNoorKhaliqsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
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

	public static void clearService() {
		_service = null;
	}

	public static TahirNoorKhaliqLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TahirNoorKhaliqLocalService.class.getName());

			if (invokableLocalService instanceof TahirNoorKhaliqLocalService) {
				_service = (TahirNoorKhaliqLocalService)invokableLocalService;
			}
			else {
				_service = new TahirNoorKhaliqLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TahirNoorKhaliqLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static TahirNoorKhaliqLocalService _service;
}