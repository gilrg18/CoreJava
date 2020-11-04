package com.gil.training.ef;
//Here we define the checkProcessorTask 
public class CheckProcessorTask implements Runnable{
	
	String name;
	
	public CheckProcessorTask(String name){
		this.name = name;
	}
	
	@Override
	public void run(){
		System.out.println(name+ " Check Processor has began processing the check " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+ " Check Processor has completed processing the check" + Thread.currentThread().getName());
	}

}
