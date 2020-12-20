package com.gil.java9.trywithresources;
//try with resources
public class MyWorker implements AutoCloseable{

	MyWorker(){
		System.out.println("Creating a resource...");
	}
	
	public void doSomething() {
		System.out.println("Doin something..");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing the resource...");
	}

}
