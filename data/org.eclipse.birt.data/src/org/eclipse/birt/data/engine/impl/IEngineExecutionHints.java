/*******************************************************************************
 * Copyright (c) 2004,2007 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.data.engine.impl;

/**
 * This interface defines hints info to optimize query execution.
 *
 */
public interface IEngineExecutionHints {

	/**
	 * Return whether a data set needs to be cached data engine wise.
	 * 
	 * @param dataSetName
	 * @return
	 */
	public boolean needCacheDataSet(String dataSetName);
}
