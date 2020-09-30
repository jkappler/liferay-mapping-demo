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

package com.liferay.starship.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.starship.service.StarshipEntryServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>StarshipEntryServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarshipEntryServiceSoap
 * @generated
 */
public class StarshipEntryServiceHttp {

	public static com.liferay.starship.model.StarshipEntry addStarshipEntry(
			HttpPrincipal httpPrincipal, long userId, long groupId, String name,
			String description, java.io.File starshipFileImage, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "addStarshipEntry",
				_addStarshipEntryParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, groupId, name, description,
				starshipFileImage, status, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.starship.model.StarshipEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.starship.model.StarshipEntry deleteStarshipEntry(
			HttpPrincipal httpPrincipal, long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "deleteStarshipEntry",
				_deleteStarshipEntryParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, starshipEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.starship.model.StarshipEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.starship.model.StarshipEntry fetchStarshipEntry(
		HttpPrincipal httpPrincipal, long starshipEntryId) {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "fetchStarshipEntry",
				_fetchStarshipEntryParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, starshipEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.starship.model.StarshipEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "getStarshipEntries",
				_getStarshipEntriesParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.starship.model.StarshipEntry>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.starship.model.StarshipEntry>
		getStarshipEntries(
			HttpPrincipal httpPrincipal, long groupId, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "getStarshipEntries",
				_getStarshipEntriesParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.starship.model.StarshipEntry>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.starship.model.StarshipEntry getStarshipEntry(
			HttpPrincipal httpPrincipal, long starshipEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "getStarshipEntry",
				_getStarshipEntryParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, starshipEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.starship.model.StarshipEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.starship.model.StarshipEntry getStarshipEntry(
			HttpPrincipal httpPrincipal, long groupId, String urlTitle)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "getStarshipEntry",
				_getStarshipEntryParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, urlTitle);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.starship.model.StarshipEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getStarshipEntryCount(
		HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "getStarshipEntryCount",
				_getStarshipEntryCountParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.starship.model.StarshipEntry updateStarshipEntry(
			HttpPrincipal httpPrincipal, long starshipEntryId, String name,
			String description, java.io.File starshipFileImage, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StarshipEntryServiceUtil.class, "updateStarshipEntry",
				_updateStarshipEntryParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, starshipEntryId, name, description,
				starshipFileImage, status);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.starship.model.StarshipEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		StarshipEntryServiceHttp.class);

	private static final Class<?>[] _addStarshipEntryParameterTypes0 =
		new Class[] {
			long.class, long.class, String.class, String.class,
			java.io.File.class, int.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteStarshipEntryParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _fetchStarshipEntryParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getStarshipEntriesParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getStarshipEntriesParameterTypes4 =
		new Class[] {long.class, int.class, int.class};
	private static final Class<?>[] _getStarshipEntryParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _getStarshipEntryParameterTypes6 =
		new Class[] {long.class, String.class};
	private static final Class<?>[] _getStarshipEntryCountParameterTypes7 =
		new Class[] {long.class};
	private static final Class<?>[] _updateStarshipEntryParameterTypes8 =
		new Class[] {
			long.class, String.class, String.class, java.io.File.class,
			int.class
		};

}