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

package com.tahir.customsql.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.tahir.customsql.exception.NoSuchTahirNoorKhaliqException;
import com.tahir.customsql.model.TahirNoorKhaliq;
import com.tahir.customsql.model.impl.TahirNoorKhaliqImpl;
import com.tahir.customsql.model.impl.TahirNoorKhaliqModelImpl;
import com.tahir.customsql.service.persistence.TahirNoorKhaliqPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the tahir noor khaliq service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliqPersistence
 * @see com.tahir.customsql.service.persistence.TahirNoorKhaliqUtil
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqPersistenceImpl extends BasePersistenceImpl<TahirNoorKhaliq>
	implements TahirNoorKhaliqPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TahirNoorKhaliqUtil} to access the tahir noor khaliq persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TahirNoorKhaliqImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TahirNoorKhaliqModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tahir noor khaliqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tahir noor khaliqs
	 */
	@Override
	public List<TahirNoorKhaliq> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TahirNoorKhaliq> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<TahirNoorKhaliq> findByUuid(String uuid, int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<TahirNoorKhaliq> findByUuid(String uuid, int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<TahirNoorKhaliq> list = null;

		if (retrieveFromCache) {
			list = (List<TahirNoorKhaliq>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TahirNoorKhaliq tahirNoorKhaliq : list) {
					if (!Objects.equals(uuid, tahirNoorKhaliq.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TAHIRNOORKHALIQ_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TahirNoorKhaliqModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<TahirNoorKhaliq>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TahirNoorKhaliq>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first tahir noor khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tahir noor khaliq
	 * @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq findByUuid_First(String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = fetchByUuid_First(uuid,
				orderByComparator);

		if (tahirNoorKhaliq != null) {
			return tahirNoorKhaliq;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTahirNoorKhaliqException(msg.toString());
	}

	/**
	 * Returns the first tahir noor khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByUuid_First(String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		List<TahirNoorKhaliq> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tahir noor khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tahir noor khaliq
	 * @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq findByUuid_Last(String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = fetchByUuid_Last(uuid,
				orderByComparator);

		if (tahirNoorKhaliq != null) {
			return tahirNoorKhaliq;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTahirNoorKhaliqException(msg.toString());
	}

	/**
	 * Returns the last tahir noor khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByUuid_Last(String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TahirNoorKhaliq> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TahirNoorKhaliq[] findByUuid_PrevAndNext(long id, String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TahirNoorKhaliq[] array = new TahirNoorKhaliqImpl[3];

			array[0] = getByUuid_PrevAndNext(session, tahirNoorKhaliq, uuid,
					orderByComparator, true);

			array[1] = tahirNoorKhaliq;

			array[2] = getByUuid_PrevAndNext(session, tahirNoorKhaliq, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TahirNoorKhaliq getByUuid_PrevAndNext(Session session,
		TahirNoorKhaliq tahirNoorKhaliq, String uuid,
		OrderByComparator<TahirNoorKhaliq> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TAHIRNOORKHALIQ_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TahirNoorKhaliqModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tahirNoorKhaliq);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TahirNoorKhaliq> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tahir noor khaliqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TahirNoorKhaliq tahirNoorKhaliq : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tahirNoorKhaliq);
		}
	}

	/**
	 * Returns the number of tahir noor khaliqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tahir noor khaliqs
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TAHIRNOORKHALIQ_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "tahirNoorKhaliq.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "tahirNoorKhaliq.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(tahirNoorKhaliq.uuid IS NULL OR tahirNoorKhaliq.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			TahirNoorKhaliqModelImpl.UUID_COLUMN_BITMASK |
			TahirNoorKhaliqModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the tahir noor khaliq where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTahirNoorKhaliqException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tahir noor khaliq
	 * @throws NoSuchTahirNoorKhaliqException if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq findByUUID_G(String uuid, long groupId)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = fetchByUUID_G(uuid, groupId);

		if (tahirNoorKhaliq == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTahirNoorKhaliqException(msg.toString());
		}

		return tahirNoorKhaliq;
	}

	/**
	 * Returns the tahir noor khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the tahir noor khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof TahirNoorKhaliq) {
			TahirNoorKhaliq tahirNoorKhaliq = (TahirNoorKhaliq)result;

			if (!Objects.equals(uuid, tahirNoorKhaliq.getUuid()) ||
					(groupId != tahirNoorKhaliq.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TAHIRNOORKHALIQ_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<TahirNoorKhaliq> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					TahirNoorKhaliq tahirNoorKhaliq = list.get(0);

					result = tahirNoorKhaliq;

					cacheResult(tahirNoorKhaliq);

					if ((tahirNoorKhaliq.getUuid() == null) ||
							!tahirNoorKhaliq.getUuid().equals(uuid) ||
							(tahirNoorKhaliq.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, tahirNoorKhaliq);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (TahirNoorKhaliq)result;
		}
	}

	/**
	 * Removes the tahir noor khaliq where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tahir noor khaliq that was removed
	 */
	@Override
	public TahirNoorKhaliq removeByUUID_G(String uuid, long groupId)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = findByUUID_G(uuid, groupId);

		return remove(tahirNoorKhaliq);
	}

	/**
	 * Returns the number of tahir noor khaliqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tahir noor khaliqs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TAHIRNOORKHALIQ_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "tahirNoorKhaliq.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "tahirNoorKhaliq.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(tahirNoorKhaliq.uuid IS NULL OR tahirNoorKhaliq.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "tahirNoorKhaliq.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			TahirNoorKhaliqModelImpl.UUID_COLUMN_BITMASK |
			TahirNoorKhaliqModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tahir noor khaliqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tahir noor khaliqs
	 */
	@Override
	public List<TahirNoorKhaliq> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<TahirNoorKhaliq> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<TahirNoorKhaliq> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<TahirNoorKhaliq> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<TahirNoorKhaliq> list = null;

		if (retrieveFromCache) {
			list = (List<TahirNoorKhaliq>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TahirNoorKhaliq tahirNoorKhaliq : list) {
					if (!Objects.equals(uuid, tahirNoorKhaliq.getUuid()) ||
							(companyId != tahirNoorKhaliq.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TAHIRNOORKHALIQ_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TahirNoorKhaliqModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<TahirNoorKhaliq>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TahirNoorKhaliq>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public TahirNoorKhaliq findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (tahirNoorKhaliq != null) {
			return tahirNoorKhaliq;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTahirNoorKhaliqException(msg.toString());
	}

	/**
	 * Returns the first tahir noor khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		List<TahirNoorKhaliq> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TahirNoorKhaliq findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (tahirNoorKhaliq != null) {
			return tahirNoorKhaliq;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTahirNoorKhaliqException(msg.toString());
	}

	/**
	 * Returns the last tahir noor khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tahir noor khaliq, or <code>null</code> if a matching tahir noor khaliq could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<TahirNoorKhaliq> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TahirNoorKhaliq[] findByUuid_C_PrevAndNext(long id, String uuid,
		long companyId, OrderByComparator<TahirNoorKhaliq> orderByComparator)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TahirNoorKhaliq[] array = new TahirNoorKhaliqImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, tahirNoorKhaliq, uuid,
					companyId, orderByComparator, true);

			array[1] = tahirNoorKhaliq;

			array[2] = getByUuid_C_PrevAndNext(session, tahirNoorKhaliq, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TahirNoorKhaliq getByUuid_C_PrevAndNext(Session session,
		TahirNoorKhaliq tahirNoorKhaliq, String uuid, long companyId,
		OrderByComparator<TahirNoorKhaliq> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TAHIRNOORKHALIQ_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TahirNoorKhaliqModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tahirNoorKhaliq);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TahirNoorKhaliq> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tahir noor khaliqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (TahirNoorKhaliq tahirNoorKhaliq : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tahirNoorKhaliq);
		}
	}

	/**
	 * Returns the number of tahir noor khaliqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tahir noor khaliqs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TAHIRNOORKHALIQ_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "tahirNoorKhaliq.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "tahirNoorKhaliq.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(tahirNoorKhaliq.uuid IS NULL OR tahirNoorKhaliq.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "tahirNoorKhaliq.companyId = ?";

	public TahirNoorKhaliqPersistenceImpl() {
		setModelClass(TahirNoorKhaliq.class);
	}

	/**
	 * Caches the tahir noor khaliq in the entity cache if it is enabled.
	 *
	 * @param tahirNoorKhaliq the tahir noor khaliq
	 */
	@Override
	public void cacheResult(TahirNoorKhaliq tahirNoorKhaliq) {
		entityCache.putResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class, tahirNoorKhaliq.getPrimaryKey(),
			tahirNoorKhaliq);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { tahirNoorKhaliq.getUuid(), tahirNoorKhaliq.getGroupId() },
			tahirNoorKhaliq);

		tahirNoorKhaliq.resetOriginalValues();
	}

	/**
	 * Caches the tahir noor khaliqs in the entity cache if it is enabled.
	 *
	 * @param tahirNoorKhaliqs the tahir noor khaliqs
	 */
	@Override
	public void cacheResult(List<TahirNoorKhaliq> tahirNoorKhaliqs) {
		for (TahirNoorKhaliq tahirNoorKhaliq : tahirNoorKhaliqs) {
			if (entityCache.getResult(
						TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
						TahirNoorKhaliqImpl.class,
						tahirNoorKhaliq.getPrimaryKey()) == null) {
				cacheResult(tahirNoorKhaliq);
			}
			else {
				tahirNoorKhaliq.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tahir noor khaliqs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TahirNoorKhaliqImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tahir noor khaliq.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TahirNoorKhaliq tahirNoorKhaliq) {
		entityCache.removeResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class, tahirNoorKhaliq.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TahirNoorKhaliqModelImpl)tahirNoorKhaliq);
	}

	@Override
	public void clearCache(List<TahirNoorKhaliq> tahirNoorKhaliqs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TahirNoorKhaliq tahirNoorKhaliq : tahirNoorKhaliqs) {
			entityCache.removeResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
				TahirNoorKhaliqImpl.class, tahirNoorKhaliq.getPrimaryKey());

			clearUniqueFindersCache((TahirNoorKhaliqModelImpl)tahirNoorKhaliq);
		}
	}

	protected void cacheUniqueFindersCache(
		TahirNoorKhaliqModelImpl tahirNoorKhaliqModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					tahirNoorKhaliqModelImpl.getUuid(),
					tahirNoorKhaliqModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				tahirNoorKhaliqModelImpl);
		}
		else {
			if ((tahirNoorKhaliqModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tahirNoorKhaliqModelImpl.getUuid(),
						tahirNoorKhaliqModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					tahirNoorKhaliqModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TahirNoorKhaliqModelImpl tahirNoorKhaliqModelImpl) {
		Object[] args = new Object[] {
				tahirNoorKhaliqModelImpl.getUuid(),
				tahirNoorKhaliqModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((tahirNoorKhaliqModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					tahirNoorKhaliqModelImpl.getOriginalUuid(),
					tahirNoorKhaliqModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new tahir noor khaliq with the primary key. Does not add the tahir noor khaliq to the database.
	 *
	 * @param id the primary key for the new tahir noor khaliq
	 * @return the new tahir noor khaliq
	 */
	@Override
	public TahirNoorKhaliq create(long id) {
		TahirNoorKhaliq tahirNoorKhaliq = new TahirNoorKhaliqImpl();

		tahirNoorKhaliq.setNew(true);
		tahirNoorKhaliq.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		tahirNoorKhaliq.setUuid(uuid);

		tahirNoorKhaliq.setCompanyId(companyProvider.getCompanyId());

		return tahirNoorKhaliq;
	}

	/**
	 * Removes the tahir noor khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tahir noor khaliq
	 * @return the tahir noor khaliq that was removed
	 * @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	 */
	@Override
	public TahirNoorKhaliq remove(long id)
		throws NoSuchTahirNoorKhaliqException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tahir noor khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tahir noor khaliq
	 * @return the tahir noor khaliq that was removed
	 * @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	 */
	@Override
	public TahirNoorKhaliq remove(Serializable primaryKey)
		throws NoSuchTahirNoorKhaliqException {
		Session session = null;

		try {
			session = openSession();

			TahirNoorKhaliq tahirNoorKhaliq = (TahirNoorKhaliq)session.get(TahirNoorKhaliqImpl.class,
					primaryKey);

			if (tahirNoorKhaliq == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTahirNoorKhaliqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tahirNoorKhaliq);
		}
		catch (NoSuchTahirNoorKhaliqException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TahirNoorKhaliq removeImpl(TahirNoorKhaliq tahirNoorKhaliq) {
		tahirNoorKhaliq = toUnwrappedModel(tahirNoorKhaliq);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tahirNoorKhaliq)) {
				tahirNoorKhaliq = (TahirNoorKhaliq)session.get(TahirNoorKhaliqImpl.class,
						tahirNoorKhaliq.getPrimaryKeyObj());
			}

			if (tahirNoorKhaliq != null) {
				session.delete(tahirNoorKhaliq);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tahirNoorKhaliq != null) {
			clearCache(tahirNoorKhaliq);
		}

		return tahirNoorKhaliq;
	}

	@Override
	public TahirNoorKhaliq updateImpl(TahirNoorKhaliq tahirNoorKhaliq) {
		tahirNoorKhaliq = toUnwrappedModel(tahirNoorKhaliq);

		boolean isNew = tahirNoorKhaliq.isNew();

		TahirNoorKhaliqModelImpl tahirNoorKhaliqModelImpl = (TahirNoorKhaliqModelImpl)tahirNoorKhaliq;

		if (Validator.isNull(tahirNoorKhaliq.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			tahirNoorKhaliq.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (tahirNoorKhaliq.getCreateDate() == null)) {
			if (serviceContext == null) {
				tahirNoorKhaliq.setCreateDate(now);
			}
			else {
				tahirNoorKhaliq.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!tahirNoorKhaliqModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tahirNoorKhaliq.setModifiedDate(now);
			}
			else {
				tahirNoorKhaliq.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (tahirNoorKhaliq.isNew()) {
				session.save(tahirNoorKhaliq);

				tahirNoorKhaliq.setNew(false);
			}
			else {
				tahirNoorKhaliq = (TahirNoorKhaliq)session.merge(tahirNoorKhaliq);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TahirNoorKhaliqModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tahirNoorKhaliqModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tahirNoorKhaliqModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { tahirNoorKhaliqModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((tahirNoorKhaliqModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tahirNoorKhaliqModelImpl.getOriginalUuid(),
						tahirNoorKhaliqModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						tahirNoorKhaliqModelImpl.getUuid(),
						tahirNoorKhaliqModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
			TahirNoorKhaliqImpl.class, tahirNoorKhaliq.getPrimaryKey(),
			tahirNoorKhaliq, false);

		clearUniqueFindersCache(tahirNoorKhaliqModelImpl);
		cacheUniqueFindersCache(tahirNoorKhaliqModelImpl, isNew);

		tahirNoorKhaliq.resetOriginalValues();

		return tahirNoorKhaliq;
	}

	protected TahirNoorKhaliq toUnwrappedModel(TahirNoorKhaliq tahirNoorKhaliq) {
		if (tahirNoorKhaliq instanceof TahirNoorKhaliqImpl) {
			return tahirNoorKhaliq;
		}

		TahirNoorKhaliqImpl tahirNoorKhaliqImpl = new TahirNoorKhaliqImpl();

		tahirNoorKhaliqImpl.setNew(tahirNoorKhaliq.isNew());
		tahirNoorKhaliqImpl.setPrimaryKey(tahirNoorKhaliq.getPrimaryKey());

		tahirNoorKhaliqImpl.setUuid(tahirNoorKhaliq.getUuid());
		tahirNoorKhaliqImpl.setId(tahirNoorKhaliq.getId());
		tahirNoorKhaliqImpl.setGroupId(tahirNoorKhaliq.getGroupId());
		tahirNoorKhaliqImpl.setCompanyId(tahirNoorKhaliq.getCompanyId());
		tahirNoorKhaliqImpl.setUserId(tahirNoorKhaliq.getUserId());
		tahirNoorKhaliqImpl.setUserName(tahirNoorKhaliq.getUserName());
		tahirNoorKhaliqImpl.setCreateDate(tahirNoorKhaliq.getCreateDate());
		tahirNoorKhaliqImpl.setModifiedDate(tahirNoorKhaliq.getModifiedDate());
		tahirNoorKhaliqImpl.setName(tahirNoorKhaliq.getName());
		tahirNoorKhaliqImpl.setDob(tahirNoorKhaliq.getDob());

		return tahirNoorKhaliqImpl;
	}

	/**
	 * Returns the tahir noor khaliq with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tahir noor khaliq
	 * @return the tahir noor khaliq
	 * @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	 */
	@Override
	public TahirNoorKhaliq findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTahirNoorKhaliqException {
		TahirNoorKhaliq tahirNoorKhaliq = fetchByPrimaryKey(primaryKey);

		if (tahirNoorKhaliq == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTahirNoorKhaliqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tahirNoorKhaliq;
	}

	/**
	 * Returns the tahir noor khaliq with the primary key or throws a {@link NoSuchTahirNoorKhaliqException} if it could not be found.
	 *
	 * @param id the primary key of the tahir noor khaliq
	 * @return the tahir noor khaliq
	 * @throws NoSuchTahirNoorKhaliqException if a tahir noor khaliq with the primary key could not be found
	 */
	@Override
	public TahirNoorKhaliq findByPrimaryKey(long id)
		throws NoSuchTahirNoorKhaliqException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tahir noor khaliq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tahir noor khaliq
	 * @return the tahir noor khaliq, or <code>null</code> if a tahir noor khaliq with the primary key could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
				TahirNoorKhaliqImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TahirNoorKhaliq tahirNoorKhaliq = (TahirNoorKhaliq)serializable;

		if (tahirNoorKhaliq == null) {
			Session session = null;

			try {
				session = openSession();

				tahirNoorKhaliq = (TahirNoorKhaliq)session.get(TahirNoorKhaliqImpl.class,
						primaryKey);

				if (tahirNoorKhaliq != null) {
					cacheResult(tahirNoorKhaliq);
				}
				else {
					entityCache.putResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
						TahirNoorKhaliqImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
					TahirNoorKhaliqImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tahirNoorKhaliq;
	}

	/**
	 * Returns the tahir noor khaliq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tahir noor khaliq
	 * @return the tahir noor khaliq, or <code>null</code> if a tahir noor khaliq with the primary key could not be found
	 */
	@Override
	public TahirNoorKhaliq fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, TahirNoorKhaliq> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TahirNoorKhaliq> map = new HashMap<Serializable, TahirNoorKhaliq>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TahirNoorKhaliq tahirNoorKhaliq = fetchByPrimaryKey(primaryKey);

			if (tahirNoorKhaliq != null) {
				map.put(primaryKey, tahirNoorKhaliq);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
					TahirNoorKhaliqImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TahirNoorKhaliq)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TAHIRNOORKHALIQ_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (TahirNoorKhaliq tahirNoorKhaliq : (List<TahirNoorKhaliq>)q.list()) {
				map.put(tahirNoorKhaliq.getPrimaryKeyObj(), tahirNoorKhaliq);

				cacheResult(tahirNoorKhaliq);

				uncachedPrimaryKeys.remove(tahirNoorKhaliq.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TahirNoorKhaliqModelImpl.ENTITY_CACHE_ENABLED,
					TahirNoorKhaliqImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the tahir noor khaliqs.
	 *
	 * @return the tahir noor khaliqs
	 */
	@Override
	public List<TahirNoorKhaliq> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TahirNoorKhaliq> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TahirNoorKhaliq> findAll(int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TahirNoorKhaliq> findAll(int start, int end,
		OrderByComparator<TahirNoorKhaliq> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TahirNoorKhaliq> list = null;

		if (retrieveFromCache) {
			list = (List<TahirNoorKhaliq>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TAHIRNOORKHALIQ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TAHIRNOORKHALIQ;

				if (pagination) {
					sql = sql.concat(TahirNoorKhaliqModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TahirNoorKhaliq>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TahirNoorKhaliq>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tahir noor khaliqs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TahirNoorKhaliq tahirNoorKhaliq : findAll()) {
			remove(tahirNoorKhaliq);
		}
	}

	/**
	 * Returns the number of tahir noor khaliqs.
	 *
	 * @return the number of tahir noor khaliqs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TAHIRNOORKHALIQ);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TahirNoorKhaliqModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tahir noor khaliq persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TahirNoorKhaliqImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TAHIRNOORKHALIQ = "SELECT tahirNoorKhaliq FROM TahirNoorKhaliq tahirNoorKhaliq";
	private static final String _SQL_SELECT_TAHIRNOORKHALIQ_WHERE_PKS_IN = "SELECT tahirNoorKhaliq FROM TahirNoorKhaliq tahirNoorKhaliq WHERE id_ IN (";
	private static final String _SQL_SELECT_TAHIRNOORKHALIQ_WHERE = "SELECT tahirNoorKhaliq FROM TahirNoorKhaliq tahirNoorKhaliq WHERE ";
	private static final String _SQL_COUNT_TAHIRNOORKHALIQ = "SELECT COUNT(tahirNoorKhaliq) FROM TahirNoorKhaliq tahirNoorKhaliq";
	private static final String _SQL_COUNT_TAHIRNOORKHALIQ_WHERE = "SELECT COUNT(tahirNoorKhaliq) FROM TahirNoorKhaliq tahirNoorKhaliq WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tahirNoorKhaliq.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TahirNoorKhaliq exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TahirNoorKhaliq exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TahirNoorKhaliqPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "id"
			});
}