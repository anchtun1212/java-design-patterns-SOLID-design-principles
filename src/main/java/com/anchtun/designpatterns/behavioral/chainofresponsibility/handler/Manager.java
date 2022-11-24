package com.anchtun.designpatterns.behavioral.chainofresponsibility.handler;

import com.anchtun.designpatterns.behavioral.chainofresponsibility.LeaveApplication;

// A concrete handler
public class Manager extends Employee {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
		case SICK:
			application.approve(getApproverRole());
			return true;
		case PTO:
			if (application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		default:
			break;
		}
		return false;
	}
}