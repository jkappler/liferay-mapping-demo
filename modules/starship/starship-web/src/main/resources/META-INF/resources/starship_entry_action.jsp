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
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

StarshipEntry starshipEntry = (StarshipEntry)row.getObject();

String displayPageURL = starshipDisplayContext.getDisplayPageURL(starshipEntry);
%>

<liferay-ui:icon-menu
	direction="left-side"
	icon="<%= StringPool.BLANK %>"
	markupView="lexicon"
	message="<%= StringPool.BLANK %>"
	showWhenSingleIcon="<%= true %>"
>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/edit_starship_entry.jsp" />
		<portlet:param name="starshipEntryId" value="<%= String.valueOf(starshipEntry.getStarshipEntryId()) %>" />
	</portlet:renderURL>

	<liferay-ui:icon
		label="<%= true %>"
		message="edit"
		url="<%= editURL %>"
	/>

	<c:if test="<%= Validator.isNotNull(displayPageURL) %>">
		<liferay-ui:icon
			label="<%= true %>"
			message="view-display-page"
			url="<%= displayPageURL %>"
		/>
	</c:if>

	<portlet:actionURL name="/starship/delete_starship_entry" var="deleteURL">
		<portlet:param name="redirect" value="<%= currentURL %>" />
		<portlet:param name="starshipEntryId" value="<%= String.valueOf(starshipEntry.getStarshipEntryId()) %>" />
	</portlet:actionURL>

	<liferay-ui:icon-delete
		url="<%= deleteURL %>"
	/>
</liferay-ui:icon-menu>