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

import com.liferay.info.field.InfoFieldSet;
import com.liferay.info.form.InfoForm;
import com.liferay.info.item.provider.InfoItemFormProvider;
import com.liferay.info.localized.InfoLocalizedValue;
import com.liferay.starship.internal.info.item.field.StarshipEntryInfoItemFields;
import com.liferay.starship.model.StarshipEntry;

import org.osgi.service.component.annotations.Component;

/**
 * @author Verónica González
 * @author Pablo Molina
 * @author Jürgen Kappler
 */
@Component(service = InfoItemFormProvider.class)
public class StarshipEntryInfoItemFormProvider
	implements InfoItemFormProvider<StarshipEntry> {

	@Override
	public InfoForm getInfoForm() {
		return InfoForm.builder(
		).infoFieldSetEntry(
			_getInfoItemFieldSet()
		).infoFieldSetEntry(
			StarshipEntryInfoItemFields.nameInfoField
		).infoFieldSetEntry(
			StarshipEntryInfoItemFields.createDateInfoField
		).name(
			StarshipEntry.class.getName()
		).build();
	}

	private InfoFieldSet _getInfoItemFieldSet() {
		return InfoFieldSet.builder(
		).infoFieldSetEntry(
			StarshipEntryInfoItemFields.imageInfoField
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(getClass(), "Chachi Pistachi")
		).name(
			"Chachi Pistachi"
		).build();
	}

}