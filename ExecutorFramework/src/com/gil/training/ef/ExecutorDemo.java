package com.gil.training.ef;
import java.util.concurrent.*;
//HOW TO create a thread pool and execute multiple checkprocessortaks
public class ExecutorDemo {
	public static void main(String[] args) {
		CheckProcessorTask[] cps = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };
		//THREADS DONT DIE WHEN THEY FINISH A TASK, THEY CAN BE REUSED
		//A FIXED NUMBER OF THREADS IS BETTER BECAUSE IF YOU RECEIVE A THOUSAND CHECKS AND ONLY HAVE
		//5 THREADS, THOSE 5 THREADS WILL TAKE CARE OF THE CHECKS SO YOU DONT HAVE TO CREATE A THREAD
		// FOR EVERY SINGLE CHECK.
		ExecutorService service = Executors.newFixedThreadPool(2);
		/*
		 * we are giving the ExecutorService one task at

			a time. And we are asking it to create only two threads and manage all these four tasks using those

			two threads.
		 */
		for(CheckProcessorTask checkProcessorTask : cps){
			service.submit(checkProcessorTask);
		}
		//Once we are done with all the work we need to shutdown the executor service
		service.shutdown();
	}
}
