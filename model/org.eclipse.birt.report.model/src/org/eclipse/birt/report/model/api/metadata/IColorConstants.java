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

package org.eclipse.birt.report.model.api.metadata;

import org.eclipse.birt.report.model.metadata.ColorPropertyType;

/**
 * The interface for constants of colors used in BIRT.
 */

public interface IColorConstants {

	/**
	 * The color black. sRGB value "#000000".
	 */

	public static final String BLACK = "black"; //$NON-NLS-1$

	/**
	 * The color blue. sRGB value "#0000FF".
	 */

	public static final String BLUE = "blue"; //$NON-NLS-1$

	/**
	 * The color aqua. sRGB value "#00FFFF".
	 */

	public static final String AQUA = "aqua"; //$NON-NLS-1$
	/**
	 * The color white. sRGB value ""#FFFFFF".
	 */

	public static final String WHITE = "white"; //$NON-NLS-1$
	/**
	 * The color red. sRGB value "#FF0000".
	 */

	public static final String RED = "red"; //$NON-NLS-1$
	/**
	 * The color blue. sRGB value "#FFA500".
	 */

	public static final String ORANGE = "orange"; //$NON-NLS-1$
	/**
	 * The color silver. sRGB value "#C0C0C0".
	 */

	public static final String SILVER = "silver"; //$NON-NLS-1$
	/**
	 * The color gray. sRGB value "#808080".
	 */

	public static final String GRAY = "gray"; //$NON-NLS-1$
	/**
	 * The color maroon. sRGB value "#800000".
	 */

	public static final String MAROON = "maroon"; //$NON-NLS-1$
	/**
	 * The color purple. sRGB value "#800080".
	 */

	public static final String PURPLE = "purple"; //$NON-NLS-1$
	/**
	 * The color fuchsia. sRGB value "#FF00FF".
	 */

	public static final String FUCHSIA = "fuchsia"; //$NON-NLS-1$
	/**
	 * The color green. sRGB value "#008000".
	 */

	public static final String GREEN = "green"; //$NON-NLS-1$
	/**
	 * The color lime. sRGB value "#00FF00".
	 */

	public static final String LIME = "lime"; //$NON-NLS-1$
	/**
	 * The color olive. sRGB value "#808000".
	 */

	public static final String OLIVE = "olive"; //$NON-NLS-1$
	/**
	 * The color yellow. sRGB value "#FFFF00".
	 */

	public static final String YELLOW = "yellow"; //$NON-NLS-1$
	/**
	 * The color navy. sRGB value "#000080".
	 */

	public static final String NAVY = "navy"; //$NON-NLS-1$
	/**
	 * The color teal. sRGB value "#008080".
	 */

	public static final String TEAL = "teal"; //$NON-NLS-1$

	/**
	 * ChoiceSet name for color set.
	 */

	public static final String COLORS_CHOICE_SET = ColorPropertyType.COLORS_CHOICE_SET;

}
