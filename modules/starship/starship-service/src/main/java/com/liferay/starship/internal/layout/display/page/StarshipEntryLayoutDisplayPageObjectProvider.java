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
import com.liferay.starship.model.StarshipEntry;

import java.util.Locale;

/**
 * @author Jürgen Kappler
 */
public class StarshipEntryLayoutDisplayPageObjectProvider
	implements LayoutDisplayPageObjectProvider<StarshipEntry> {

	@Override
	public long getClassNameId() {
		return 0;
	}

	@Override
	public long getClassPK() {
		return 0;
	}

	@Override
	public long getClassTypeId() {
		return 0;
	}

	@Override
	public String getDescription(Locale locale) {
		return null;
	}

	@Override
	public StarshipEntry getDisplayObject() {
		return null;
	}

	@Override
	public long getGroupId() {
		return 0;
	}

	@Override
	public String getKeywords(Locale locale) {
		return null;
	}

	@Override
	public String getTitle(Locale locale) {
		return null;
	}

	@Override
	public String getURLTitle(Locale locale) {
		return null;
	}

}