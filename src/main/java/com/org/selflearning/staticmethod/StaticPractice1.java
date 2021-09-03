package com.org.selflearning.staticmethod;

public class StaticPractice1 {

	// final, static, public,private,,,,,
	
	final double pi = 3.14;
	public final String getPiValue() {
		return "3.14";
	}

	
	static String str1 = "ABC";
	String str2 = "PQR";

	
	public static String sendEmailToUser(String emailMsg, String receipentEmailId) {
		try {
		
			// mail logic.
			System.out.println("Sending email");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("From finally block.");
		}
		return "12";
	}
	
	static {
		System.out.println("From Static block.");
	}
	
	public static void main(String[] args) {
		System.out.println("From static main method");
//		StaticPractice1 ss = new StaticPractice1();
//		InnerClass ic = new InnerClass();
//		System.out.println(ic.getInnerMessage());
//		System.out.println("11==>"+ss.pi);
//		System.out.println("12==>"+ss.str2);
	}
	
	
	public static class InnerClass {
		String innerPi = "3.14";
		
		public String getInnerMessage() {
			return "From Inner class";
		}
		
	}
}
