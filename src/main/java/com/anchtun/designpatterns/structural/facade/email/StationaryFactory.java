package com.anchtun.designpatterns.structural.facade.email;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new AidStationary();
	}
}
