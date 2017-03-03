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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the TahirNoorKhaliq service. Represents a row in the &quot;AT_TahirNoorKhaliq&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TahirNoorKhaliqModel
 * @see com.tahir.customsql.model.impl.TahirNoorKhaliqImpl
 * @see com.tahir.customsql.model.impl.TahirNoorKhaliqModelImpl
 * @generated
 */
@ImplementationClassName("com.tahir.customsql.model.impl.TahirNoorKhaliqImpl")
@ProviderType
public interface TahirNoorKhaliq extends TahirNoorKhaliqModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.tahir.customsql.model.impl.TahirNoorKhaliqImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TahirNoorKhaliq, Long> ID_ACCESSOR = new Accessor<TahirNoorKhaliq, Long>() {
			@Override
			public Long get(TahirNoorKhaliq tahirNoorKhaliq) {
				return tahirNoorKhaliq.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TahirNoorKhaliq> getTypeClass() {
				return TahirNoorKhaliq.class;
			}
		};
}