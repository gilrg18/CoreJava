//USING @Deprecated
//@Deprecated
public class A {
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