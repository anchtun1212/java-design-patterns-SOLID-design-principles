package com.anchtun.solid.dependencyinversion.wrong;

import java.io.IOException;

import com.anchtun.solid.dependencyinversion.model.Message;
import com.anchtun.utility.DateUtility;

public class Main {

	public static void main(String[] args) throws IOException {
		Message msg = new Message("Hello, I hope you are fine!!", DateUtility.getCurrentDate());
		MessagePrinter printer = new MessagePrinter();
		printer.writeMessage(msg, "/home/mayman/hello.txt");
	}
}