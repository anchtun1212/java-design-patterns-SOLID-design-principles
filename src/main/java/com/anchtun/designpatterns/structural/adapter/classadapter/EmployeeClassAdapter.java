package com.anchtun.designpatterns.structural.adapter.classadapter;

import com.anchtun.designpatterns.structural.adapter.model.Customer;
import com.anchtun.designpatterns.structural.adapter.model.Employee;

// Avoid class adapter, it's mentioned here only for sake of completeness, use instead object adapter
// A class adapter, works as Two-way adapter
public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}

}