package com.anchtun.designpatterns.behavioral.visitor.element;

import java.util.Collection;

import com.anchtun.designpatterns.behavioral.visitor.visitor.Visitor;

public interface Employee {

	int getPerformanceRating();
	
	void setPerformanceRating(int rating);
	
	Collection<Employee> getDirectReports();

	int getEmployeeId();
	
	void accept(Visitor visitor);
}
