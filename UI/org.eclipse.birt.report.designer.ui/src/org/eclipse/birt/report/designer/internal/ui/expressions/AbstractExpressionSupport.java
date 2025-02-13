/*******************************************************************************
 * Copyright (c) 2009 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.internal.ui.expressions;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

/**
 * The adapter class for {@link IExpressionSupport}.
 */
public abstract class AbstractExpressionSupport implements IExpressionSupport {

	public IExpressionBuilder createBuilder(Shell shl, Object expression) {
		return null;
	}

	public String getDisplayName() {
		return null;
	}

	public Image getImage() {
		return null;
	}

	public String getName() {
		return null;
	}

	public IExpressionConverter getConverter() {
		return null;
	}

}