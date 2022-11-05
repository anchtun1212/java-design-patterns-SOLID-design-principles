package com.anchtun.designpatterns.creational.prototype.model;

public class Swordsman extends GameUnit {

	private String state = "idle";

	public void attack() {
		this.state = "attacking";
	}

	@Override
	public String toString() {
		return "Swordsman " + state + " At " + getPosition();
	}

	@Override
	protected void reset() {
		state = "idle";
	}
}