package anonymousinner;

public class AnonymousRunnable {

	public static void main(String[] args) {
		// Anonymous inner class for Runnable Interface
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous Runnable Implementation");
			}
		});
		
		t.start();// if you dont call start method the run method will never be called by the jvm
		
	}

}
