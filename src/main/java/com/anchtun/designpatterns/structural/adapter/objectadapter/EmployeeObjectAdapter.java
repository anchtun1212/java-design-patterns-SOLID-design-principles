package com.anchtun.designpatterns.structural.adapter.objectadapter;

import com.anchtun.designpatterns.structural.adapter.model.Customer;
import com.anchtun.designpatterns.structural.adapter.model.Employee;

// An object adapter. Using composition to translate interface
public class EmployeeObjectAdapter implements Customer {

	private Employee adaptee;

	public EmployeeObjectAdapter(Employee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public String getName() {
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adaptee.getOfficeLocation();
	}

}