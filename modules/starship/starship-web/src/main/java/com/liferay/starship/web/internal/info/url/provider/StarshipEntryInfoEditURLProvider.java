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

package com.liferay.starship.web.internal.info.url.provider;

import com.liferay.info.display.url.provider.InfoEditURLProvider;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.starship.constants.StarshipPortletKeys;
import com.liferay.starship.model.StarshipEntry;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jürgen Kappler
 */
@Component(
	property = "model.class.name=com.liferay.starship.model.StarshipEntry",
	service = InfoEditURLProvider.class
)
public class StarshipEntryInfoEditURLProvider
	implements InfoEditURLProvider<StarshipEntry> {

	@Override
	public String getURL(
		StarshipEntry starshipEntry, HttpServletRequest httpServletRequest) {

		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		PortletURL portletURL = _portal.getControlPanelPortletURL(
			httpServletRequest, themeDisplay.getScopeGroup(),
			StarshipPortletKeys.STARSHIP, 0, 0, PortletRequest.RENDER_PHASE);

		portletURL.setParameter("mvcPath", "/edit_starship_entry.jsp");

		String redirect = ParamUtil.getString(httpServletRequest, "redirect");

		if (Validator.isNull(redirect)) {
			redirect = themeDisplay.getURLCurrent();
		}

		portletURL.setParameter("redirect", redirect);

		portletURL.setParameter(
			"starshipEntryId",
			String.valueOf(starshipEntry.getStarshipEntryId()));

		return portletURL.toString();
	}

	@Reference
	private Portal _portal;

}