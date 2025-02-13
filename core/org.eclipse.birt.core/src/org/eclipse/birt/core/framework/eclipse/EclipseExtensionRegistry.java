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

package org.eclipse.birt.core.framework.eclipse;

import org.eclipse.birt.core.framework.IConfigurationElement;
import org.eclipse.birt.core.framework.IExtension;
import org.eclipse.birt.core.framework.IExtensionPoint;
import org.eclipse.birt.core.framework.IExtensionRegistry;

/**
 * 
 */
public class EclipseExtensionRegistry implements IExtensionRegistry {

	org.eclipse.core.runtime.IExtensionRegistry registry;

	public EclipseExtensionRegistry(org.eclipse.core.runtime.IExtensionRegistry registry) {
		this.registry = registry;

	}

	/**
	 * @param extensionPointId
	 * @return
	 */
	public IConfigurationElement[] getConfigurationElementsFor(String extensionPointId) {
		return EclipsePlatform.wrap(registry.getConfigurationElementsFor(extensionPointId));
	}

	/**
	 * @param namespace
	 * @param extensionPointName
	 * @return
	 */
	public IConfigurationElement[] getConfigurationElementsFor(String namespace, String extensionPointName) {
		return EclipsePlatform.wrap(registry.getConfigurationElementsFor(namespace, extensionPointName));
	}

	/**
	 * @param namespace
	 * @param extensionPointName
	 * @param extensionId
	 * @return
	 */
	public IConfigurationElement[] getConfigurationElementsFor(String namespace, String extensionPointName,
			String extensionId) {
		return EclipsePlatform.wrap(registry.getConfigurationElementsFor(namespace, extensionPointName, extensionId));
	}

	/**
	 * @param extensionId
	 * @return
	 */
	public IExtension getExtension(String extensionId) {
		return EclipsePlatform.wrap(registry.getExtension(extensionId));
	}

	/**
	 * @param extensionPointId
	 * @param extensionId
	 * @return
	 */
	public IExtension getExtension(String extensionPointId, String extensionId) {
		return EclipsePlatform.wrap(registry.getExtension(extensionPointId, extensionId));
	}

	/**
	 * @param namespace
	 * @param extensionPointName
	 * @param extensionId
	 * @return
	 */
	public IExtension getExtension(String namespace, String extensionPointName, String extensionId) {
		return EclipsePlatform.wrap(registry.getExtension(namespace, extensionPointName, extensionId));
	}

	/**
	 * @param extensionPointId
	 * @return
	 */
	public IExtensionPoint getExtensionPoint(String extensionPointId) {
		return EclipsePlatform.wrap(registry.getExtensionPoint(extensionPointId));
	}

	/**
	 * @param namespace
	 * @param extensionPointName
	 * @return
	 */
	public IExtensionPoint getExtensionPoint(String namespace, String extensionPointName) {
		return EclipsePlatform.wrap(registry.getExtensionPoint(namespace, extensionPointName));
	}

	/**
	 * @return
	 */
	public IExtensionPoint[] getExtensionPoints() {
		return EclipsePlatform.wrap(registry.getExtensionPoints());
	}

	/**
	 * @param namespace
	 * @return
	 */
	public IExtensionPoint[] getExtensionPoints(String namespace) {
		return EclipsePlatform.wrap(registry.getExtensionPoints(namespace));
	}

	/**
	 * @param namespace
	 * @return
	 */
	public IExtension[] getExtensions(String namespace) {
		return EclipsePlatform.wrap(registry.getExtensions(namespace));
	}

	/**
	 * @return
	 */
	public String[] getNamespaces() {
		return registry.getNamespaces();
	}
}
