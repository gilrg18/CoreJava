package threadcommunication;

public class MyThread extends Thread{
	int total;
	public void run(){
		System.out.println("Child Thread is calculating the sum: ");
		synchronized(this){
			for(int i=1; i<=100; i++){
				total += i;
			}
			this.notify();//the lock will be released on this object and the execution will go back to main thread
		}
		
	}
}
