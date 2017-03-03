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

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tahir.customsql.model.TahirNoorKhaliq;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for TahirNoorKhaliq. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliqLocalServiceUtil
 * @see com.tahir.customsql.service.base.TahirNoorKhaliqLocalServiceBaseImpl
 * @see com.tahir.customsql.service.impl.TahirNoorKhaliqLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TahirNoorKhaliqLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TahirNoorKhaliqLocalServiceUtil} to access the tahir noor khaliq local service. Add custom service methods to {@link com.tahir.customsql.service.impl.TahirNoorKhaliqLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the tahir noor khaliq to the database. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public TahirNoorKhaliq addTahirNoorKhaliq(TahirNoorKhaliq tahirNoorKhaliq);

	/**
	* Creates a new tahir noor khaliq with the primary key. Does not add the tahir noor khaliq to the database.
	*
	* @param id the primary key for the new tahir noor khaliq
	* @return the new tahir noor khaliq
	*/
	public TahirNoorKhaliq createTahirNoorKhaliq(long id);

	/**
	* Deletes the tahir noor khaliq from the database. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public TahirNoorKhaliq deleteTahirNoorKhaliq(
		TahirNoorKhaliq tahirNoorKhaliq);

	/**
	* Deletes the tahir noor khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq that was removed
	* @throws PortalException if a tahir noor khaliq with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public TahirNoorKhaliq deleteTahirNoorKhaliq(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TahirNoorKhaliq fetchTahirNoorKhaliq(long id);

	/**
	* Returns the tahir noor khaliq matching the UUID and group.
	*
	* @param uuid the tahir noor khaliq's UUID
	* @param groupId the primary key of the group
	* @return the matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TahirNoorKhaliq fetchTahirNoorKhaliqByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	/**
	* Returns the tahir noor khaliq with the primary key.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq
	* @throws PortalException if a tahir noor khaliq with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TahirNoorKhaliq getTahirNoorKhaliq(long id)
		throws PortalException;

	/**
	* Returns the tahir noor khaliq matching the UUID and group.
	*
	* @param uuid the tahir noor khaliq's UUID
	* @param groupId the primary key of the group
	* @return the matching tahir noor khaliq
	* @throws PortalException if a matching tahir noor khaliq could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TahirNoorKhaliq getTahirNoorKhaliqByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	/**
	* Updates the tahir noor khaliq in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	* @return the tahir noor khaliq that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public TahirNoorKhaliq updateTahirNoorKhaliq(
		TahirNoorKhaliq tahirNoorKhaliq);

	/**
	* Returns the number of tahir noor khaliqs.
	*
	* @return the number of tahir noor khaliqs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTahirNoorKhaliqsCount();

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TahirNoorKhaliq> getAllEnteries();

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TahirNoorKhaliq> getTahirNoorKhaliqs(int start, int end);

	/**
	* Returns all the tahir noor khaliqs matching the UUID and company.
	*
	* @param uuid the UUID of the tahir noor khaliqs
	* @param companyId the primary key of the company
	* @return the matching tahir noor khaliqs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TahirNoorKhaliq> getTahirNoorKhaliqsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TahirNoorKhaliq> getTahirNoorKhaliqsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}