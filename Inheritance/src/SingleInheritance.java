
public class SingleInheritance /*extends java.lang.Object (this is inherited implicitly)*/ {
	
	void m1(){
		System.out.println("Inside m1");
	}

	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.m1();
		System.out.println(s.hashCode());
		System.out.println(s.getClass());
	}
}
