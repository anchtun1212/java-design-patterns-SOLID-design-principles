package com.anchtun.designpatterns.behavioral.chainofresponsibility.handler;

import com.anchtun.designpatterns.behavioral.chainofresponsibility.LeaveApplication;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.enums.Type;

// A concrete handler
public class ProjectLead extends Employee {

	public ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		// type is sick leave & duration is less than or equal to 2 days
		if (application.getType() == Type.SICK && application.getNoOfDays() <= 2) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}

}