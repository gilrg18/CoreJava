package thread.creation.example;
//FIRST WAY TO RUN CODE ON A NEW THREAD
//IMPLEMENT RUNNABLE INTERFACE, AND PASS TO A NEW THREAD OBJECT
public class Main {
	public static void main(String[] args) throws InterruptedException{
		//object of a class that implements the runnable interface into Thread's constructor
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run(){
				//Code that will run a new thread
				throw new RuntimeException("Intentional Exception");
				//System.out.println("We are now in thread: "+ Thread.currentThread().getName());
				//System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
			}
		});
		
		thread.setName("Misbehaving thread");
		
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			@Override
			public void uncaughtException(Thread t, Throwable e){
				System.out.println("A critical error happened in thread "+ t.getName()+ " the error is "+ e.getMessage());
			}
		});
		
		thread.start();
		
		/*thread.setName("New Name");
		
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("We are in thread: "+ Thread.currentThread().getName()+ " before starting a new thread");
		thread.start();
		System.out.println("We are in thread: "+ Thread.currentThread().getName()+ " after starting a new thread");
		*/
		//Thread.sleep(10000);
	}
}
