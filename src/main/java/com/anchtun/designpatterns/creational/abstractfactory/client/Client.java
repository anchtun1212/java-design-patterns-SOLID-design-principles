package com.anchtun.designpatterns.creational.abstractfactory.client;

import com.anchtun.designpatterns.creational.abstractfactory.aws.AwsResourceFactory;
import com.anchtun.designpatterns.creational.abstractfactory.factory.ResourceFactory;
import com.anchtun.designpatterns.creational.abstractfactory.gcp.GoogleResourceFactory;
import com.anchtun.designpatterns.creational.abstractfactory.product.Instance;
import com.anchtun.designpatterns.creational.abstractfactory.product.Instance.Capacity;
import com.anchtun.designpatterns.creational.abstractfactory.product.Storage;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Client {

	private ResourceFactory factory;

	public Instance createServer(Instance.Capacity cap, int storageMB) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMB);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) {
		log.info("****************AWS***********************");
		Client aws = new Client(new AwsResourceFactory());
		Instance i1 = aws.createServer(Capacity.MICRO, 20000);
		i1.start();
		i1.stop();

		log.info("****************GoogleCloudPlatform***********************");
		Client gcp = new Client(new GoogleResourceFactory());
		i1 = gcp.createServer(Capacity.MICRO, 20000);
		i1.start();
		i1.stop();

	}

}