//it is prefered to implement Runnable interface.. this way u will be able to extend other classes...
//you cant have multiple inheritance thats why runnable interface better than thread class
public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed the checks");
	}

	public static void main(String[] args) {
		CheckProcessor cp = new CheckProcessor();
		//.start() not available in runnable interface
		//so u have to create instance of the thread
		//The thread constructor receives an object of type runnable
		Thread t = new Thread(cp);
		t.start();
	}

}
