package com.anchtun.solid.dependencyinversion.wrong;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.anchtun.solid.dependencyinversion.formatter.Formatter;
import com.anchtun.solid.dependencyinversion.formatter.JSONFormatter;
import com.anchtun.solid.dependencyinversion.model.Message;

public class MessagePrinter {

	// Writes message to a file
	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter();// creates formatter
		try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { // creates print writer
			writer.println(formatter.format(msg)); // formats and writes message
			writer.flush();
		}
	}
}