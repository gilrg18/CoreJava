package com.gil.java13and14;

public record EmployeeRecord(String name, int sal) {
	//more about record
	
	static int id;
	
	public static void myMethod() {
		System.out.println(id);
	}
	
	public void myInstanceMethod() {
		System.out.println(this.name());
		System.out.println(this.sal());
	}
/*	public EmployeeRecord() {
		this.name = "";
		this.sal = 0;
	}No idea why it doesnt work*/
	
}
