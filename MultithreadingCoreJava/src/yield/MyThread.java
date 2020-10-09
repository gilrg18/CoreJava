package yield;

public class MyThread extends Thread{
	public void run(){
		for(int i = 1; i<=10; i++){
			System.out.println("Child Thread");
			//yield se traduce como rendimiento, produccion, cosecha
			/*
			 * yield() basically means that the thread is not doing anything particularly important 
			 * and if any other threads or processes need to be run, they should run. 
			 * Otherwise, the current thread will continue to run.
			 */
			Thread.yield();
		}
	}
}
