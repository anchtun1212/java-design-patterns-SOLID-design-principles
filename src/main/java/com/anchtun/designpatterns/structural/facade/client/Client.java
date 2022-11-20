package com.anchtun.designpatterns.structural.facade.client;

import com.anchtun.designpatterns.structural.facade.Order;
import com.anchtun.designpatterns.structural.facade.email.EmailFacade;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("125", 99.99);
		EmailFacade facade = new EmailFacade();

		boolean result = facade.sendOrderEmail(order);

		System.out.println("Order Email " + (result ? "sent!" : "NOT sent..."));

	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}

}
