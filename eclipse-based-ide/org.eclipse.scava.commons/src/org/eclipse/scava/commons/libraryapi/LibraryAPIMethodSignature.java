/*********************************************************************
* Copyright (c) 2017 FrontEndART Software Ltd.
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*    Zsolt J�nos Szamosv�lgyi
*    Endre Tam�s V�radi
*    Gerg� Balogh
**********************************************************************/
package org.eclipse.scava.commons.libraryapi;

/**
 * Provides a representation of a method in an api.
 * 
 */
public class LibraryAPIMethodSignature extends LibraryAPIElement {
	private final String signature;
	
	public LibraryAPIMethodSignature(String signature) {
		super(LibraryAPIElementKind.METHOD_SIGNATURE);
		this.signature = signature;
	}
	
	public String getSignature() {
		return signature;
	}
	
	@Override
	public String toString() {
		return "LibraryMethodSignatureChange [signature=" + signature + "]";
	}
	
}
