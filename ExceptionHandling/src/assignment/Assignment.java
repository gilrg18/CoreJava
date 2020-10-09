package assignment;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			throw new MyThreadException("Interrupted exception");
		}
	}
}
