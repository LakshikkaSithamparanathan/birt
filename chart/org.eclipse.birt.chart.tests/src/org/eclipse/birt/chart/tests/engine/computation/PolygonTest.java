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

package org.eclipse.birt.chart.tests.engine.computation;

import junit.framework.TestCase;

import org.eclipse.birt.chart.computation.Point;
import org.eclipse.birt.chart.computation.Polygon;

public class PolygonTest extends TestCase {

	Polygon po;

	protected void setUp() throws Exception {
		po = new Polygon();
		po.add(-117, -55);
		po.add(0, -55);
		po.add(0, -36);
		po.add(-117, -36);
	}

	protected void tearDown() throws Exception {
		po = null;
	}

	public void testContains() {
		assertTrue("Test inside the polygon", po.contains(new Point(-4.1, -48)));

		assertTrue("Test in the boundary line", po.contains(new Point(0, -48)));

		assertTrue("Test in the vertext", po.contains(new Point(0, -55)));

		assertFalse("Test outside the polygon", po.contains(new Point(0.1, -55)));

		assertFalse("Test outside the polygon", po.contains(new Point(-0.1, -148)));

		assertFalse("Test outside the polygon", po.contains(new Point(0, -148)));
	}

}
