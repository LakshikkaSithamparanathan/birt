/*******************************************************************************
 * Copyright (c) 2011 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.layout.emitter;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import junit.framework.TestCase;

import org.eclipse.birt.report.engine.layout.emitter.TableBorderEx.Border;
import org.eclipse.birt.report.engine.layout.emitter.TableBorderEx.BorderSegment;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

class CellArea {
	int x;
	int y;
	int width;
	int height;
	BorderInfo[] borders = new BorderInfo[4];

	CellArea(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		borders[BorderInfo.TOP_BORDER] = new BorderInfo();
		borders[BorderInfo.RIGHT_BORDER] = new BorderInfo();
		borders[BorderInfo.BOTTOM_BORDER] = new BorderInfo();
		borders[BorderInfo.LEFT_BORDER] = new BorderInfo();
		defineBorders(4);
	}

	void defineBorders(int width) {
		borders[BorderInfo.TOP_BORDER].borderWidth = width;
//		borders[BorderInfo.RIGHT_BORDER].borderWidth = width;
//		borders[BorderInfo.BOTTOM_BORDER].borderWidth = width;
		borders[BorderInfo.LEFT_BORDER].borderWidth = width;
	}

	void defineBorder(int type, int width) {
		borders[type].borderWidth = width;
	}

	void defineBorder(int type, Color color) {
		borders[type].borderColor = color;
	}

	static class BorderInfo {
		public static final int TOP_BORDER = 0;
		public static final int RIGHT_BORDER = 1;
		public static final int BOTTOM_BORDER = 2;
		public static final int LEFT_BORDER = 3;

		public int borderWidth;
		public int borderStyle = org.eclipse.birt.report.engine.nLayout.area.style.BorderInfo.BORDER_STYLE_SOLID;
		public Color borderColor = Color.black;
	}
}

public class TableBorderPDFTest extends TestCase {
	private CellArea[] cells = new CellArea[9];
	int tableX = 10;
	int tableY = 10;
	PdfContentByte cb;
	int pageHeight = 1000;
	int pageWidth = 1000;

	protected void setUp() throws Exception {
		super.setUp();

		cells[0] = new CellArea(10, 10, 40, 40);
		cells[0].defineBorder(BorderInfo.TOP_BORDER, 2);
		cells[0].defineBorder(BorderInfo.TOP_BORDER, Color.blue);
		cells[0].defineBorder(BorderInfo.LEFT_BORDER, 6);
		cells[0].defineBorder(BorderInfo.LEFT_BORDER, Color.orange);
		cells[1] = new CellArea(50, 10, 40, 40);
		cells[1].defineBorder(BorderInfo.TOP_BORDER, 4);
		cells[1].defineBorder(BorderInfo.TOP_BORDER, Color.blue);
		cells[2] = new CellArea(90, 10, 40, 40);
		cells[2].defineBorder(BorderInfo.TOP_BORDER, 6);
		cells[2].defineBorder(BorderInfo.TOP_BORDER, Color.blue);
		cells[2].defineBorder(BorderInfo.RIGHT_BORDER, 6);
		cells[2].defineBorder(BorderInfo.RIGHT_BORDER, Color.orange);
		cells[3] = new CellArea(10, 50, 40, 80);
		cells[3].defineBorder(BorderInfo.LEFT_BORDER, 6);
		cells[3].defineBorder(BorderInfo.LEFT_BORDER, Color.orange);
		cells[3].defineBorder(BorderInfo.BOTTOM_BORDER, 6);
		cells[3].defineBorder(BorderInfo.BOTTOM_BORDER, Color.blue);
		cells[4] = new CellArea(50, 50, 40, 40);
		cells[4].defineBorder(BorderInfo.TOP_BORDER, 2);
		cells[5] = new CellArea(90, 50, 40, 40);
		cells[5].defineBorder(BorderInfo.LEFT_BORDER, 0);
		cells[5].defineBorder(BorderInfo.TOP_BORDER, 0);
		cells[5].defineBorder(BorderInfo.RIGHT_BORDER, 6);
		cells[5].defineBorder(BorderInfo.RIGHT_BORDER, Color.orange);
		cells[6] = null;// new CellArea( 10, 90, 40, 40 );
		cells[7] = new CellArea(50, 90, 40, 40);
		cells[7].defineBorder(BorderInfo.BOTTOM_BORDER, 4);
		cells[7].defineBorder(BorderInfo.BOTTOM_BORDER, Color.blue);
		cells[8] = new CellArea(90, 90, 40, 40);
		cells[8].defineBorder(BorderInfo.BOTTOM_BORDER, 2);
		cells[8].defineBorder(BorderInfo.BOTTOM_BORDER, Color.blue);
		cells[8].defineBorder(BorderInfo.RIGHT_BORDER, 6);
		cells[8].defineBorder(BorderInfo.RIGHT_BORDER, Color.orange);
		Document document = new Document();
		try {
			// step 2: creation of the writer
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("TableBorderPDFTest.pdf"));
			// step 3: we open the document
			Rectangle pageSize = new Rectangle(pageWidth, pageHeight);
			document.setPageSize(pageSize);
			document.open();
			// step 4: we grab the ContentByte and do some stuff with it
			cb = writer.getDirectContent();
			testBorderDraw();
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

		// step 5: we close the document
		document.close();
	}

	public void testBorderDraw() {
		TableBorderEx currentTableBorder = new TableBorderEx(tableX, tableY);
		for (int i = 0; i < cells.length; i++) {
			CellArea cell = cells[i];
			if (cell == null) {
				continue;
			}
			currentTableBorder.addRow(cell.y + cell.height);
			currentTableBorder.addColumn(cell.x + cell.width);
			if (cell.borders[BorderInfo.TOP_BORDER].borderWidth != 0) {
				currentTableBorder.setRowBorder(cell.y, cell.x, cell.x + cell.width,
						cell.borders[BorderInfo.TOP_BORDER].borderStyle,
						cell.borders[BorderInfo.TOP_BORDER].borderWidth,
						cell.borders[BorderInfo.TOP_BORDER].borderColor);

			}
			if (cell.borders[BorderInfo.LEFT_BORDER].borderWidth != 0) {
				currentTableBorder.setColumnBorder(cell.x, cell.y, cell.y + cell.height,
						cell.borders[BorderInfo.LEFT_BORDER].borderStyle,
						cell.borders[BorderInfo.LEFT_BORDER].borderWidth,
						cell.borders[BorderInfo.LEFT_BORDER].borderColor);

			}
			if (cell.borders[BorderInfo.BOTTOM_BORDER].borderWidth != 0) {
				currentTableBorder.setRowBorder(cell.y + cell.height, cell.x, cell.x + cell.width,
						cell.borders[BorderInfo.BOTTOM_BORDER].borderStyle,
						cell.borders[BorderInfo.BOTTOM_BORDER].borderWidth,
						cell.borders[BorderInfo.BOTTOM_BORDER].borderColor);
			}
			if (cell.borders[BorderInfo.RIGHT_BORDER].borderWidth != 0) {
				currentTableBorder.setColumnBorder(cell.x + cell.width, cell.y, cell.y + cell.height,
						cell.borders[BorderInfo.RIGHT_BORDER].borderStyle,
						cell.borders[BorderInfo.RIGHT_BORDER].borderWidth,
						cell.borders[BorderInfo.RIGHT_BORDER].borderColor);
			}
		}
		currentTableBorder.findBreakPoints();
		drawBorder(currentTableBorder);
	}

	void drawBorder(TableBorderEx tb) {
		Border border = null;
		// draw column borders
		int colCount = tb.columnBorders.size();
		for (Iterator i = tb.columnBorders.keySet().iterator(); i.hasNext();) {
			Integer pos = (Integer) i.next();
			if (pos == tb.tableLRX) {
				continue;
			}
			border = (Border) tb.columnBorders.get(pos);
			for (int j = 0; j < border.segments.size(); j++) {
				BorderSegment seg = (BorderSegment) border.segments.get(j);
				Border rs = (Border) tb.rowBorders.get(seg.start);
				Border re = (Border) tb.rowBorders.get(seg.end);

				int sy = rs.position + rs.width / 2;
				int ey = re.position + re.width / 2;
				int x = border.position + seg.width / 2;
				if (border.breakPoints.contains(new Integer(seg.start))) {
//					if ( seg.start == tb.tableY )
//					{
//						sy = rs.position + rs.width;
//					}
//					else
//					{
					sy = rs.position;
					// }
				}
				if (border.breakPoints.contains(new Integer(seg.end))) {
					if (seg.end == tb.tableLRY) {
						ey = re.position;
					} else {
						ey = re.position + re.width;
					}
				}
				drawLine(x, sy, x, ey, seg.style, seg.width, seg.color);
			}
		}
		// draw right table border
		border = (Border) tb.columnBorders.get(tb.tableLRX);
		for (int j = 0; j < border.segments.size(); j++) {
			BorderSegment seg = (BorderSegment) border.segments.get(j);
			Border rs = (Border) tb.rowBorders.get(seg.start);
			Border re = (Border) tb.rowBorders.get(seg.end);

			int sy = rs.position + rs.width / 2;
			int ey = re.position + re.width / 2;
			int x = border.position - seg.width / 2;
			if (border.breakPoints.contains(new Integer(seg.start))) {
//				if ( seg.start == tb.tableY )
//				{
//					sy = rs.position + rs.width;
//				}
//				else
				{
					sy = rs.position;
				}
			}
			if (border.breakPoints.contains(new Integer(seg.end))) {
				if (seg.end == tb.tableLRY) {
					ey = re.position;
				} else {
					ey = re.position + re.width;
				}
			}
			drawLine(x, sy, x, ey, seg.style, seg.width, seg.color);
		}

		// draw row borders
		int rowCount = tb.rowBorders.size();
		for (Iterator i = tb.rowBorders.keySet().iterator(); i.hasNext();) {
			Integer pos = (Integer) i.next();
			if (pos == tb.tableLRY) {
				continue;
			}

			border = (Border) tb.rowBorders.get(pos);
			for (int j = 0; j < border.segments.size(); j++) {
				BorderSegment seg = (BorderSegment) border.segments.get(j);
				Border cs = (Border) tb.columnBorders.get(seg.start);
				Border ce = (Border) tb.columnBorders.get(seg.end);
				// we can also adjust the columns in this position
				int sx = cs.position + cs.width / 2;
				int ex = ce.position + ce.width / 2;
				int y = border.position + seg.width / 2;
				if (border.breakPoints.contains(new Integer(seg.start))) {
					if (seg.start == tb.tableX && border.position != tb.tableY) {
						sx = cs.position + cs.width;
					} else {
						sx = cs.position;
					}
				}
				if (border.breakPoints.contains(new Integer(seg.end))) {
					if (seg.end == tb.tableLRX) {
						if (border.position == tb.tableY) {
							ex = ce.position;
						} else {
							ex = ce.position - ce.width;
						}
					} else {
						ex = ce.position + ce.width;
					}
				}
				drawLine(sx, y, ex, y, seg.style, seg.width, seg.color);
			}
		}
		// draw bottom table border
		border = (Border) tb.rowBorders.get(tb.tableLRY);
		for (int j = 0; j < border.segments.size(); j++) {
			BorderSegment seg = (BorderSegment) border.segments.get(j);
			Border cs = (Border) tb.columnBorders.get(seg.start);
			Border ce = (Border) tb.columnBorders.get(seg.end);
			// we can also adjust the columns in this position
			int sx = cs.position + cs.width / 2;
			int ex = ce.position + ce.width / 2;
			int y = border.position - seg.width / 2;
			if (border.breakPoints.contains(new Integer(seg.start))) {
				sx = cs.position;
			}
			if (border.breakPoints.contains(new Integer(seg.end))) {
				if (seg.end == tb.tableLRX) {
					ex = ce.position;
				} else {
					ex = ce.position + ce.width;
				}
			}
			drawLine(sx, y, ex, y, seg.style, seg.width, seg.color);
		}
	}

	private void drawLine(float startX, float startY, float endX, float endY, int style, float width, Color color) {
		startY = transformY(startY);
		endY = transformY(endY);
		cb.moveTo(startX, startY);
		cb.setLineWidth(width);
		cb.lineTo(endX, endY);
		cb.setColorStroke(color);
		cb.stroke();
	}

	private float transformY(float y) {
		return pageHeight - y;
	}

}
