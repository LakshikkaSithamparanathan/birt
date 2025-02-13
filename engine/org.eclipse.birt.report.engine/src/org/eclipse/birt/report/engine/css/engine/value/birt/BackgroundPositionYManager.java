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
package org.eclipse.birt.report.engine.css.engine.value.birt;

import org.eclipse.birt.report.engine.css.engine.CSSEngine;
import org.eclipse.birt.report.engine.css.engine.CSSStylableElement;
import org.eclipse.birt.report.engine.css.engine.ValueManager;
import org.eclipse.birt.report.engine.css.engine.value.AbstractLengthManager;
import org.eclipse.birt.report.engine.css.engine.value.StringMap;
import org.eclipse.birt.report.engine.css.engine.value.Value;
import org.eclipse.birt.report.engine.css.engine.value.css.CSSConstants;
import org.eclipse.birt.report.engine.css.engine.value.css.CSSValueConstants;
import org.w3c.css.sac.LexicalUnit;
import org.w3c.dom.DOMException;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.CSSValue;

public class BackgroundPositionYManager extends AbstractLengthManager {

	/**
	 * The identifier values.
	 */
	protected final static StringMap values = new StringMap();
	static {
		values.put(CSSConstants.CSS_TOP_VALUE, CSSValueConstants.TOP_VALUE);
		values.put(CSSConstants.CSS_CENTER_VALUE, CSSValueConstants.CENTER_VALUE);
		values.put(CSSConstants.CSS_BOTTOM_VALUE, CSSValueConstants.BOTTOM_VALUE);
	}

	protected final static StringMap percentValues = new StringMap();
	static {
		percentValues.put(CSSConstants.CSS_TOP_VALUE, CSSValueConstants.PERCENT_0);
		percentValues.put(CSSConstants.CSS_CENTER_VALUE, CSSValueConstants.PERCENT_50);
		percentValues.put(CSSConstants.CSS_BOTTOM_VALUE, CSSValueConstants.PERCENT_100);
	}

	public BackgroundPositionYManager() {
	}

	public String getPropertyName() {
		return BIRTConstants.BIRT_BACKGROUND_POSITION_Y_PROPERTY;
	}

	public boolean isInheritedProperty() {
		return false;
	}

	public Value getDefaultValue() {
		return CSSValueConstants.PERCENT_0;
	}

	public Value createValue(LexicalUnit lu, CSSEngine engine) throws DOMException {
		switch (lu.getLexicalUnitType()) {
		case LexicalUnit.SAC_IDENT:
			String s = lu.getStringValue().toLowerCase().intern();
			Object v = values.get(s);
			if (v == null) {
				throw createInvalidIdentifierDOMException(lu.getStringValue());
			}
			return (Value) v;
		}
		return super.createValue(lu, engine);
	}

	/**
	 * Implements
	 * {@link ValueManager#computeValue(CSSStylableElement,String,CSSEngine,int,StyleMap,Value)}.
	 */
	public Value computeValue(CSSStylableElement elt, CSSEngine engine, int idx, Value value) {
		if (value.getCssValueType() == CSSValue.CSS_PRIMITIVE_VALUE) {
			if (value.getPrimitiveType() == CSSPrimitiveValue.CSS_IDENT) {
				Value percentage = (Value) percentValues.get(value.getStringValue());
				if (percentage != null) {
					return percentage;
				}
				throw createInvalidIdentifierDOMException(value.getStringValue());
			}
		}
		return super.computeValue(elt, engine, idx, value);
	}
}
