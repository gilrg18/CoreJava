package p1;

public class B {

	public static void main(String[] args) {
		A aObject = new A();
		//aObject.a; Doesnt work cause its private
		System.out.println(aObject.b);
		System.out.println(aObject.c);
		System.out.println(aObject.d);
	}

}
