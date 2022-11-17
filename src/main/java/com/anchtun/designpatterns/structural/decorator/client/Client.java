package com.anchtun.designpatterns.structural.decorator.client;

import com.anchtun.designpatterns.structural.decorator.Base64EncodedMessage;
import com.anchtun.designpatterns.structural.decorator.HtmlEncodedMessage;
import com.anchtun.designpatterns.structural.decorator.Message;
import com.anchtun.designpatterns.structural.decorator.TextMessage;

public class Client {
	
	public static void main(String[] args) {
		Message msg = new TextMessage("Al Sallam Alaykom wa ra7mat Allah wa barakatuhu <br/> I hope you are fine");
		System.out.println(msg.getContent());

		Message decorator = new HtmlEncodedMessage(msg);
		System.out.println(decorator.getContent());
		
		decorator = new Base64EncodedMessage(decorator);
		System.out.println(decorator.getContent());
	}
}
