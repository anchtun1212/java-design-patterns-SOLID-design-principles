package com.anchtun.designpatterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

// The component base class for composite pattern
// defines operations applicable both leaf & composite
@Data
@AllArgsConstructor
public abstract class File {

	protected String name;

	public abstract void ls();
	
	/*public abstract void addFile(File file);

	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);*/
}