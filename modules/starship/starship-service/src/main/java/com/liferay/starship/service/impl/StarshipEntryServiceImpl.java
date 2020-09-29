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

package com.liferay.starship.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.starship.service.base.StarshipEntryServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the starship entry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.starship.service.StarshipEntryService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=starship",
		"json.web.service.context.path=StarshipEntry"
	},
	service = AopService.class
)
public class StarshipEntryServiceImpl extends StarshipEntryServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.starship.service.StarshipEntryServiceUtil</code> to access the starship entry remote service.
	 */

}