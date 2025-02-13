/*******************************************************************************
 * Copyright (c) 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.report.engine.api.script;

/**
 * Describes the column metadata of a row.
 */
public interface IColumnMetaData {

	/**
	 * Returns the number of columns in a row of the result set.
	 * 
	 * @return the number of columns in a row.
	 */
	public int getColumnCount();

	/**
	 * Returns the column name at the specified index.
	 * 
	 * @param index The projected column index.
	 * @return The name of the specified column.
	 * @throws ScriptException if given index is invalid.
	 */
	public String getColumnName(int index) throws ScriptException;

	/**
	 * Returns the column alias at the specified index. An alias is given to a
	 * column as a programmatic convenience. A column can be referred using a name
	 * or an alias interchangeably.
	 * 
	 * @param index The projected column index.
	 * @return The alias of the specified column. Null if none is defined.
	 * @throws ScriptException if given index is invalid.
	 */
	public String getColumnAlias(int index) throws ScriptException;

	/**
	 * Returns the data type of the column at the specified index.
	 * 
	 * @param index The projected column index.
	 * @return The data type of the specified column, as an integer defined in
	 *         org.eclipse.birt.data.engine.api.DataType.
	 * @throws ScriptException if given index is invalid.
	 */
	public int getColumnType(int index) throws ScriptException;

	/**
	 * Returns the Data Engine data type name of the column at the specified index.
	 * 
	 * @param index The projected column index.
	 * @return The Data Engine data type name of the specified column.
	 * @throws ScriptException if given index is invalid.
	 */
	public String getColumnTypeName(int index) throws ScriptException;

	/**
	 * Returns the data provider specific data type name of the specified column.
	 * 
	 * @return the data type name as defined by the data provider.
	 * @throws ScriptException if given index is invalid.
	 */
	public String getColumnNativeTypeName(int index) throws ScriptException;

	/**
	 * Gets the label or display name of the column at the specified index.
	 * 
	 * @param index The projected column index.
	 * @return The label of the specified column.
	 * @throws ScriptException if given index is invalid.
	 */
	public String getColumnLabel(int index) throws ScriptException;

	/**
	 * Indicates whether the specified projected column is defined as a computed
	 * column. A computed column is one that is not retrieved from the underlying
	 * data provider. Only those computed columns declared explicitly in a data set
	 * design are considered as "computed" columns.
	 * 
	 * @param index The projected column index.
	 * @return true if the given column is a computed column; false otherwise.
	 * @throws ScriptException if given index is invalid.
	 */
	public boolean isComputedColumn(int index) throws ScriptException;
}
