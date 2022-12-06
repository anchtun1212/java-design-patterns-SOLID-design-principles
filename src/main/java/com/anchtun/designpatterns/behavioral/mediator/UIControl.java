package com.anchtun.designpatterns.behavioral.mediator;

// Abstract colleague
public interface UIControl {

	void controlChanged(UIControl control);

	String getControlValue();

	String getControlName();
}