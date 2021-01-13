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

package com.liferay.starship.internal.info.list.provider;

import com.liferay.info.list.provider.InfoListProvider;
import com.liferay.info.list.provider.InfoListProviderContext;
import com.liferay.info.pagination.Pagination;
import com.liferay.info.sort.Sort;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.starship.model.StarshipEntry;
import com.liferay.starship.service.StarshipEntryLocalService;

import java.util.List;
import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jürgen Kappler
 */
@Component(immediate = true, service = InfoListProvider.class)
public class StarshipEntryInfoListProvider
	implements InfoListProvider<StarshipEntry> {

	@Override
	public List<StarshipEntry> getInfoList(
		InfoListProviderContext infoListProviderContext) {

		return getInfoList(infoListProviderContext, null, null);
	}

	@Override
	public List<StarshipEntry> getInfoList(
		InfoListProviderContext infoListProviderContext, Pagination pagination,
		Sort sort) {

		return _starshipEntryLocalService.getStarshipEntries(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	@Override
	public int getInfoListCount(
		InfoListProviderContext infoListProviderContext) {

		return _starshipEntryLocalService.getStarshipEntriesCount();
	}

	@Override
	public String getLabel(Locale locale) {
		return "Starship Entry Info List Provider";
	}

	@Reference
	private StarshipEntryLocalService _starshipEntryLocalService;

}