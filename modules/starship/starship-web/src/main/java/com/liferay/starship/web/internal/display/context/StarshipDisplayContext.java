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

package com.liferay.starship.web.internal.display.context;

import com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.starship.constants.StarshipStatusConstants;
import com.liferay.starship.model.StarshipEntry;
import com.liferay.starship.service.StarshipEntryServiceUtil;

import java.util.List;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jürgen Kappler
 */
public class StarshipDisplayContext {

	public StarshipDisplayContext(
		HttpServletRequest httpServletRequest, RenderRequest renderRequest,
		RenderResponse renderResponse) {

		_httpServletRequest = httpServletRequest;
		_renderRequest = renderRequest;
		_renderResponse = renderResponse;

		_themeDisplay = (ThemeDisplay)_httpServletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
	}

	public String getOrderByCol() {
		if (Validator.isNotNull(_orderByCol)) {
			return _orderByCol;
		}

		_orderByCol = ParamUtil.getString(
			_httpServletRequest, "orderByCol", "name");

		return _orderByCol;
	}

	public String getOrderByType() {
		if (Validator.isNotNull(_orderByType)) {
			return _orderByType;
		}

		_orderByType = ParamUtil.getString(
			_httpServletRequest, "orderByType", "asc");

		return _orderByType;
	}

	public StarshipEntry getStarshipEntry() {
		if (_starshipEntry != null) {
			return _starshipEntry;
		}

		long starshipEntryId = getStarshipEntryId();

		StarshipEntry starshipEntry = null;

		if (starshipEntryId > 0) {
			starshipEntry = StarshipEntryServiceUtil.fetchStarshipEntry(
				starshipEntryId);
		}

		_starshipEntry = starshipEntry;

		return _starshipEntry;
	}

	public Long getStarshipEntryId() {
		if (_starshipEntryId != null) {
			return _starshipEntryId;
		}

		_starshipEntryId = ParamUtil.getLong(
			_httpServletRequest, "starshipEntryId");

		return _starshipEntryId;
	}

	public String getStarshipEntryName() {
		StarshipEntry starshipEntry = getStarshipEntry();

		if (starshipEntry == null) {
			return LanguageUtil.get(_httpServletRequest, "new-starship-entry");
		}

		return starshipEntry.getName();
	}

	public SearchContainer<StarshipEntry> getStarshipSearchContainer() {
		if (_starshipSearchContainer != null) {
			return _starshipSearchContainer;
		}

		SearchContainer<StarshipEntry> starshipSearchContainer =
			new SearchContainer(
				_renderRequest, _renderResponse.createRenderURL(), null,
				"there-are-no-starships");

		starshipSearchContainer.setRowChecker(
			new EmptyOnClickRowChecker(_renderResponse));

		starshipSearchContainer.setOrderByCol(getOrderByCol());
		starshipSearchContainer.setOrderByType(getOrderByType());

		long scopeGroupId = _themeDisplay.getScopeGroupId();

		int count = StarshipEntryServiceUtil.getStarshipEntryCount(
			scopeGroupId);

		starshipSearchContainer.setTotal(count);

		List<StarshipEntry> starshipEntries =
			StarshipEntryServiceUtil.getStarshipEntries(
				scopeGroupId, starshipSearchContainer.getStart(),
				starshipSearchContainer.getEnd());

		starshipSearchContainer.setResults(starshipEntries);

		_starshipSearchContainer = starshipSearchContainer;

		return _starshipSearchContainer;
	}

	public int getStarshipStatus() {
		StarshipEntry starshipEntry = getStarshipEntry();

		if (starshipEntry == null) {
			return StarshipStatusConstants.STATUS_AVAILABLE;
		}

		return starshipEntry.getStatus();
	}

	private final HttpServletRequest _httpServletRequest;
	private String _orderByCol;
	private String _orderByType;
	private final RenderRequest _renderRequest;
	private final RenderResponse _renderResponse;
	private StarshipEntry _starshipEntry;
	private Long _starshipEntryId;
	private SearchContainer<StarshipEntry> _starshipSearchContainer;
	private final ThemeDisplay _themeDisplay;

}