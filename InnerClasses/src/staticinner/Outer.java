package staticinner;

public class Outer {

	static void f1() {
		System.out.println("Outers static method");
	}
	//STATIC INNER CLASS
	static class Inner {
		static void f2() {
			System.out.println("Inners Static method");
		}

		void f3() {
			System.out.println("Non static method Inside the Inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.f1();
		Outer.Inner.f2();
		
		Outer.Inner inner = new Outer.Inner();
		inner.f3();
	}
	/*
	 * To access the non static members of a static inner class we need to create an instance of it
	 * 
	 * 
	 */
}
