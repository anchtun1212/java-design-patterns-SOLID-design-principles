package com.anchtun.designpatterns.structural.proxy.dynamic.client;

import com.anchtun.designpatterns.structural.proxy.Image;
import com.anchtun.designpatterns.structural.proxy.dynamic.ImageFactory;

import javafx.geometry.Point2D;

public class Client {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("Profile.bmp");
		img.setLocation(new Point2D(-5, 0));
		System.out.println(img.getLocation());
		System.out.println("*****************************");
		img.render();
	}
}
