package thread.creation.example;
//SECOND WAY TO RUN CODE ON A NEW THREAD
//CREATE A CLASS THAT DIRECTLY EXTEND THREAD CLASS, AND CREATE AND OBJECT OF THAT CLASS
public class Main2 {
	public static void main(String[] args){
		Thread thread = new NewThread();
		
		thread.setName("Gil");
		thread.start();
		
	}

	private static class NewThread extends Thread{
		@Override
		public void run(){						// Thread.currentThread().getName()
			System.out.println("Hello from "+ this.getName());
		}
	}
	
}
