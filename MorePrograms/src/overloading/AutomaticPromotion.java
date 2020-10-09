package overloading;

public class AutomaticPromotion {
	public void print(int i) {
		System.out.println("Integer Version: " + i);
	}

	public void print(float f) {
		System.out.println("Float Version: " + f);
	}
	
	public void print(String s){
		System.out.println("String Version: " +s);
	}
	
	public void print(Object o){
		System.out.println("Object Version: " +o);
	}

	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(123);
		ap.print(456f);
		ap.print("Hi");
	}
}
