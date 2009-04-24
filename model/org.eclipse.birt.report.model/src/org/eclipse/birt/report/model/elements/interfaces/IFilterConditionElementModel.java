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

package org.eclipse.birt.report.model.elements.interfaces;

/**
 * 
 */
public interface IFilterConditionElementModel
{

	/**
	 * Name of the filter operator property.
	 */

	String OPERATOR_PROP = "operator"; //$NON-NLS-1$

	/**
	 * Name of the filter expression property.
	 */

	String EXPR_PROP = "expr"; //$NON-NLS-1$

	/**
	 * Name of the filter value 1 expression property.
	 */

	String VALUE1_PROP = "value1"; //$NON-NLS-1$

	/**
	 * Name of the filter value 2 expression property.
	 */

	String VALUE2_PROP = "value2"; //$NON-NLS-1$

	/**
	 * Name of the filter target property.
	 */

	String FILTER_TARGET_PROP = "filterTarget"; //$NON-NLS-1$

	/**
	 * Name of the property that gives the member value.
	 */

	String MEMBER_PROP = "member"; //$NON-NLS-1$

	/**
	 * Name of the property that indicates whether this filter is optional or
	 * not.
	 */

	String IS_OPTIONAL_PROP = "isOptional"; //$NON-NLS-1$
	
	/**
	 * Name of the property that indicates the extension name defined to map to a
	 * BIRT filter operator.
	 */

	String EXTENSION_NAME_PROP = "extensionName"; //$NON-NLS-1$

	/**
	 * Name of the property that indicates the unique id of a custom filter expression
	 * contributed and defined by the extension.
	 */
	
	String EXTENSION_EXPR_ID_PROP = "extensionExprId"; //$NON-NLS-1$
	
	/**
	 * Name of the property that indicates if the current filter condition will be pushed
	 * down to the database.
	 */
	
	String PUSH_DOWN_PROP = "pushDown"; //$NON-NLS-1$
	
	/**
	 * Name of the property that indicates the name of the dynamic filter parameter to reference.  
	 */
	
	String DYNAMIC_FILTER_PARAMETER_PROP = "dynamicFilterParameter";//$NON-NLS-1$

}
