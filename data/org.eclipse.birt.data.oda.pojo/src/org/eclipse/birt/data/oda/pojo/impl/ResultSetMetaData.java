/*******************************************************************************
 * Copyright (c) 2013 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.data.oda.pojo.impl;

import org.eclipse.birt.data.oda.pojo.querymodel.ReferenceGraph;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * Implementation class of IResultSetMetaData for an ODA POJO runtime driver.
 */
public class ResultSetMetaData implements IResultSetMetaData {
	private ReferenceGraph rg;

	public ResultSetMetaData(ReferenceGraph rg) throws OdaException {
		assert rg != null;
		this.rg = rg;
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IResultSetMetaData#getColumnCount()
	 */
	public int getColumnCount() throws OdaException {
		return rg.getColumnCount();
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IResultSetMetaData#getColumnName(int)
	 */
	public String getColumnName(int index) throws OdaException {
		return rg.getColumn(index).getName();
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IResultSetMetaData#getColumnLabel(int)
	 */
	public String getColumnLabel(int index) throws OdaException {
		return getColumnName(index); // default
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IResultSetMetaData#getColumnType(int)
	 */
	public int getColumnType(int index) throws OdaException {
		return Driver.getNativeDataTypeCode(getColumnTypeName(index));
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IResultSetMetaData#getColumnTypeName(
	 * int)
	 */
	public String getColumnTypeName(int index) throws OdaException {
		return rg.getColumn(index).getOdaType();
	}

	/*
	 * @see org.eclipse.datatools.connectivity.oda.IResultSetMetaData#
	 * getColumnDisplayLength(int)
	 */
	public int getColumnDisplayLength(int index) throws OdaException {
		throw new UnsupportedOperationException();
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IResultSetMetaData#getPrecision(int)
	 */
	public int getPrecision(int index) throws OdaException {
		return -1;
	}

	/*
	 * @see org.eclipse.datatools.connectivity.oda.IResultSetMetaData#getScale(int)
	 */
	public int getScale(int index) throws OdaException {
		return -1;
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IResultSetMetaData#isNullable(int)
	 */
	public int isNullable(int index) throws OdaException {
		return IResultSetMetaData.columnNullableUnknown;
	}

}
