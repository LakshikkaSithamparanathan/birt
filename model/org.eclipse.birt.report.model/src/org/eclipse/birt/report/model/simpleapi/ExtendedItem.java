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

package org.eclipse.birt.report.model.simpleapi;

import org.eclipse.birt.report.model.api.ReportItemHandle;
import org.eclipse.birt.report.model.api.simpleapi.IExtendedItem;

/**
 * 
 */

public class ExtendedItem extends ReportItem implements IExtendedItem {

	/**
	 * Constructor.
	 * 
	 * @param handle
	 */

	public ExtendedItem(ReportItemHandle handle) {
		super(handle);
	}

}
