package threadcommunication;
/*
 * LIMITATIONS of thread and runnable:
 * Time consuming:  everytime a check comes in from any of the sources (online banking, bank teller, atm, mobile) we
 * have to create a thread from scratch (A check processor which has online banking, bank teller, ATM, Mobile) thread creation is a resource consumption and time consuming process
 * 
 * Poor resource management: lets say our app creates a thousand threads and when  the checks come in they are ready to process but only 500 come in, that means other 500 
 * will be there without doing any work so it would be poor resource management
 * 
 * Not Robust: if a million checks/threads come at some point our application will run out of memory and die
 * 
 * To avoid all of these we use the Executor Framework
 */
public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		synchronized(t){
			System.out.println("Main thread is going to wait");
			//wait and notify must be in synchronized context (block, method, etc)
			t.wait();// t is going to wait untill the child thread finishes
			System.out.println("Main thread notified");
			System.out.println(t.total); //test
		}
	}
}
