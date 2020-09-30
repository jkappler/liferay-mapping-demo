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

package com.liferay.starship.web.internal.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.starship.constants.StarshipPortletKeys;
import com.liferay.starship.model.StarshipEntry;
import com.liferay.starship.service.StarshipEntryService;

import java.io.File;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jürgen Kappler
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + StarshipPortletKeys.STARSHIP,
		"mvc.command.name=/starship/edit_starship_entry"
	},
	service = MVCActionCommand.class
)
public class EditStarshipEntryMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long starshipEntryId = ParamUtil.getLong(
			actionRequest, "starshipEntryId");

		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		int status = ParamUtil.getInteger(actionRequest, "status");

		UploadPortletRequest uploadPortletRequest =
			_portal.getUploadPortletRequest(actionRequest);

		File starshipFileImage = uploadPortletRequest.getFile("image");

		if (starshipEntryId <= 0) {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				StarshipEntry.class.getName(), actionRequest);

			_starhipEntryService.addStarshipEntry(
				serviceContext.getUserId(), serviceContext.getScopeGroupId(),
				name, description, starshipFileImage, status, serviceContext);
		}
		else {
			_starhipEntryService.updateStarshipEntry(
				starshipEntryId, name, description, starshipFileImage, status);
		}
	}

	@Reference
	private Portal _portal;

	@Reference
	private StarshipEntryService _starhipEntryService;

}