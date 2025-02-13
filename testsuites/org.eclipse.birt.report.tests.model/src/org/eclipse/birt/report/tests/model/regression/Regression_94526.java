/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation. All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Actuate Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.birt.report.tests.model.regression;

import org.eclipse.birt.report.model.api.DesignFileException;
import org.eclipse.birt.report.tests.model.BaseTestCase;

/**
 * Regression description:
 * </p>
 * If you have a data set parameter in a report, and then you remove the
 * parameter, an error is generated when trying to preview the report: There are
 * errors on the report page:
 * <p>
 * Error1:Fails to handle Table null:null
 * <p>
 * The only way to get rid of this error condition is to remove the data binding
 * and then add it back in.
 * <p>
 * Model may need perform some checking for redundant dataset parameter binding
 * while saving the report.
 * </p>
 * Test description:
 * <p>
 * 
 * </p>
 */
public class Regression_94526 extends BaseTestCase {

	private final static String INPUT = "regression_94526.xml"; //$NON-NLS-1$

	/**
	 * @throws DesignFileException
	 */

	public void setUp() throws Exception {
		super.setUp();
		copyResource_INPUT(INPUT, INPUT);
		System.out.println(INPUT);
	}

	public void tearDown() {
		removeResource();
	}

	public void test_regression_94526() throws DesignFileException {
		openDesign(INPUT);

		// TODO: under review
	}
}
