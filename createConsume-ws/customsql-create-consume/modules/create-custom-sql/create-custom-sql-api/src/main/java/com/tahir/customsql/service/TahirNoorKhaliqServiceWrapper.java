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
 * Provides a wrapper for {@link TahirNoorKhaliqService}.
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliqService
 * @generated
 */
@ProviderType
public class TahirNoorKhaliqServiceWrapper implements TahirNoorKhaliqService,
	ServiceWrapper<TahirNoorKhaliqService> {
	public TahirNoorKhaliqServiceWrapper(
		TahirNoorKhaliqService tahirNoorKhaliqService) {
		_tahirNoorKhaliqService = tahirNoorKhaliqService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tahirNoorKhaliqService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tahirNoorKhaliqService.getOSGiServiceIdentifier();
	}

	@Override
	public TahirNoorKhaliqService getWrappedService() {
		return _tahirNoorKhaliqService;
	}

	@Override
	public void setWrappedService(TahirNoorKhaliqService tahirNoorKhaliqService) {
		_tahirNoorKhaliqService = tahirNoorKhaliqService;
	}

	private TahirNoorKhaliqService _tahirNoorKhaliqService;
}