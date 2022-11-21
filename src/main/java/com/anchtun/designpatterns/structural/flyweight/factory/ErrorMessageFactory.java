package com.anchtun.designpatterns.structural.flyweight.factory;

import java.util.HashMap;
import java.util.Map;

import com.anchtun.constant.Constants;
import com.anchtun.designpatterns.structural.flyweight.SystemErrorMessage;
import com.anchtun.designpatterns.structural.flyweight.UserBannedErrorMessage;

// Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {

	// This serves as key for getting flyweight instance
	public enum ErrorType {
		GENERIC_SYSTEM_ERROR, PAGE_NOT_FOUND_ERROR, SERVER_ERROR
	}

	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}

	private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

	private ErrorMessageFactory() {
		errorMessages.put(ErrorType.GENERIC_SYSTEM_ERROR,
				new SystemErrorMessage(Constants.GENERIC_SYSTEM_ERROR, Constants.GOOGLE_WRONG_URL));
		errorMessages.put(ErrorType.PAGE_NOT_FOUND_ERROR,
				new SystemErrorMessage(Constants.PAGE_NOT_FOUND_ERROR, Constants.GOOGLE_WRONG_URL));
	}

	public SystemErrorMessage getError(ErrorType type) {
		return errorMessages.get(type);
	}

	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}