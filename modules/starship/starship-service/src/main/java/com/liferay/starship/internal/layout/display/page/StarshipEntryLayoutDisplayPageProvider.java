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

import com.liferay.info.item.InfoItemReference;
import com.liferay.layout.display.page.LayoutDisplayPageObjectProvider;
import com.liferay.layout.display.page.LayoutDisplayPageProvider;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.starship.model.StarshipEntry;
import com.liferay.starship.service.StarshipEntryService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jürgen Kappler
 */
@Component(immediate = true, service = LayoutDisplayPageProvider.class)
public class StarshipEntryLayoutDisplayPageProvider
	implements LayoutDisplayPageProvider<StarshipEntry> {

	@Override
	public String getClassName() {
		return StarshipEntry.class.getName();
	}

	@Override
	public LayoutDisplayPageObjectProvider<StarshipEntry>
		getLayoutDisplayPageObjectProvider(
			InfoItemReference infoItemReference) {

		StarshipEntry starshipEntry = _starshipEntryService.fetchStarshipEntry(
			infoItemReference.getClassPK());

		if (starshipEntry != null) {
			return new StarshipEntryLayoutDisplayPageObjectProvider(
				starshipEntry, _portal);
		}

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Unable to get Starship with classPK " +
					infoItemReference.getClassPK());
		}

		return null;
	}

	@Override
	public LayoutDisplayPageObjectProvider<StarshipEntry>
		getLayoutDisplayPageObjectProvider(long groupId, String urlTitle) {

		try {
			StarshipEntry starshipEntry =
				_starshipEntryService.getStarshipEntry(groupId, urlTitle);

			return new StarshipEntryLayoutDisplayPageObjectProvider(
				starshipEntry, _portal);
		}
		catch (PortalException portalException) {
			if (_log.isWarnEnabled()) {
				_log.warn(
					"Unable to get Starship with urlTitle " + urlTitle,
					portalException);
			}
		}

		return null;
	}

	@Override
	public String getURLSeparator() {
		return "/s/";
	}

	private static final Log _log = LogFactoryUtil.getLog(
		StarshipEntryLayoutDisplayPageProvider.class);

	@Reference
	private Portal _portal;

	@Reference
	private StarshipEntryService _starshipEntryService;

}