/*************************************************************************************
 * Copyright (c) 2011, 2012, 2013 James Talbut.
 *  jim-emitters@spudsoft.co.uk
 *  
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     James Talbut - Initial implementation.
 ************************************************************************************/

package uk.co.spudsoft.birt.emitters.excel.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.birt.core.exception.BirtException;
import org.junit.Test;

public class MegaSizeTest extends ReportRunner {

	@Test
	public void testWarmup() throws BirtException, IOException {

		debug = false;
		InputStream inputStream = runAndRenderReport("MegaSize.rptdesign", "xlsx");
		assertNotNull(inputStream);
		try {

		} finally {
			inputStream.close();
		}
	}

	@Test
	public void testMegaXlsx() throws BirtException, IOException {

		debug = false;
		InputStream inputStream = runAndRenderReport("MegaSize.rptdesign", "xlsx");
		assertNotNull(inputStream);
		try {

		} finally {
			inputStream.close();
		}
	}

	@Test
	public void testMegaXls() throws BirtException, IOException {

		try {
			runAndRenderReport("MegaSize.rptdesign", "xls");
			fail("Should have failed!");
		} catch (Throwable ex) {
			assertEquals("Error happened while running the report.", ex.getMessage());
			ex = ex.getCause();
			assertEquals("Invalid row number (65536) outside allowable range (0..65535)", ex.getMessage());
		}
	}

}
