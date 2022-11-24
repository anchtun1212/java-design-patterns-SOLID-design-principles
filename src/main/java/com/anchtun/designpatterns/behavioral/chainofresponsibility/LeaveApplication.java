package com.anchtun.designpatterns.behavioral.chainofresponsibility;

import java.time.LocalDate;
import java.time.Period;

import com.anchtun.designpatterns.behavioral.chainofresponsibility.enums.Status;
import com.anchtun.designpatterns.behavioral.chainofresponsibility.enums.Type;

import lombok.Builder;
import lombok.Data;

// Represents a request in our chain of responsibility
@Data
@Builder
public class LeaveApplication {
	
	private Type type;
	private LocalDate from;
	private LocalDate to;
	private String processedBy;
	private Status status;
	
	public LeaveApplication(Type type, LocalDate from, LocalDate to, String processedBy, Status status) {
		this.type = type;
		this.from = from;
		this.to = to;
		this.status = Status.PENDING; 
	}
	
	public LeaveApplication(Type type, LocalDate from, LocalDate to) {
		this.type = type;
		this.from = from;
		this.to = to;
		this.status = Status.PENDING; 
	}
	
	public int getNoOfDays() {
		return Period.between(from, to).getDays();
	}
	

	public void approve(String approverName) {
		this.status = Status.APPROVED;
		this.processedBy = approverName;
	}

	public void reject(String approverName) {
		this.status = Status.REJECETD;
		this.processedBy = approverName;
	}
	
	@Override
	public String toString() {
		return type + " leave for " + getNoOfDays() + " day(s) " + status + " by " + processedBy;
	}
}