package com.anchtun.designpatterns.behavioral.command;

import com.anchtun.designpatterns.behavioral.command.receiver.EWSService;

import lombok.AllArgsConstructor;

// A Concrete implementation of Command.
@AllArgsConstructor
public class RemoveMemberCommand implements Command {

	private String emailAddress;
	private String listName;
	private EWSService receiver;

	@Override
	public void execute() {
		receiver.removeMember(emailAddress, listName);
	}

}