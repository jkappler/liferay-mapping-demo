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
StarshipManagementToolbarDisplayContext starshipManagementToolbarDisplayContext = new StarshipManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, starshipDisplayContext);
%>

<clay:management-toolbar
	displayContext="<%= starshipManagementToolbarDisplayContext %>"
/>

<portlet:actionURL name="/starship/delete_starship_entry" var="deleteStarshipEntryURL">
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:actionURL>

<aui:form action="<%= deleteStarshipEntryURL %>" cssClass="container-fluid container-fluid-max-xl" name="fm">
	<liferay-ui:search-container
		id="starshipEntries"
		searchContainer="<%= starshipDisplayContext.getStarshipSearchContainer() %>"
	>
		<liferay-ui:search-container-row
			className="com.liferay.starship.model.StarshipEntry "
			keyProperty="starshipEntryId"
			modelVar="starshipEntry"
		>
			<liferay-ui:search-container-column-text
				cssClass="table-cell-expand table-cell-minw-100 table-title"
				name="name"
			>
				<portlet:renderURL var="editURL">
					<portlet:param name="mvcPath" value="/edit_starship_entry.jsp" />
					<portlet:param name="starshipEntryId" value="<%= String.valueOf(starshipEntry.getStarshipEntryId()) %>" />
				</portlet:renderURL>

				<aui:a href="<%= editURL %>">
					<%= HtmlUtil.escape(starshipEntry.getName()) %>
				</aui:a>
			</liferay-ui:search-container-column-text>

			<liferay-ui:search-container-column-text
				cssClass="table-cell-expand"
				name="status"
			>
				<span class="label label-lg label-<%= (starshipEntry.getStatus() == StarshipStatusConstants.STATUS_AVAILABLE) ? "success" : "warning" %>">
					<span class="label-item label-item-expand">
						<c:choose>
							<c:when test="<%= starshipEntry.getStatus() == StarshipStatusConstants.STATUS_AVAILABLE %>">
								<liferay-ui:message key="available" />
							</c:when>
							<c:otherwise>
								<liferay-ui:message key="unavailable" />
							</c:otherwise>
						</c:choose>
					</span>
				</span>
			</liferay-ui:search-container-column-text>

			<liferay-ui:search-container-column-jsp
				path="/starship_entry_action.jsp"
			/>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator
			displayStyle="list"
			markupView="lexicon"
		/>
	</liferay-ui:search-container>
</aui:form>

<liferay-frontend:component
	componentId="<%= starshipManagementToolbarDisplayContext.getDefaultEventHandler() %>"
	module="js/ManagementToolbarDefaultEventHandler.es"
/>