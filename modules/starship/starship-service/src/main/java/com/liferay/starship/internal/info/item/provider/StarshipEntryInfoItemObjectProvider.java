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
import com.liferay.info.item.InfoItemIdentifier;
import com.liferay.info.item.provider.InfoItemObjectProvider;
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

		if (!(infoItemIdentifier instanceof ClassPKInfoItemIdentifier)) {
			throw new NoSuchInfoItemException(
				"Invalid InfoItemIdentifier, we only support classPK (for now)");
		}

		ClassPKInfoItemIdentifier classPKInfoItemIdentifier =
			(ClassPKInfoItemIdentifier)infoItemIdentifier;

		return getInfoItem(classPKInfoItemIdentifier.getClassPK());
	}

	@Override
	public StarshipEntry getInfoItem(long classPK)
		throws NoSuchInfoItemException {

		StarshipEntry starshipEntry = _starshipEntryService.fetchStarshipEntry(
			classPK);

		if (starshipEntry == null) {
			throw new NoSuchInfoItemException(
				"No StarshipEntry found for classPK " + classPK);
		}

		return starshipEntry;
	}

	@Reference
	private StarshipEntryService _starshipEntryService;

}