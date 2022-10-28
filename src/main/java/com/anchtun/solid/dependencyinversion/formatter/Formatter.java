package com.anchtun.solid.dependencyinversion.formatter;

import com.anchtun.solid.dependencyinversion.exception.FormatException;
import com.anchtun.solid.dependencyinversion.model.Message;

//Common interface for classes formatting Message object
public interface Formatter {

	public String format(Message message) throws FormatException;

}