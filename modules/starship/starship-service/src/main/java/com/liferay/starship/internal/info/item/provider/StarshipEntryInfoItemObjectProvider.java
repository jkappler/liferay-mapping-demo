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

package com.liferay.starship.internal.info.item.provider;

import com.liferay.info.exception.NoSuchInfoItemException;
import com.liferay.info.item.ClassPKInfoItemIdentifier;
import com.liferay.info.item.GroupUrlTitleInfoItemIdentifier;
import com.liferay.info.item.InfoItemIdentifier;
import com.liferay.info.item.provider.InfoItemObjectProvider;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.starship.model.StarshipEntry;
import com.liferay.starship.service.StarshipEntryService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Verónica González
 * @author Jürgen Kappler
 * @author Pablo Molina
 */
@Component(
	immediate = true, property = "service.ranking:Integer=100",
	service = InfoItemObjectProvider.class
)
public class StarshipEntryInfoItemObjectProvider
	implements InfoItemObjectProvider<StarshipEntry> {

	@Override
	public StarshipEntry getInfoItem(InfoItemIdentifier infoItemIdentifier)
		throws NoSuchInfoItemException {

		if (!(infoItemIdentifier instanceof ClassPKInfoItemIdentifier) &&
			!(infoItemIdentifier instanceof GroupUrlTitleInfoItemIdentifier)) {

			throw new NoSuchInfoItemException("Invalid infoItemIdentifier");
		}

		StarshipEntry starshipEntry = null;

		if (infoItemIdentifier instanceof ClassPKInfoItemIdentifier) {
			ClassPKInfoItemIdentifier classPKInfoItemIdentifier =
				(ClassPKInfoItemIdentifier)infoItemIdentifier;

			starshipEntry = _starshipEntryService.fetchStarshipEntry(
				classPKInfoItemIdentifier.getClassPK());
		}
		else if (infoItemIdentifier instanceof
					GroupUrlTitleInfoItemIdentifier) {

			GroupUrlTitleInfoItemIdentifier groupUrlTitleInfoItemIdentifier =
				(GroupUrlTitleInfoItemIdentifier)infoItemIdentifier;

			try {
				starshipEntry = _starshipEntryService.getStarshipEntry(
					groupUrlTitleInfoItemIdentifier.getGroupId(),
					groupUrlTitleInfoItemIdentifier.getUrlTitle());
			}
			catch (PortalException portalException) {
				if (_log.isWarnEnabled()) {
					_log.warn(portalException, portalException);
				}
			}
		}

		if (starshipEntry == null) {
			throw new NoSuchInfoItemException("Invalid infoItemIdentifier");
		}

		return starshipEntry;
	}

	@Override
	public StarshipEntry getInfoItem(long classPK)
		throws NoSuchInfoItemException {

		ClassPKInfoItemIdentifier classPKInfoItemIdentifier =
			new ClassPKInfoItemIdentifier(classPK);

		return getInfoItem(classPKInfoItemIdentifier);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		StarshipEntryInfoItemObjectProvider.class);

	@Reference
	private StarshipEntryService _starshipEntryService;

}