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

package org.eclipse.birt.report.designer.internal.ui.views.outline;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * This class represents outline tree view's filter which is used to filter the
 * header & footer.
 * 
 * 
 */
public class HeaderFooterFilter extends ViewerFilter {

	/**
	 * Returns whether the given element makes it through this filter.
	 * 
	 * @param viewer        the viewer
	 * @param parentElement the parent element
	 * @param element       the element
	 * @return <code>true</code> if element is included in the filtered set, and
	 *         <code>false</code> if excluded
	 */
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return true;
	}
}