/*******************************************************************************
 * Copyright (c) 2007 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.item.crosstab.core.script;

import org.eclipse.birt.report.engine.api.script.ScriptException;
import org.eclipse.birt.report.engine.api.script.instance.IScriptStyle;
import org.eclipse.birt.report.item.crosstab.core.ICrosstabConstants;

/**
 * ICrosstabInstance
 */
public interface ICrosstabInstance extends ICrosstabConstants {

	String getCaption();

	void setCaption(String caption);

	String getCaptionKey();

	void setCaptionKey(String captionKey);

	String getSummary();

	void setSummary(String summary);

	boolean isRepeatColumnHeader();

	void setRepeatColumnHeader(boolean repeat);

	boolean isRepeatRowHeader();

	void setRepeatRowHeader(boolean repeat);

	String getName();

	void setName(String name);

	String getHelpText();

	void setHelpText(String helpText);

	IScriptStyle getStyle();

	String getHorizontalPosition();

	void setHorizontalPosition(String position);

	String getVerticalPosition();

	void setVerticalPosition(String position);

	String getWidth();

	void setWidth(String width);

	String getHeight();

	void setHeight(String height);

	Object getNamedExpressionValue(String name);

	Object getUserPropertyValue(String name);

	void setUserPropertyValue(String name, Object value) throws ScriptException;
}
