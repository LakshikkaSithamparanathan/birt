
package org.eclipse.birt.report.engine.ir;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.eclipse.birt.report.engine.EngineCase;
import org.eclipse.birt.report.engine.parser.ReportDesignWriter;
import org.eclipse.birt.report.engine.parser.ReportParser;

public class EngineIRIOTest extends EngineCase {

	// static final String DESIGN_STREAM =
	// "org/eclipse/birt/report/engine/ir/ir_io_test.rptdesign";

	public void testIO() throws Exception {
		String[] designStreams = new String[] { "ir_io_test.rptdesign", "action_test.rptdesign",
				"bookmark_test.rptdesign", "cell_test.rptdesign", "highlight_test.rptdesign", "image_test.rptdesign",
				"map_test.rptdesign", "report_item_test.rptdesign", "text_test.rptdesign", "toc_test.rptdesign",
				"user_property_test.rptdesign", "visibility_test.rptdesign" };

		for (int i = 0; i < designStreams.length; i++) {
			doTestIO(designStreams[i], i);
		}
	}

	public void doTestIO(String designName, int i) throws Exception {
		// load the report design
		Class<?> clz = i == 0 ? this.getClass() : org.eclipse.birt.report.engine.parser.EngineIRParserTest.class;
		InputStream input = clz.getResourceAsStream(designName);
		Report report = new ReportParser().parse(".", input);
		assertTrue(report != null);

		// write it into the stream
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		new EngineIRWriter().write(out, report);
		out.close();

		// load it from the stream
		InputStream in = new ByteArrayInputStream(out.toByteArray());
		EngineIRReader reader = new EngineIRReader();
		Report report2 = reader.read(in);
		reader.link(report2, report.getReportDesign());
		// check if the report 2 equals the report 1
		ByteArrayOutputStream out1 = new ByteArrayOutputStream();
		ByteArrayOutputStream out2 = new ByteArrayOutputStream();

		ReportDesignWriter writer = new ReportDesignWriter();

		writer.write(out1, report);
		writer.write(out2, report2);

		String golden = new String(out1.toByteArray());
		String value = new String(out2.toByteArray());

		assertEquals(golden, value);
	}

}
