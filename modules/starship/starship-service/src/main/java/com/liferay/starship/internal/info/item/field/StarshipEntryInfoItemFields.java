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

package com.liferay.starship.internal.info.item.field;

import com.liferay.info.field.InfoField;
import com.liferay.info.field.type.ImageInfoFieldType;
import com.liferay.info.field.type.TextInfoFieldType;
import com.liferay.info.localized.InfoLocalizedValue;

/**
 * @author Jürgen Kappler
 * @author Pablo Molina
 * @author Verónica González
 */
public interface StarshipEntryInfoItemFields {

	public static final InfoField<TextInfoFieldType> descriptionInfoField =
		InfoField.builder(
		).infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"description"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarshipEntryInfoItemFields.class, "description")
		).build();
	public static final InfoField<ImageInfoFieldType> imageInfoField =
		InfoField.builder(
		).infoFieldType(
			ImageInfoFieldType.INSTANCE
		).name(
			"image"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarshipEntryInfoItemFields.class, "image")
		).build();
	public static final InfoField<TextInfoFieldType> nameInfoField =
		InfoField.builder(
		).infoFieldType(
			TextInfoFieldType.INSTANCE
		).name(
			"name"
		).labelInfoLocalizedValue(
			InfoLocalizedValue.localize(
				StarshipEntryInfoItemFields.class, "name")
		).build();

}