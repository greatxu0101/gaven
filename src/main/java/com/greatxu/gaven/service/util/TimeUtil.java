package com.greatxu.gaven.service.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	
	private static final SimpleDateFormat SDF_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat SDF_DATE = new SimpleDateFormat("yyyy-MM-dd");

	public static long getCurrentSimpleTimeLong() {
		return System.currentTimeMillis();
	}
	
	public static String getCurrentSimpleTimeString() {
		return String.valueOf(getCurrentSimpleTimeLong());
	}
	
	public static String getCurrentDateString() {
		return getStringTime(SDF_DATE);
	}
	
	public static String getCurrentTimeString() {
		return getStringTime(SDF_TIME);
	}
	
	private static String getStringTime(SimpleDateFormat sdf) {
		Date date = new Date();
		return sdf.format(date); 
	}
	
	public static void main(String[] args) {
		System.out.println(getCurrentTimeString());
	}
}
