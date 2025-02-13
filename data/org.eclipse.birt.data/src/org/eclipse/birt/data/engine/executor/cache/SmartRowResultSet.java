/*******************************************************************************
 * Copyright (c) 2004, 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.data.engine.executor.cache;

import org.eclipse.birt.data.engine.core.DataException;
import org.eclipse.birt.data.engine.executor.transform.OrderingInfo;
import org.eclipse.birt.data.engine.odi.IResultClass;
import org.eclipse.birt.data.engine.odi.IResultObject;

/**
 * This class is used by SmartCache for the purpose of generate a SmartCache
 * instance following the information in OrderInfo.
 */
public class SmartRowResultSet implements IRowResultSet {
	private ResultSetCache rsCache;
	private IResultClass rsMeta;
	private OrderingInfo orderingInfo;
	boolean startNewGroup = true;
	int currentGroup = -1;

	public SmartRowResultSet(ResultSetCache rsCache, IResultClass rsMeta, OrderingInfo orderingInfo) {
		this.rsCache = rsCache;
		this.rsMeta = rsMeta;
		this.orderingInfo = orderingInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.data.engine.executor.cache.IRowResultSet#getMetaData()
	 */
	public IResultClass getMetaData() {
		return rsMeta;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.data.engine.executor.cache.IRowResultSet#next()
	 */
	public IResultObject next() throws DataException {
		IResultObject result = null;
		if (startNewGroup) {
			currentGroup++;

			if (currentGroup > orderingInfo.getCount() - 1)
				return null;

			rsCache.moveTo(orderingInfo.getStartIndex(currentGroup));
			startNewGroup = false;
		} else {
			rsCache.next();
		}

		result = rsCache.getCurrentResult();

		if (rsCache.getCurrentIndex() == orderingInfo.getEndIndex(currentGroup))
			startNewGroup = true;

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.data.engine.executor.cache.IRowResultSet#getIndex()
	 */
	public int getIndex() throws DataException {
		return this.rsCache.getCurrentIndex();
	}
}
