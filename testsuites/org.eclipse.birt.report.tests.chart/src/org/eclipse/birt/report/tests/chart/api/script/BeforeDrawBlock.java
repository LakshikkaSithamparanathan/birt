/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation. All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Actuate Corporation -
 * initial API and implementation
 ******************************************************************************/

package org.eclipse.birt.report.tests.chart.api.script;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.LineAttributesImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.birt.report.tests.chart.ChartTestCase;

/**
 * Description:
 * </p>
 * fuction beforeDrawBlock()
 * </p>
 */

public class BeforeDrawBlock extends ChartTestCase {

	private static String OUTPUT = "BeforeDrawBlock.jpg"; //$NON-NLS-1$

	/**
	 * A chart model instance
	 */
	private Chart cm = null;

	/**
	 * The swing rendering device
	 */
	private IDeviceRenderer dRenderer = null;

	private GeneratedChartState gcs = null;

	/**
	 * execute application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new BeforeDrawBlock();
	}

	/**
	 * Constructor
	 */
	public BeforeDrawBlock() {
		final PluginSettings ps = PluginSettings.instance();
		try {
			dRenderer = ps.getDevice("dv.JPG");//$NON-NLS-1$

		} catch (ChartException ex) {
			ex.printStackTrace();
		}
		cm = createLineChart();
		BufferedImage img = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		Graphics2D g2d = (Graphics2D) g;
		dRenderer.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, g2d);
		dRenderer.setProperty(IDeviceRenderer.FILE_IDENTIFIER, this.genOutputFile(OUTPUT)); // $NON-NLS-1$

		Bounds bo = BoundsImpl.create(0, 0, 600, 600);
		bo.scale(72d / dRenderer.getDisplayServer().getDpiResolution());

		Generator gr = Generator.instance();

		try {
			gcs = gr.build(dRenderer.getDisplayServer(), cm, bo, null, null, null);
			gr.render(dRenderer, gcs);
		} catch (ChartException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates a line chart model as a reference implementation
	 * 
	 * @return An instance of the simulated runtime chart model (containing filled
	 *         datasets)
	 */
	public static final Chart createLineChart() {
		ChartWithAxes cwaLine = ChartWithAxesImpl.create();

		// TODO: research running script under plugin test.
		cwaLine.getBlock().setVisible(true);

		cwaLine.setScript("function beforeDrawBlock(block, scriptContext)" //$NON-NLS-1$
				+ "{importPackage(Packages.org.eclipse.birt.chart.model.attribute.impl); "//$NON-NLS-1$
				+ "if (block.isLegend())" //$NON-NLS-1$
				+ "{block.getOutline().setVisible( true ); "//$NON-NLS-1$
				+ "block.getOutline().getColor().set(21,244,231);}" //$NON-NLS-1$
				+ "else if (block.isPlot()) "//$NON-NLS-1$
				+ "{block.getOutline().setVisible( true );" //$NON-NLS-1$
				+ "block.getOutline().getColor().set(244,21,231);}"//$NON-NLS-1$
				+ "else if (block.isTitle())" //$NON-NLS-1$
				+ "{block.getOutline().setVisible( true );"//$NON-NLS-1$
				+ "block.setBackground(ColorDefinitionImpl.CREAM());" //$NON-NLS-1$
				+ "block.getOutline().getColor().set(0,0,0);}}" //$NON-NLS-1$
		);

		// Chart Type
		cwaLine.setType("Line Chart");
		cwaLine.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);

		// Title
		cwaLine.getTitle().getLabel().getCaption().setValue("Computer Hardware Sales"); //$NON-NLS-1$
		cwaLine.getBlock().setBackground(ColorDefinitionImpl.WHITE());

		// Plot
		cwaLine.getPlot().getClientArea().getOutline().setVisible(true);
		cwaLine.getPlot().getClientArea().setBackground(ColorDefinitionImpl.create(255, 255, 225));

		// Legend
		Legend lg = cwaLine.getLegend();
		lg.setVisible(true);

		// X-Axis
		Axis xAxisPrimary = ((ChartWithAxesImpl) cwaLine).getPrimaryBaseAxes()[0];
		xAxisPrimary.getTitle().setVisible(false);
		xAxisPrimary.setType(AxisType.TEXT_LITERAL);
		xAxisPrimary.getOrigin().setType(IntersectionType.VALUE_LITERAL);

		xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
		xAxisPrimary.getMajorGrid().getLineAttributes().setStyle(LineStyle.DOTTED_LITERAL);
		xAxisPrimary.getMajorGrid().getLineAttributes().setColor(ColorDefinitionImpl.GREY());
		xAxisPrimary.getMajorGrid().getLineAttributes().setVisible(true);
		xAxisPrimary.setLineAttributes(
				LineAttributesImpl.create(ColorDefinitionImpl.create(239, 33, 3), LineStyle.SOLID_LITERAL, 1));

		// Y-Axis
		Axis yAxisPrimary = ((ChartWithAxesImpl) cwaLine).getPrimaryOrthogonalAxis(xAxisPrimary);
		yAxisPrimary.getLabel().getCaption().setValue("Sales Growth"); //$NON-NLS-1$
		yAxisPrimary.getLabel().getCaption().setColor(ColorDefinitionImpl.BLUE());

		yAxisPrimary.getTitle().setVisible(false);
		yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
		yAxisPrimary.getOrigin().setType(IntersectionType.VALUE_LITERAL);

		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
		yAxisPrimary.getMajorGrid().getLineAttributes().setStyle(LineStyle.DOTTED_LITERAL);
		yAxisPrimary.getMajorGrid().getLineAttributes().setColor(ColorDefinitionImpl.GREY());
		yAxisPrimary.getMajorGrid().getLineAttributes().setVisible(true);

		// Data Set
		TextDataSet dsStringValue = TextDataSetImpl
				.create(new String[] { "Keyboards", "Moritors", "Printers", "Mortherboards" });
		NumberDataSet dsNumericValues1 = NumberDataSetImpl.create(new double[] { 143.26, 156.55, 95.25, 47.56 });

		// X-Series
		Series seBase = SeriesImpl.create();
		seBase.setDataSet(dsStringValue);

		SeriesDefinition sdX = SeriesDefinitionImpl.create();
		xAxisPrimary.getSeriesDefinitions().add(sdX);
		sdX.getSeries().add(seBase);

		// Y-Series
		LineSeries ls = (LineSeries) LineSeriesImpl.create();
		ls.setSeriesIdentifier("Actuate"); //$NON-NLS-1$
		ls.getLabel().getCaption().setColor(ColorDefinitionImpl.RED());
		ls.setLineAttributes(
				LineAttributesImpl.create(ColorDefinitionImpl.create(239, 33, 3), LineStyle.SOLID_LITERAL, 1));
		ls.getLabel().setBackground(ColorDefinitionImpl.CYAN());
		ls.getLabel().setVisible(true);
		ls.setDataSet(dsNumericValues1);
		ls.setStacked(true);

		SeriesDefinition sdY = SeriesDefinitionImpl.create();
		yAxisPrimary.getSeriesDefinitions().add(sdY);
		sdY.getSeriesPalette().update(ColorDefinitionImpl.BLUE());
		sdY.getSeries().add(ls);

		return cwaLine;

	}
}