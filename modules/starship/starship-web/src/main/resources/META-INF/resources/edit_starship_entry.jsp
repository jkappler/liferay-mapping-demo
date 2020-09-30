<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");

if (Validator.isNull(redirect)) {
	PortletURL portletURL = renderResponse.createRenderURL();

	redirect = portletURL.toString();
}

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

renderResponse.setTitle(starshipDisplayContext.getStarshipEntryName());

StarshipEntry starshipEntry = starshipDisplayContext.getStarshipEntry();
%>

<portlet:actionURL name="/starship/edit_starship_entry" var="editStarshipEntryURL">
	<portlet:param name="mvcPath" value="/edit_starship_entry.jsp" />
</portlet:actionURL>

<liferay-frontend:edit-form
	action="<%= editStarshipEntryURL %>"
	method="post"
	name="fm"
>
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

	<liferay-frontend:edit-form-body>
		<liferay-ui:error exception="<%= DuplicateStarshipEntryNameException.class %>" message="a-starship-with-that-name-already-exists" />
		<liferay-ui:error exception="<%= StarshipEntryNameException.class %>" message="starship-name-cannot-be-an-empty-string" />

		<aui:model-context bean="<%= starshipEntry %>" model="<%= StarshipEntry.class %>" />

		<liferay-frontend:fieldset-group>
			<liferay-frontend:fieldset>
				<aui:input name="starshipEntryId" type="hidden" value="<%= starshipDisplayContext.getStarshipEntryId() %>" />

				<aui:input autoFocus="<%= true %>" name="name" placeholder="name" />

				<aui:input name="description" placeholder="description" />

				<c:if test="<%= starshipEntry != null %>">
					<aui:input disabled="true" name="urlTitle" placeholder="url-title" />
				</c:if>

				<aui:select label="status" name="status" wrapperCssClass="mb-3">
					<aui:option label="available" selected="<%= starshipDisplayContext.getStarshipStatus() == StarshipStatusConstants.STATUS_AVAILABLE %>" value="<%= StarshipStatusConstants.STATUS_AVAILABLE %>" />
					<aui:option label="unavailable" selected="<%= starshipDisplayContext.getStarshipStatus() == StarshipStatusConstants.STATUS_UNAVAILABLE %>" value="<%= StarshipStatusConstants.STATUS_UNAVAILABLE %>" />
				</aui:select>

				<c:if test="<%= (starshipEntry != null) && Validator.isNotNull(starshipEntry.getStarshipImageURL(themeDisplay)) %>">
					<div class="aspect-ratio aspect-ratio-16-to-9">
						<img alt="<liferay-ui:message escapeAttribute="<%= true %>" key="preview" />" class="aspect-ratio-item-fluid" src="<%= HtmlUtil.escapeAttribute(starshipEntry.getStarshipImageURL(themeDisplay)) %>" />
					</div>
				</c:if>

				<aui:input label="image" name="image" type="file" wrapperCssClass="mb-3" />
			</liferay-frontend:fieldset>
		</liferay-frontend:fieldset-group>
	</liferay-frontend:edit-form-body>

	<liferay-frontend:edit-form-footer>
		<aui:button type="submit" />

		<aui:button href="<%= redirect %>" type="cancel" />
	</liferay-frontend:edit-form-footer>
</liferay-frontend:edit-form>