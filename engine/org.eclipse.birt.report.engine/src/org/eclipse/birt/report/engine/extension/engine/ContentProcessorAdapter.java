/*******************************************************************************
 * Copyright (c) 2008 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.extension.engine;

import org.eclipse.birt.report.engine.api.EngineException;
import org.eclipse.birt.report.engine.content.IContent;
import org.eclipse.birt.report.engine.content.IReportContent;

public class ContentProcessorAdapter implements IContentProcessor {

	public void end(IReportContent report) throws EngineException {
	}

	public void endContent(IContent content) throws EngineException {
	}

	public void start(IReportContent report) throws EngineException {
	}

	public void startContent(IContent content) throws EngineException {
	}
}
