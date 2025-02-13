/*******************************************************************************
 * Copyright (c) 2004, 2007 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.chart.device.util;

public class HTMLAttribute {
	public static final HTMLAttribute SHAPE = new HTMLAttribute("shape"); //$NON-NLS-1$
	public static final HTMLAttribute COORDS = new HTMLAttribute("coords"); //$NON-NLS-1$
	public static final HTMLAttribute ONFOCUS = new HTMLAttribute("onfocus"); //$NON-NLS-1$
	public static final HTMLAttribute ONBLUR = new HTMLAttribute("onblur"); //$NON-NLS-1$
	public static final HTMLAttribute ONCLICK = new HTMLAttribute("onclick"); //$NON-NLS-1$
	public static final HTMLAttribute ONDBLCLICK = new HTMLAttribute("ondblclick"); //$NON-NLS-1$
	public static final HTMLAttribute ONMOUSEOVER = new HTMLAttribute("onmouseover"); //$NON-NLS-1$
	public static final HTMLAttribute TARGET = new HTMLAttribute("target"); //$NON-NLS-1$
	public static final HTMLAttribute HREF = new HTMLAttribute("href"); //$NON-NLS-1$
	public static final HTMLAttribute ALT = new HTMLAttribute("alt"); //$NON-NLS-1$
	public static final HTMLAttribute TITLE = new HTMLAttribute("title"); //$NON-NLS-1$
	public static final HTMLAttribute STYLE = new HTMLAttribute("style"); //$NON-NLS-1$

	protected String name;

	public HTMLAttribute(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
