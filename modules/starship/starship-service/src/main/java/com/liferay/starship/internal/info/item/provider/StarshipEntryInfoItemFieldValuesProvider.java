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

import com.liferay.info.field.InfoFieldValue;
import com.liferay.info.item.InfoItemFieldValues;
import com.liferay.info.item.InfoItemReference;
import com.liferay.info.item.provider.InfoItemFieldValuesProvider;
import com.liferay.starship.internal.info.item.field.StarshipEntryInfoItemFields;
import com.liferay.starship.model.StarshipEntry;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Jürgen Kappler
 * @author Verónica González
 * @author Pablo Molina
 */
@Component(service = InfoItemFieldValuesProvider.class)
public class StarshipEntryInfoItemFieldValuesProvider
	implements InfoItemFieldValuesProvider<StarshipEntry> {

	@Override
	public InfoItemFieldValues getInfoItemFieldValues(
		StarshipEntry starshipEntry) {

		return InfoItemFieldValues.builder(
		).infoFieldValues(
			_getInfoFieldValues(starshipEntry)
		).infoItemReference(
			new InfoItemReference(
				StarshipEntry.class.getName(),
				starshipEntry.getStarshipEntryId())
		).build();
	}

	private List<InfoFieldValue<Object>> _getInfoFieldValues(
		StarshipEntry starshipEntry) {

		List<InfoFieldValue<Object>> infoFieldValues = new ArrayList<>();

		infoFieldValues.add(
			new InfoFieldValue<>(
				StarshipEntryInfoItemFields.nameInfoField,
				starshipEntry.getName()));

		return infoFieldValues;
	}

}