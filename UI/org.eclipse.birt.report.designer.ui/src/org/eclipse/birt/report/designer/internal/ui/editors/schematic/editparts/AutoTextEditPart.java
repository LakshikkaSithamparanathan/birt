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

package org.eclipse.birt.report.designer.internal.ui.editors.schematic.editparts;

import org.eclipse.birt.report.model.api.AutoTextHandle;
import org.eclipse.birt.report.model.elements.interfaces.IDesignElementModel;

/**
 * Provides support for AutoText edit parts.
 */

public class AutoTextEditPart extends LabelEditPart {
	// private static final String ELEMENT_DEFAULT_TEXT = Messages.getString(
	// "AutoTextEditPart.Figure.Default" );//$NON-NLS-1$
	private static final String ELEMENT_DEFAULT_TEXT = "text";//$NON-NLS-1$

	public AutoTextEditPart(Object model) {
		super(model);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.birt.report.designer.internal.ui.editors.schematic.editparts.
	 * LabelEditPart#performDirectEdit()
	 */
	public void performDirectEdit() {
		// donothing
	}

	/**
	 * Get the text shown on label.
	 * 
	 * @return The text shown on label
	 */
	protected String getText() {
		String text = ((AutoTextHandle) getModel()).getDisplayLabel(IDesignElementModel.FULL_LABEL);
		if (text == null) {
			text = ELEMENT_DEFAULT_TEXT;
		}
		return text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.birt.report.designer.internal.ui.editors.schematic.editparts.
	 * LabelEditPart#hasText()
	 */
	protected boolean hasText() {
		return true;
	}
}
