package com.org.selflearning.staticmethod;

public class Student {
	int rollno;// instance variable
	String name;
	String college;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	// static variable
	// constructor

	Student(int r, String n) {
		rollno = r;
		name = n;
	}
	
//	Student(int r, String n, String clg) {
//		rollno = r;
//		name = n;
//		college = clg;
//	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
