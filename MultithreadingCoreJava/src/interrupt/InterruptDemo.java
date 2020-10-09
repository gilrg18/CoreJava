package interrupt;

public class InterruptDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		//we can only interrupt a thread that is in sleep mode
		t.interrupt();
		System.out.println("End of the main method");
	}
}
