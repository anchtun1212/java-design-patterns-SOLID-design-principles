package com.anchtun.designpatterns.behavioral.chainofresponsibility.handler;

import com.anchtun.designpatterns.behavioral.chainofresponsibility.LeaveApplication;

import lombok.AllArgsConstructor;

// Abstract handler
@AllArgsConstructor
public abstract class Employee implements LeaveApprover {

	private String role;
	private LeaveApprover successor;

	@Override
	public void processLeaveApplication(LeaveApplication application) {
		if (!processRequest(application) && successor != null) {
			successor.processLeaveApplication(application);
		}
	}

	protected abstract boolean processRequest(LeaveApplication application);

	@Override
	public String getApproverRole() {
		return role;
	}

}