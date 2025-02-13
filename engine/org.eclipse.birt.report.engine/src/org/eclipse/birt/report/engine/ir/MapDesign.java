/*******************************************************************************
 * Copyright (c) 2004,2009 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.ir;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 */
public class MapDesign {

	/**
	 * rules defined in this map
	 */
	protected ArrayList<MapRuleDesign> rules = new ArrayList<MapRuleDesign>();

	/**
	 * get the rule count.
	 * 
	 * @return total rule count defined in this map.
	 */
	public int getRuleCount() {
		return this.rules.size();
	}

	/**
	 * add map rule.
	 * 
	 * @param rule rule to be added
	 */
	public void addRule(MapRuleDesign rule) {
		this.rules.add(rule);
	}

	/**
	 * get rule at index.
	 * 
	 * @param index rule index
	 * @return rule
	 */
	public MapRuleDesign getRule(int index) {
		assert (index >= 0 && index < this.rules.size());
		return (MapRuleDesign) this.rules.get(index);
	}

	public Collection<MapRuleDesign> getRules() {
		return rules;
	}
}
