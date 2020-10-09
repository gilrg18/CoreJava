package synchronization.classlock;

public class SynchroDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("Gil");
		MyThread t2 = new MyThread("Lala");
		
		//Once t1 GIL enters the synchronized method the method will be LOCKED, meaning t2 LALA has to wait until t1 finishes using it 
		t1.start();
		t2.start();
	}

}
