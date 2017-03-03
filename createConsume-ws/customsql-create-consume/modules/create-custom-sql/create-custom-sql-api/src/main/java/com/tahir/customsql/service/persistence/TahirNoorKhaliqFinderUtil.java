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
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqFinderUtil {
	public static java.util.List<com.tahir.customsql.model.TahirNoorKhaliq> getTahirNoorKhaliq() {
		return getFinder().getTahirNoorKhaliq();
	}

	public static TahirNoorKhaliqFinder getFinder() {
		if (_finder == null) {
			_finder = (TahirNoorKhaliqFinder)PortletBeanLocatorUtil.locate(com.tahir.customsql.service.ClpSerializer.getServletContextName(),
					TahirNoorKhaliqFinder.class.getName());

			ReferenceRegistry.registerReference(TahirNoorKhaliqFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TahirNoorKhaliqFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TahirNoorKhaliqFinderUtil.class,
			"_finder");
	}

	private static TahirNoorKhaliqFinder _finder;
}