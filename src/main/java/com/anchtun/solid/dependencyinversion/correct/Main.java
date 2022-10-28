package com.anchtun.solid.dependencyinversion.correct;

import java.io.IOException;
import java.io.PrintWriter;

import com.anchtun.solid.dependencyinversion.formatter.JSONFormatter;
import com.anchtun.solid.dependencyinversion.formatter.TextFormatter;
import com.anchtun.solid.dependencyinversion.model.Message;
import com.anchtun.utility.DateUtility;

//And if you're using something like spring or spring boot, you are already making use of dependency inversion.
//The auto wiring that happens these spring beans those are all utilizing the dependency inversion principle.

public class Main {

	public static void main(String[] args) throws IOException {
		Message msg = new Message("Assalam Alaykom", DateUtility.getCurrentDate());
		MessagePrinter printer = new MessagePrinter();
		try (PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
			printer.writeMessage(msg, new TextFormatter(), writer);
		}
	}
}