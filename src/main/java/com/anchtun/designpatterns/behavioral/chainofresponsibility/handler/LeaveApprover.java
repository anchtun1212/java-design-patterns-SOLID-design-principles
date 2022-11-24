package com.anchtun.designpatterns.behavioral.chainofresponsibility.handler;

import com.anchtun.designpatterns.behavioral.chainofresponsibility.LeaveApplication;

// This represents a handler in chain of responsibility
public interface LeaveApprover {
	
	void processLeaveApplication(LeaveApplication application);
	
	String getApproverRole();
}