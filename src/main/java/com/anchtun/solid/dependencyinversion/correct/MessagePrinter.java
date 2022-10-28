package com.anchtun.solid.dependencyinversion.correct;

import java.io.IOException;
import java.io.PrintWriter;

import com.anchtun.solid.dependencyinversion.formatter.Formatter;
import com.anchtun.solid.dependencyinversion.model.Message;

public class MessagePrinter {

	// Writes message to a file
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {
		//But in real life, you will have only the business logic here.
		writer.println(formatter.format(msg)); // formats and writes message
		writer.flush();
	}
}
