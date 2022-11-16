package com.anchtun.designpatterns.structural.adapter.client;

import com.anchtun.designpatterns.structural.adapter.classadapter.EmployeeClassAdapter;
import com.anchtun.designpatterns.structural.adapter.model.BusinessCardDesigner;
import com.anchtun.designpatterns.structural.adapter.model.Employee;
import com.anchtun.designpatterns.structural.adapter.objectadapter.EmployeeObjectAdapter;

// Avoid class adapter, it's mentioned here only for sake of completeness, use instead object adapter
public class Client {

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Mohamed Aymen Charrada");
		employee.setJobTitle("Software Engineer");
		employee.setOfficeLocation("Al Riyadh, KSA");
	}

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer1 = new BusinessCardDesigner();
		String card1 = designer1.designCard(adapter);
		System.out.println(card1);
		System.out.println("************************************************************");
		/** Using Object Adapter **/
		Employee adaptee = new Employee("Ali Ben Mohamed", "Security Engineer", "Monastir, Tunisia");
		EmployeeObjectAdapter adapter2 = new EmployeeObjectAdapter(adaptee);
		BusinessCardDesigner designer2 = new BusinessCardDesigner();
		String card2 = designer2.designCard(adapter2);
		System.out.println(card2);
	}
}
