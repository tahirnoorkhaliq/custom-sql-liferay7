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

package com.tahir.customsql.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.tahir.customsql.model.TahirNoorKhaliq;

import java.util.List;

/**
 * The persistence utility for the tahir noor khaliq service. This utility wraps {@link com.tahir.customsql.service.persistence.impl.TahirNoorKhaliqPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliqPersistence
 * @see com.tahir.customsql.service.persistence.impl.TahirNoorKhaliqPersistenceImpl
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqUtil {
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
	public static void clearCache(TahirNoorKhaliq tahirNoorKhaliq) {
		getPersistence().clearCache(tahirNoorKhaliq);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TahirNoorKhaliq> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TahirNoorKhaliq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TahirNoorKhaliq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TahirNoorKhaliq update(TahirNoorKhaliq tahirNoorKhaliq) {
		return getPersistence().update(tahirNoorKhaliq);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TahirNoorKhaliq update(TahirNoorKhaliq tahirNoorKhaliq,
		ServiceContext serviceContext) {
		return getPersistence().update(tahirNoorKhaliq, serviceContext);
	}

	/**
	* Returns all the tahir noor khaliqs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the tahir noor khaliqs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @return the range of matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the tahir noor khaliqs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tahir noor khaliqs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first tahir noor khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq findByUuid_First(java.lang.String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first tahir noor khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last tahir noor khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq findByUuid_Last(java.lang.String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last tahir noor khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the tahir noor khaliqs before and after the current tahir noor khaliq in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current tahir noor khaliq
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	*/
	public static TahirNoorKhaliq[] findByUuid_PrevAndNext(long id,
		java.lang.String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id, uuid, orderByComparator);
	}

	/**
	* Removes all the tahir noor khaliqs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of tahir noor khaliqs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tahir noor khaliqs
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the tahir noor khaliq where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTahirNoorKhaliqException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tahir noor khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tahir noor khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the tahir noor khaliq where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the tahir noor khaliq that was removed
	*/
	public static TahirNoorKhaliq removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of tahir noor khaliqs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching tahir noor khaliqs
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the tahir noor khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the tahir noor khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @return the range of matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the tahir noor khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tahir noor khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first tahir noor khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first tahir noor khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tahir noor khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tahir noor khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	*/
	public static TahirNoorKhaliq fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the tahir noor khaliqs before and after the current tahir noor khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param id the primary key of the current tahir noor khaliq
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	*/
	public static TahirNoorKhaliq[] findByUuid_C_PrevAndNext(long id,
		java.lang.String uuid, long companyId,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(id, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the tahir noor khaliqs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of tahir noor khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching tahir noor khaliqs
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the tahir noor khaliq in the entity cache if it is enabled.
	*
	* @param tahirNoorKhaliq the tahir noor khaliq
	*/
	public static void cacheResult(TahirNoorKhaliq tahirNoorKhaliq) {
		getPersistence().cacheResult(tahirNoorKhaliq);
	}

	/**
	* Caches the tahir noor khaliqs in the entity cache if it is enabled.
	*
	* @param tahirNoorKhaliqs the tahir noor khaliqs
	*/
	public static void cacheResult(List<TahirNoorKhaliq> tahirNoorKhaliqs) {
		getPersistence().cacheResult(tahirNoorKhaliqs);
	}

	/**
	* Creates a new tahir noor khaliq with the primary key. Does not add the tahir noor khaliq to the database.
	*
	* @param id the primary key for the new tahir noor khaliq
	* @return the new tahir noor khaliq
	*/
	public static TahirNoorKhaliq create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tahir noor khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq that was removed
	* @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	*/
	public static TahirNoorKhaliq remove(long id)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence().remove(id);
	}

	public static TahirNoorKhaliq updateImpl(TahirNoorKhaliq tahirNoorKhaliq) {
		return getPersistence().updateImpl(tahirNoorKhaliq);
	}

	/**
	* Returns the tahir noor khaliq with the primary key or throws a {@link NoSuchTahirNoorKhaliqException} if it could not be found.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq
	* @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	*/
	public static TahirNoorKhaliq findByPrimaryKey(long id)
		throws com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tahir noor khaliq with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tahir noor khaliq
	* @return the tahir noor khaliq, or <code>null</code> if a tahir noor khaliq with the primary key could not be found
	*/
	public static TahirNoorKhaliq fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, TahirNoorKhaliq> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tahir noor khaliqs.
	*
	* @return the tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tahir noor khaliqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @return the range of tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tahir noor khaliqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findAll(int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tahir noor khaliqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TahirNoorKhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tahir noor khaliqs
	* @param end the upper bound of the range of tahir noor khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tahir noor khaliqs
	*/
	public static List<TahirNoorKhaliq> findAll(int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tahir noor khaliqs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tahir noor khaliqs.
	*
	* @return the number of tahir noor khaliqs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TahirNoorKhaliqPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TahirNoorKhaliqPersistence)PortletBeanLocatorUtil.locate(com.tahir.customsql.service.ClpSerializer.getServletContextName(),
					TahirNoorKhaliqPersistence.class.getName());

			ReferenceRegistry.registerReference(TahirNoorKhaliqUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static TahirNoorKhaliqPersistence _persistence;
}