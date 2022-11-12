package com.anchtun.designpatterns.creational.objectpool.client;

import com.anchtun.designpatterns.creational.objectpool.Bitmap;
import com.anchtun.designpatterns.creational.objectpool.ObjectPool;

import javafx.geometry.Point2D;

public class Client {

	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Mohamed-profile.bmp"), 5);

	public static void main(String[] args) {
		Bitmap b1 = bitmapPool.get();
		b1.setLocation(new Point2D(12, 12));
		Bitmap b2 = bitmapPool.get();
		b2.setLocation(new Point2D(-12, 0));

		b1.draw();
		b2.draw();

		bitmapPool.release(b1);
		bitmapPool.release(b2);
	}
}