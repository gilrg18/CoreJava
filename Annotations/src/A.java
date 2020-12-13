//USING @Deprecated
//@Deprecated
public class A {
	//ctrl + click into deprecated to open deprecated class
	@Deprecated
	int id;
	//Now only the method is deprecated
	@Deprecated
	public void myMethod() {
		System.out.println("myMethod");
	}
	public void myMethod2() {
		System.out.println("myMethod2");
	}
	
}
