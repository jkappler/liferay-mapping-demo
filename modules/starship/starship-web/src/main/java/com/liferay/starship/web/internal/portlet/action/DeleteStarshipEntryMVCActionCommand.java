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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.starship.constants.StarshipPortletKeys;
import com.liferay.starship.service.StarshipEntryService;

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
		"mvc.command.name=/starship/delete_starship_entry"
	},
	service = MVCActionCommand.class
)
public class DeleteStarshipEntryMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long[] deleteStarshipEntryIds = null;

		long starshipEntryId = ParamUtil.getLong(
			actionRequest, "starshipEntryId");

		if (starshipEntryId > 0) {
			deleteStarshipEntryIds = new long[] {starshipEntryId};
		}
		else {
			deleteStarshipEntryIds = ParamUtil.getLongValues(
				actionRequest, "rowIds");
		}

		try {
			for (long deleteStarshipEntryId : deleteStarshipEntryIds) {
				_starhipEntryService.deleteStarshipEntry(deleteStarshipEntryId);
			}
		}
		catch (PortalException portalException) {
			SessionErrors.add(actionRequest, portalException.getClass());

			hideDefaultErrorMessage(actionRequest);

			sendRedirect(actionRequest, actionResponse);
		}
	}

	@Reference
	private StarshipEntryService _starhipEntryService;

}