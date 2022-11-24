package com.anchtun.designpatterns.behavioral.chainofresponsibility.handler;

import com.anchtun.designpatterns.behavioral.chainofresponsibility.LeaveApplication;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.enums.Type;

// A concrete handler
public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if (application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}

}
