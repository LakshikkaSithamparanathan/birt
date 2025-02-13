/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.component;

import org.eclipse.birt.chart.model.IChartObject;
import org.eclipse.birt.chart.model.attribute.Anchor;
import org.eclipse.birt.chart.model.attribute.Cursor;
import org.eclipse.birt.chart.model.attribute.Fill;
import org.eclipse.birt.chart.model.attribute.FormatSpecifier;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.data.DataElement;
import org.eclipse.birt.chart.model.data.Trigger;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Marker
 * Range</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * This type defines a marker area. It is intended for use as a range marker
 * associated with an Axis.
 * 
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.birt.chart.model.component.MarkerRange#getOutline
 * <em>Outline</em>}</li>
 * <li>{@link org.eclipse.birt.chart.model.component.MarkerRange#getFill
 * <em>Fill</em>}</li>
 * <li>{@link org.eclipse.birt.chart.model.component.MarkerRange#getStartPosition
 * <em>Start Position</em>}</li>
 * <li>{@link org.eclipse.birt.chart.model.component.MarkerRange#getEndPosition
 * <em>End Position</em>}</li>
 * <li>{@link org.eclipse.birt.chart.model.component.MarkerRange#getAssociatedLabel
 * <em>Associated Label</em>}</li>
 * <li>{@link org.eclipse.birt.chart.model.component.MarkerRange#getLabelPosition
 * <em>Label Position</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange()
 * @model
 * @generated
 */
public interface MarkerRange extends IChartObject {

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * Specify the outline properties for the marker range.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Outline</em>' containment reference.
	 * @see #setOutline(LineAttributes)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_Outline()
	 * @model containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	LineAttributes getOutline();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getOutline
	 * <em>Outline</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Outline</em>' containment reference.
	 * @see #getOutline()
	 * @generated
	 */
	void setOutline(LineAttributes value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * Specify the background for the marker range.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Fill)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_Fill()
	 * @model containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	Fill getFill();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getFill
	 * <em>Fill</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Fill value);

	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * Defines where this area starts relative to the axis scale.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Start Value</em>' containment reference.
	 * @see #setStartValue(DataElement)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_StartValue()
	 * @model containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	DataElement getStartValue();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getStartValue
	 * <em>Start Value</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Start Value</em>' containment
	 *              reference.
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(DataElement value);

	/**
	 * Returns the value of the '<em><b>End Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * Defines where this area is ends relative to the axis scale.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>End Value</em>' containment reference.
	 * @see #setEndValue(DataElement)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_EndValue()
	 * @model containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	DataElement getEndValue();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getEndValue
	 * <em>End Value</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>End Value</em>' containment reference.
	 * @see #getEndValue()
	 * @generated
	 */
	void setEndValue(DataElement value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * Specifies the label associated with this area.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_Label()
	 * @model containment="true" resolveProxies="false" required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getLabel
	 * <em>Label</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Label Anchor</b></em>' attribute. The
	 * default value is <code>"North"</code>. The literals are from the enumeration
	 * {@link org.eclipse.birt.chart.model.attribute.Anchor}. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * Specifies where the label associated with this line is to be positioned
	 * within respect to the marker range itself.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Anchor</em>' attribute.
	 * @see org.eclipse.birt.chart.model.attribute.Anchor
	 * @see #isSetLabelAnchor()
	 * @see #unsetLabelAnchor()
	 * @see #setLabelAnchor(Anchor)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_LabelAnchor()
	 * @model default="North" unique="false" unsettable="true" required="true"
	 * @generated
	 */
	Anchor getLabelAnchor();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.birt.chart.model.component.MarkerRange#getLabelAnchor
	 * <em>Label Anchor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Label Anchor</em>' attribute.
	 * @see org.eclipse.birt.chart.model.attribute.Anchor
	 * @see #isSetLabelAnchor()
	 * @see #unsetLabelAnchor()
	 * @see #getLabelAnchor()
	 * @generated
	 */
	void setLabelAnchor(Anchor value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.birt.chart.model.component.MarkerRange#getLabelAnchor
	 * <em>Label Anchor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isSetLabelAnchor()
	 * @see #getLabelAnchor()
	 * @see #setLabelAnchor(Anchor)
	 * @generated
	 */
	void unsetLabelAnchor();

	/**
	 * Returns whether the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getLabelAnchor
	 * <em>Label Anchor</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Label Anchor</em>' attribute is set.
	 * @see #unsetLabelAnchor()
	 * @see #getLabelAnchor()
	 * @see #setLabelAnchor(Anchor)
	 * @generated
	 */
	boolean isSetLabelAnchor();

	/**
	 * Returns the value of the '<em><b>Format Specifier</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * -->
	 * 
	 * Specifies the formatting for marker range labels.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Format Specifier</em>' containment reference.
	 * @see #setFormatSpecifier(FormatSpecifier)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_FormatSpecifier()
	 * @model containment="true" resolveProxies="false"
	 * @generated
	 */
	FormatSpecifier getFormatSpecifier();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getFormatSpecifier
	 * <em>Format Specifier</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Format Specifier</em>' containment
	 *              reference.
	 * @see #getFormatSpecifier()
	 * @generated
	 */
	void setFormatSpecifier(FormatSpecifier value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.birt.chart.model.data.Trigger}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * Holds the triggers for the marker range.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_Triggers()
	 * @model containment="true" extendedMetaData="kind='element' name='Triggers'"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Cursor</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The element
	 * represents a cursor for marker range. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Cursor</em>' containment reference.
	 * @see #setCursor(Cursor)
	 * @see org.eclipse.birt.chart.model.component.ComponentPackage#getMarkerRange_Cursor()
	 * @model containment="true" extendedMetaData="kind='element' name='Cursor'"
	 * @generated
	 */
	Cursor getCursor();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.birt.chart.model.component.MarkerRange#getCursor
	 * <em>Cursor</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Cursor</em>' containment reference.
	 * @see #getCursor()
	 * @generated
	 */
	void setCursor(Cursor value);

	/**
	 * @generated
	 */
	MarkerRange copyInstance();

} // MarkerRange
