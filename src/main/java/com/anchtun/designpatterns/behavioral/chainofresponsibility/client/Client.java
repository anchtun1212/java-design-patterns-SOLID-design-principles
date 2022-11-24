package com.anchtun.designpatterns.behavioral.chainofresponsibility.client;

import java.time.LocalDate;

import com.anchtun.designpatterns.behavioral.chainofresponsibility.LeaveApplication;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.enums.Type;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.handler.Director;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.handler.LeaveApprover;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.handler.Manager;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.handler.ProjectLead;

public class Client {

	public static void main(String[] args) {
		LeaveApplication application = LeaveApplication.builder()
				.type(Type.SICK)
				.from(LocalDate.now())
				// leave will be 4 days, so lead can't approve, so the manager should approve this request
				.to(LocalDate.now().plusDays(4))
				.build();
		System.out.println(application);
		System.out.println("**************************************************");
		LeaveApprover approver = createChain();
		approver.processLeaveApplication(application);
		System.out.println(application);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
}
