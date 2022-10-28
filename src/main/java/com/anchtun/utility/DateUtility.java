package com.anchtun.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtility {

	public static final String pattern_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd-HH:mm:ss";
	
	public static String getCurrentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern_YYYY_MM_DD_HH_MM_SS);
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
}
