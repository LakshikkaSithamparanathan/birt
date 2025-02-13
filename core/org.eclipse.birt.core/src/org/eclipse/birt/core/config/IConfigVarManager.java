/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.core.config;

/**
 * Allows BIRT components to access configuration variables in a uniform way.
 */
public interface IConfigVarManager {
	/**
	 * @param key the configuration variable name
	 * @return The value for the configuration variable. null if it is not set.
	 */
	public String getConfigVar(String key);

	/**
	 * @param key          the configuration variable name
	 * @param defaultValue returns this value is the configuration variable is not
	 *                     set
	 * @return The value for the configuration variable. In case the config var is
	 *         not set, or there is an exception, defaultValue is returned.
	 */
	public String getConfigVar(String key, String defaultValue);

	/**
	 * @param key          the configuration variable name
	 * @param defaultValue returns this value is the configuration variable is not
	 *                     set
	 * @return true if set to true (case insensitive), false in any other cases
	 */
	public boolean getConfigBoolean(String key);

	/**
	 * @param key the configuration variable name
	 * @return the value for the configuration variable. returns null if the config
	 *         var is not set or not set to an integer or any other exception
	 *         happens.
	 */
	public Integer getConfigInteger(String key);

	/**
	 * @param key          the configuration variable name
	 * @param defaultValue returns this value is the configuration variable is not
	 *                     set
	 * @return the value for the configuration variable. In case the config var is
	 *         not set, or not set to a number, or there is an exception,
	 *         defaultValue is returned.
	 */
	public int getConfigInteger(String key, int defaultValue);

}
