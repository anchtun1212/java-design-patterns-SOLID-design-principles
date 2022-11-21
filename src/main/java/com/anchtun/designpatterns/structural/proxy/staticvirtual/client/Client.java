package com.anchtun.designpatterns.structural.proxy.staticvirtual.client;

import com.anchtun.designpatterns.structural.proxy.staticvirtual.Image;
import com.anchtun.designpatterns.structural.proxy.staticvirtual.ImageFactory;

import javafx.geometry.Point2D;

public class Client {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("profile.bmp");

		img.setLocation(new Point2D(15, 15));
		System.out.println("Image location :" + img.getLocation());
		System.out.println("rendering image now.....");
		img.render();
	}
}
