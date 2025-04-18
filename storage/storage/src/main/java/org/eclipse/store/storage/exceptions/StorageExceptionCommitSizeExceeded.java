package org.eclipse.store.storage.exceptions;

/*-
 * #%L
 * EclipseStore Storage
 * %%
 * Copyright (C) 2023 - 2025 MicroStream Software
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

public class StorageExceptionCommitSizeExceeded extends StorageException
{

	public StorageExceptionCommitSizeExceeded(String message)
	{
		super(message);
	}

	public StorageExceptionCommitSizeExceeded(int channelIndex, long commitSize)
	{
		super("Channel " + channelIndex + " store size " + commitSize  + " bytes exceeds technical limit of 2^31 bytes");
	}

}
