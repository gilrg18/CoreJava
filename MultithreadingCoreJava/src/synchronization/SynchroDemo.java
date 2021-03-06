package synchronization;

public class SynchroDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		
		MyThread t1 = new MyThread(dm, "Gil");
		MyThread t2 = new MyThread(dm, "Lala");
		
		//Once t1 GIL enters the synchronized method the method will be LOCKED, meaning t2 LALA has to wait until t1 finishes using it 
		t1.start();
		t2.start();
	}

}
