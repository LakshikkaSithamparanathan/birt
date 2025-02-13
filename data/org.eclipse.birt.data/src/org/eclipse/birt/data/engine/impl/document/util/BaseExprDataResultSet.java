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
package org.eclipse.birt.data.engine.impl.document.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.birt.data.engine.core.DataException;
import org.eclipse.birt.data.engine.executor.ResultObject;
import org.eclipse.birt.data.engine.impl.document.viewing.ExprMetaInfo;
import org.eclipse.birt.data.engine.impl.document.viewing.ExprMetaUtil;
import org.eclipse.birt.data.engine.odi.IResultClass;
import org.eclipse.birt.data.engine.odi.IResultObject;

/**
 * Abstract class to generate result set from the expression data from report
 * document.
 */
abstract class BaseExprDataResultSet implements IExprDataResultSet {
	private int rowIndex;;
	private IResultClass rsMeta;
	protected int rowCount;

	private ExprMetaInfo[] exprMetas;
	private IExprDataReader exprDataReader;

	/**
	 * @param inExprMetas
	 * @throws DataException
	 */
	void init(ExprMetaInfo[] inExprMetas, IExprDataReader exprDataReader) throws DataException {
		this.exprMetas = ExprMetaUtil.buildExprDataMetaInfo(inExprMetas);
		this.rsMeta = ExprMetaUtil.buildExprDataResultClass(exprMetas);
		this.exprDataReader = exprDataReader;
	}

	/*
	 * @see org.eclipse.birt.data.engine.impl.document.viewing.IExprDataResultSet#
	 * getResultClass()
	 */
	public IResultClass getResultClass() {
		return this.rsMeta;
	}

	/*
	 * @see org.eclipse.birt.data.engine.impl.document.viewing.IExprDataResultSet#
	 * getCount()
	 */
	public int getCount() throws DataException {
		return this.rowCount;
	}

	/*
	 * @see org.eclipse.birt.data.engine.odi.IDataSetPopulator#next()
	 */
	public IResultObject next() throws DataException {
		if (rowIndex == rowCount)
			return null;

		IResultObject roObject = fetch();
		rowIndex++;
		return roObject;
	}

	/*
	 * @see
	 * org.eclipse.birt.data.engine.impl.document.viewing.IExprDataResultSet#fetch()
	 */
	public IResultObject fetch() throws DataException {
		exprDataReader.next();

		int exprFieldCount = exprMetas.length;
		Object[] rowData = new Object[exprFieldCount];

		int destIndex = exprDataReader.getRowId();
		Map map = exprDataReader.getRowValue();
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			String exprName = (String) entry.getKey();
			Object exprValue = entry.getValue();
			for (int j = 0; j < exprFieldCount; j++) {
				if (exprName != null && exprName.equals(exprMetas[j].getName())) {
					rowData[j] = exprValue;
					break;
				}
			}
		}

		rowData[exprFieldCount - 1] = Integer.valueOf(destIndex);

		return new ResultObject(rsMeta, rowData);
	}

	/*
	 * @see
	 * org.eclipse.birt.data.engine.impl.document.util.IExprDataResultSet#close()
	 */
	public void close() {
		if (exprDataReader != null) {
			exprDataReader.close();
			exprDataReader = null;
		}
	}

}
