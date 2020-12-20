package com.gil.java9.trywithresources;

public class TestClass {
	public static void main(String[] args) {
		MyWorker worker = new MyWorker();
		//before java 9
		//try(MyWorker worker = new MyWorker){}
		//after java 9:
		try(worker){
			worker.doSomething();
		}catch(Exception e) {
			
		}
	}
}
