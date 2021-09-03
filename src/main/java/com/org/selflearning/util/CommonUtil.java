package com.org.selflearning.util;

public class CommonUtil {
	
	public static void logErrorMessageInfile(Exception e) {
		// Save error message in file.
		System.out.println("Exception occurred at server. Exception message is "+e.getMessage());
		// Save entry in db for this operation failure. OR
		// Return Json object.
//		
//		String str = "manoj";
//		String loc = "Pune";
//		
//		
//		Employee emp = new Employee();
//		emp.setEName(str);
//		emp.setELocation(loc);
	}
}
