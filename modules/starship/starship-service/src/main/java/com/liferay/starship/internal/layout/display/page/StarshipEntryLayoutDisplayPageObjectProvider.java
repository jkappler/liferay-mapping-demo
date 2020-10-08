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

package com.liferay.starship.internal.layout.display.page;

import com.liferay.layout.display.page.LayoutDisplayPageObjectProvider;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.starship.model.StarshipEntry;

import java.util.Locale;

/**
 * @author Jürgen Kappler
 */
public class StarshipEntryLayoutDisplayPageObjectProvider
	implements LayoutDisplayPageObjectProvider<StarshipEntry> {

	public StarshipEntryLayoutDisplayPageObjectProvider(
		StarshipEntry starshipEntry, Portal portal) {

		_starshipEntry = starshipEntry;
		_portal = portal;
	}

	@Override
	public long getClassNameId() {
		return _portal.getClassNameId(StarshipEntry.class.getName());
	}

	@Override
	public long getClassPK() {
		return _starshipEntry.getStarshipEntryId();
	}

	@Override
	public long getClassTypeId() {
		return 0;
	}

	@Override
	public String getDescription(Locale locale) {
		return _starshipEntry.getDescription();
	}

	@Override
	public StarshipEntry getDisplayObject() {
		return _starshipEntry;
	}

	@Override
	public long getGroupId() {
		return _starshipEntry.getGroupId();
	}

	@Override
	public String getKeywords(Locale locale) {
		return null;
	}

	@Override
	public String getTitle(Locale locale) {
		return _starshipEntry.getName();
	}

	@Override
	public String getURLTitle(Locale locale) {
		return _starshipEntry.getUrlTitle();
	}

	private final Portal _portal;
	private final StarshipEntry _starshipEntry;

}