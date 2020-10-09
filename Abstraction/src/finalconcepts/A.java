package finalconcepts;

public class A {
	final static float pi = 3.14f;
	
	public final void displayValue(){
		System.out.println(A.pi);
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(A.pi);
		//a1.pi = 3.25f;
	}
}
