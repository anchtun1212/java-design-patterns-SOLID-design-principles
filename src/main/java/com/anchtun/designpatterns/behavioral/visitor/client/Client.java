package com.anchtun.designpatterns.behavioral.visitor.client;

import java.util.Date;
import java.util.Random;

import com.anchtun.designpatterns.behavioral.visitor.element.Employee;
import com.anchtun.designpatterns.behavioral.visitor.element.Manager;
import com.anchtun.designpatterns.behavioral.visitor.element.Programmer;
import com.anchtun.designpatterns.behavioral.visitor.element.ProjectLead;
import com.anchtun.designpatterns.behavioral.visitor.element.VicePresident;
import com.anchtun.designpatterns.behavioral.visitor.visitor.AppraisalVisitor;
import com.anchtun.designpatterns.behavioral.visitor.visitor.PrintVisitor;
import com.anchtun.designpatterns.behavioral.visitor.visitor.Visitor;

public class Client {

	public static void main(String[] args) {
		Employee emps = buildOrganization();
		Visitor visitor = new PrintVisitor();

		visitOrgStructure(emps, visitor);
		System.out.println("***************************************");
		// Perform a fake appraisal
		appraisal(emps, new Random(new Date().getTime()));

		AppraisalVisitor visitor2 = new AppraisalVisitor();
		// Carry out final appraisal where we consider team performance
		visitOrgStructure(emps, visitor2);

		// create new print visitor with final ratings taken from appraisal visitor
		visitor = new PrintVisitor(visitor2.getFinalRatings());
		visitOrgStructure(emps, visitor);

	}

	private static Employee buildOrganization() {

		Programmer p1 = new Programmer("Ali", "C++");
		Programmer p2 = new Programmer("Mohamed", "Java");

		Programmer p3 = new Programmer("Salah", "C#");
		Programmer p4 = new Programmer("Ahmad", "C++");

		ProjectLead pl1 = new ProjectLead("Hassan", p1, p2);
		ProjectLead pl2 = new ProjectLead("Boubaker", p3, p4);

		Manager m1 = new Manager("Ibrahim", pl1);
		Manager m2 = new Manager("Ayoub", pl2);

		VicePresident vp = new VicePresident("Youssef", m1, m2);

		return vp;
	}

	private static void visitOrgStructure(Employee emp, Visitor visitor) {
		emp.accept(visitor);
		emp.getDirectReports().forEach(e -> visitOrgStructure(e, visitor));
	}

	// This method assigns some random values to performance rating field of
	// employees
	private static void appraisal(Employee emp, Random random) {
		int rating = random.nextInt(6);
		emp.setPerformanceRating(rating < 1 ? 1 : rating);
		emp.getDirectReports().forEach(r -> appraisal(r, random));
	}
}