package com.gil.java13and14;

public class RecordDemo {
	//for the employee class we had to make a lot of stuff (getters,setters,tostring,etc..)
	//Record avoids making all that

	public static void main(String[] args) {
		//USING CLASS
		Employee employee = new Employee();
		employee.setName("Gil");
		employee.setSal(4000);
		System.out.println(employee);
		
		//Using Record (No need to make class, getters, setters, tostring, etc)
		EmployeeRecord er = new EmployeeRecord("Gil", 4000);
		System.out.println(er);
		System.out.println(er.name());
		System.out.println(er.sal());
		
		EmployeeRecord er2 = new EmployeeRecord("Lala", 5000);
		System.out.println(er2);
		System.out.println(er2.name());
		System.out.println(er2.sal());
		
		EmployeeRecord er3 = new EmployeeRecord("Gil", 4000);
		System.out.println(er3.equals(er));
		System.out.println(er.name());
		System.out.println(er.sal());
		System.out.println(er.hashCode());
		System.out.println(er3.hashCode());
		
		er.myInstanceMethod();
		er.myMethod();
	}
}
