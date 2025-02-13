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

package org.eclipse.birt.report.designer.ui.extensions;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This interface is used to represent a new tab in the Property Editor view. It
 * creates the UI, updates property values when requested, and notifies the BIRT
 * framework of any property change through this UI
 */
public interface IPropertyTabUI {

	/**
	 * Creates the widgets to be shown in the tab page
	 * 
	 * @param composite The top level composite inside the tab
	 */
	void buildUI(Composite parent);

	/**
	 * @return the display name for the tab
	 */
	String getTabDisplayName();

	/**
	 * Sets input for the tab page.
	 * 
	 * @param elements
	 */
	void setInput(Object elements);

	/**
	 * Notifies if parent UI about to dispose.
	 */
	void dispose();

	Control getControl();
}
