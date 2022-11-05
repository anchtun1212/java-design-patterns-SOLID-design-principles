package com.anchtun.designpatterns.creational.prototype.client;

import com.anchtun.designpatterns.creational.prototype.model.Swordsman;

import javafx.geometry.Point3D;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Swordsman swordsman1 = new Swordsman();
		swordsman1.move(new Point3D(-5, 0, 0), 15);
		swordsman1.attack();
		log.info("\n" + swordsman1);

		Swordsman swordsman2 = (Swordsman) swordsman1.clone();
		log.info("\n" + "Cloned swordsman\n" + swordsman2);
	}
}