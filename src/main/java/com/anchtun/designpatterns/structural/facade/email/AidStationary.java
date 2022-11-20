package com.anchtun.designpatterns.structural.facade.email;

public class AidStationary implements Stationary {

	@Override
	public String getHeader() {
		return "It's Aid!!";
	}

	@Override
	public String getFooter() {
		return "BUY MORE STUFF! It's Aid!!";
	}

}
