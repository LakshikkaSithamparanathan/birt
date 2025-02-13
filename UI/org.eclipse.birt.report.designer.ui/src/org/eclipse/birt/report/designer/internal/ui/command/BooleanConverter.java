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

package org.eclipse.birt.report.designer.internal.ui.command;

import org.eclipse.core.commands.AbstractParameterValueConverter;
import org.eclipse.core.commands.ParameterValueConversionException;

/**
 * 
 */

public class BooleanConverter extends AbstractParameterValueConverter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.commands.AbstractParameterValueConverter#convertToObject(
	 * java.lang.String)
	 */
	public Object convertToObject(String parameterValue) throws ParameterValueConversionException {
		return Boolean.valueOf(parameterValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.commands.AbstractParameterValueConverter#convertToString(
	 * java.lang.Object)
	 */
	public String convertToString(Object parameterValue) throws ParameterValueConversionException {
		boolean value = ((Boolean) parameterValue).booleanValue();
		return Boolean.toString(value);
	}

}
