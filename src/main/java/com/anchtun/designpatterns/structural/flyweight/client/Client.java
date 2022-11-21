package com.anchtun.designpatterns.structural.flyweight.client;

import com.anchtun.designpatterns.structural.flyweight.SystemErrorMessage;
import com.anchtun.designpatterns.structural.flyweight.UserBannedErrorMessage;
import com.anchtun.designpatterns.structural.flyweight.factory.ErrorMessageFactory;
import com.anchtun.designpatterns.structural.flyweight.factory.ErrorMessageFactory.ErrorType;

public class Client {
	
	public static void main(String[] args) {
		
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GENERIC_SYSTEM_ERROR);
		System.out.println(msg1.getText("4056"));
		
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));
	}

}
