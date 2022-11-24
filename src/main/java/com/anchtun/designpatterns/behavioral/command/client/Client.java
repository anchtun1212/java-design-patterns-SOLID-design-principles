package com.anchtun.designpatterns.behavioral.command.client;

import com.anchtun.designpatterns.behavioral.command.AddMemberCommand;
import com.anchtun.designpatterns.behavioral.command.Command;
import com.anchtun.designpatterns.behavioral.command.invoker.MailTasksRunner;
import com.anchtun.designpatterns.behavioral.command.receiver.EWSService;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();

		Command c1 = new AddMemberCommand("a@a.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c1);

		Command c2 = new AddMemberCommand("b@b", "spam", service);
		MailTasksRunner.getInstance().addCommand(c2);

		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}

}