
public abstract class BMW {
	
	void commonFunc(){
		System.out.println("Inside "+this+" commonFunc method");
	}
	
	abstract void accelerate();
	
	abstract void brake();
	
	public static void main(String[] args) {
		
		System.out.println("Inside the main method");
	}
}
