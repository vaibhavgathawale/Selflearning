package com.org.selflearning.exceptions;

public class ExceptionTypes {

	public static String testArithmatic() throws ArithmeticException, NumberFormatException {
		try {
			int a = 10/0;
		} catch (Exception e) {
			throw new ArithmeticException();
		}
		
		try {
			int b = Integer.parseInt("abc");
		} catch (Exception e) {
			throw new NumberFormatException();
		}
		return "";
	}
	
	public static String testNumFormat() {
		
		int b = Integer.parseInt("abc");
		
		return "";
	}
	
	public static void testMyCustomException() throws MyCustomException {		
//		try {
			int b = 12;
			throw new MyCustomException("Exception occurred of type Custom....");
//		} catch(Exception e) {
//			
//		}
	}
	
}
