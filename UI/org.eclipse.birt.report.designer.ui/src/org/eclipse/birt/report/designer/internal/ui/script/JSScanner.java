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

package org.eclipse.birt.report.designer.internal.ui.script;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.WhitespaceRule;

/**
 * Scanner for javascript editor
 */
public class JSScanner extends RuleBasedScanner {

	/**
	 * Creates a new JSScanner object.
	 * 
	 */
	public JSScanner() {
		List rules = new ArrayList();

		// Add generic whitespace rule.
		rules.add(new WhitespaceRule(new IWhitespaceDetector() {

			public boolean isWhitespace(char c) {
				return Character.isWhitespace(c);
			}
		}));

		IRule[] result = new IRule[rules.size()];
		rules.toArray(result);
		setRules(result);
	}

}