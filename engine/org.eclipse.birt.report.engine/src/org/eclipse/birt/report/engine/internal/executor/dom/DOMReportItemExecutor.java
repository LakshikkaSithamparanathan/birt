
package org.eclipse.birt.report.engine.internal.executor.dom;

import java.util.Iterator;

import org.eclipse.birt.report.engine.content.IContent;
import org.eclipse.birt.report.engine.extension.IReportItemExecutor;
import org.eclipse.birt.report.engine.extension.ReportItemExecutorBase;

public class DOMReportItemExecutor extends ReportItemExecutorBase {

	IContent content;
	DOMReportItemExecutorManager manager;
	boolean cloneContent;

	DOMReportItemExecutor(DOMReportItemExecutorManager manager) {
		this.manager = manager;
		this.cloneContent = manager.cloneContent;
	}

	public DOMReportItemExecutor(IContent content, boolean cloneContent) {
		this.content = content;
		this.cloneContent = cloneContent;
		this.manager = new DOMReportItemExecutorManager(cloneContent);
	}

	public DOMReportItemExecutor(IContent content) {
		this(content, false);
	}

	void setContent(IContent content) {
		this.content = content;
	}

	public IContent getContent() {
		return this.content;
	}

	public void close() {
		manager.releaseExecutor(this);
	}

	public IContent execute() {
		if (null == content) {
			return null;
		}
		childIterator = content.getChildren().iterator();
		if (cloneContent) {
			content = content.cloneContent(false);
			IReportItemExecutor parent = getParent();
			if (parent != null) {
				content.setParent(parent.getContent());
			}
		}
		return content;
	}

	Iterator childIterator;

	public IReportItemExecutor getNextChild() {
		if (null != childIterator && childIterator.hasNext()) {
			IContent child = (IContent) childIterator.next();
			return manager.createExecutor(this, child);
		}
		return null;
	}

	public boolean hasNextChild() {
		if (null == childIterator) {
			return false;
		}
		return childIterator.hasNext();
	}

}
