/*******************************************************************************
 * Copyright (c) 2007 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.chart.integrate;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.birt.chart.factory.DataRowExpressionEvaluatorAdapter;

/**
 * Simple implementation of IDataRowExpressionEvaluator.
 */

public class SimpleDataRowExpressionEvaluator extends DataRowExpressionEvaluatorAdapter {

	private int index = 0;
	private Object[] columnData;
	private Map map;

	public SimpleDataRowExpressionEvaluator(String[] expressions, Object[][] data) {
		if (expressions == null || data == null || expressions.length != data.length) {
			throw new IllegalArgumentException();
		}

		map = new HashMap();
		for (int i = 0; i < expressions.length; i++) {
			map.put(expressions[i], data[i]);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.birt.chart.factory.IDataRowExpressionEvaluator#evaluate(java.lang
	 * .String)
	 */
	public Object evaluate(String expression) {
		Object[] data = (Object[]) map.get(expression);
		if (data == null) {
			return expression;
		}
		columnData = data;
		return columnData[index];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.chart.factory.IDataRowExpressionEvaluator#first()
	 */
	public boolean first() {
		index = 0;

		if (map.size() > 0) {
			columnData = (Object[]) map.values().iterator().next();

			if (columnData != null && index < columnData.length) {
				return true;
			}
		}

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.chart.factory.IDataRowExpressionEvaluator#next()
	 */
	public boolean next() {
		if (columnData != null && index < (columnData.length - 1)) {
			index++;
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.chart.factory.IDataRowExpressionEvaluator#close()
	 */
	public void close() {
		// Doing nothing.
	}

	public Object evaluateGlobal(String expression) {
		return null;
	}

}
