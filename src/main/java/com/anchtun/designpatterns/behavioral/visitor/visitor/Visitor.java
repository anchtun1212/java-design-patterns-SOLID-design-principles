package com.anchtun.designpatterns.behavioral.visitor.visitor;

import com.anchtun.designpatterns.behavioral.visitor.element.Manager;
import com.anchtun.designpatterns.behavioral.visitor.element.Programmer;
import com.anchtun.designpatterns.behavioral.visitor.element.ProjectLead;
import com.anchtun.designpatterns.behavioral.visitor.element.VicePresident;

public interface Visitor {

	void visit(Programmer programmer);

	void visit(ProjectLead lead);

	void visit(Manager manager);

	void visit(VicePresident vp);
}