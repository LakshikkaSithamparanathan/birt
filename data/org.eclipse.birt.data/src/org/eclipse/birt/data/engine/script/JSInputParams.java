/*
 *************************************************************************
 * Copyright (c) 2006 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *  
 *************************************************************************
 */
package org.eclipse.birt.data.engine.script;

import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.core.script.JavascriptEvalUtil;
import org.eclipse.birt.data.engine.impl.DataSetRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

/**
 * Implements "inputParams" JavaScript object for accessing data set input
 * parameter values
 */

public class JSInputParams extends ScriptableObject {
	private static final long serialVersionUID = 24556334211698002L;

	private DataSetRuntime dataSet;

	/**
	 * @param dataSet
	 */
	public JSInputParams(DataSetRuntime dataSet) {
		this.dataSet = dataSet;
	}

	/*
	 * @see org.mozilla.javascript.ScriptableObject#getClassName()
	 */
	public String getClassName() {
		return "InputParams";
	}

	/*
	 * @see org.mozilla.javascript.Scriptable#get(int,
	 * org.mozilla.javascript.Scriptable)
	 */
	public Object get(int index, Scriptable scope) {
		// BIRT parameters are accessible by name only
		return NOT_FOUND;
	}

	/*
	 * @see org.mozilla.javascript.Scriptable#get(java.lang.String,
	 * org.mozilla.javascript.Scriptable)
	 */
	public Object get(String name, Scriptable scope) {
		try {
			Object paramValue = dataSet.getInputParameterValue(name);
			if (paramValue == DataSetRuntime.UNSET_VALUE)
				return NOT_FOUND;
			return JavascriptEvalUtil.convertToJavascriptValue(paramValue, dataSet.getSharedScope());
		} catch (BirtException e) {
			// needs to log here.
			return NOT_FOUND;
		}

	}

	/**
	 * @see org.mozilla.javascript.ScriptableObject#has(int,
	 *      org.mozilla.javascript.Scriptable)
	 */
	public boolean has(int index, Scriptable start) {
		return super.has(index, start);
	}

	/**
	 * @see org.mozilla.javascript.ScriptableObject#has(java.lang.String,
	 *      org.mozilla.javascript.Scriptable)
	 */
	public boolean has(String name, Scriptable start) {
		if (dataSet.hasInputParameter(name))
			return true;
		return super.has(name, start);
	}

	/*
	 * @see org.mozilla.javascript.Scriptable#put(int,
	 * org.mozilla.javascript.Scriptable, java.lang.Object)
	 */
	public void put(int index, Scriptable scope, Object value) {
		throw new IllegalArgumentException("Put value on output parameter object is not supported.");
	}

	/*
	 * @see org.mozilla.javascript.Scriptable#put(java.lang.String,
	 * org.mozilla.javascript.Scriptable, java.lang.Object)
	 */
	public void put(String name, Scriptable scope, Object value) {
		try {
			dataSet.setInputParameterValue(name, value);
		} catch (BirtException e) {
			// needs to log here.
		}
	}
}
