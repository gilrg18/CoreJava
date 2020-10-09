package threadassignment;

public class MainThread {
	public static void main(String[] args) {
		EvenNumbersThread e = new EvenNumbersThread();
		Thread t = new Thread(e);
		t.start();
		OddNumbersThread o = new OddNumbersThread();
		o.start();
		for(int i = 0; i<=10; i++){		
				System.out.println("Main Thread: "+ i);		
		}
	}
}
