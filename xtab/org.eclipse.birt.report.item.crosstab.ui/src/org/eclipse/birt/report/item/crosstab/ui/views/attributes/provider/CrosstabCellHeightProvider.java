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
package org.eclipse.birt.report.item.crosstab.ui.views.attributes.provider;

import org.eclipse.birt.report.designer.internal.ui.views.attributes.provider.UnitPropertyDescriptorProvider;
import org.eclipse.birt.report.designer.ui.util.ExceptionUtil;
import org.eclipse.birt.report.designer.util.DEUtil;
import org.eclipse.birt.report.item.crosstab.core.de.CrosstabCellHandle;
import org.eclipse.birt.report.model.api.ExtendedItemHandle;
import org.eclipse.birt.report.model.api.activity.SemanticException;
import org.eclipse.birt.report.model.api.metadata.DimensionValue;

public class CrosstabCellHeightProvider extends UnitPropertyDescriptorProvider
{

	public CrosstabCellHeightProvider( String property, String element )
	{
		super( property, element );
	}

	public Object load( )
	{
		String text = null;
		try
		{
			ExtendedItemHandle handle = (ExtendedItemHandle) DEUtil.getInputFirstElement( input );
			if ( handle.getReportItem( ) instanceof CrosstabCellHandle )
			{
				CrosstabCellHandle cell = (CrosstabCellHandle) handle.getReportItem( );
				text = cell.getCrosstab( )
						.getRowHeight( cell )
						.getStringValue( );
			}
		}
		catch ( Exception e )
		{
			ExceptionUtil.handle( e );
		}
		if ( text == null )
			return "";
		else
			return text;
	}

	public void save( Object value ) throws SemanticException
	{
		if ( value == null )
			return;
		DimensionValue dimensionValue = DimensionValue.parse( value.toString( ) );
		try
		{
			ExtendedItemHandle handle = (ExtendedItemHandle) DEUtil.getInputFirstElement( input );
			if ( handle.getReportItem( ) instanceof CrosstabCellHandle )
			{
				CrosstabCellHandle cell = (CrosstabCellHandle) handle.getReportItem( );
				cell.getCrosstab( ).setRowHeight( cell, dimensionValue );
			}
		}
		catch ( Exception e )
		{
			ExceptionUtil.handle( e );
		}
	}
}
