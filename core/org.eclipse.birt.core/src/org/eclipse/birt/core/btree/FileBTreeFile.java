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

package org.eclipse.birt.core.btree;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileBTreeFile implements BTreeFile, Closeable {

	private RandomAccessFile file;
	private int totalBlock;

	public FileBTreeFile(String fileName) throws IOException {
		new File(fileName).getParentFile().mkdirs();
		this.file = new RandomAccessFile(fileName, "rw");
		this.totalBlock = (int) ((file.length() + BLOCK_SIZE - 1) / BLOCK_SIZE);
	}

	public void close() throws IOException {
		if (file != null) {
			try {
				file.close();
			} finally {
				file = null;
			}
		}
	}

	public int allocBlock() throws IOException {
		int blockId = totalBlock++;
		file.setLength((long) blockId * BLOCK_SIZE);
		return blockId;
	}

	public int getTotalBlock() throws IOException {
		return totalBlock;
	}

	public Object lock() throws IOException {
		return this;
	}

	public void readBlock(int blockId, byte[] bytes) throws IOException {
		file.seek((long) blockId * BLOCK_SIZE);
		int readSize = bytes.length;
		if (readSize > BLOCK_SIZE) {
			readSize = BLOCK_SIZE;
		}
		file.read(bytes, 0, readSize);
	}

	public void unlock(Object lock) throws IOException {
	}

	public void writeBlock(int blockId, byte[] bytes) throws IOException {
		int writeSize = bytes.length;
		if (writeSize > BLOCK_SIZE) {
			writeSize = BLOCK_SIZE;
		}
		file.seek((long) blockId * BLOCK_SIZE);
		file.write(bytes, 0, writeSize);
		if (blockId >= totalBlock) {
			totalBlock = blockId + 1;
		}
	}
}
