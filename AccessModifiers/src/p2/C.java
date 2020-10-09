package p2;
import p1.A;
public class C extends A {
	public static void main(String[] args) {
		A aObject = new A();
		System.out.println(aObject.d);
		//TO ACCESS PROTECTED FIELDS YOU HAVE TO CREATE INSTANCE OF CHILD OBJECT
		C cObject = new C();
		System.out.println(cObject.c);
		System.out.println(cObject.d);
	}
}
