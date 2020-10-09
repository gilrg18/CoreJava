
public class Test {
	static ArrayIndexOOBDemo a;
	public static void main(String[] args) {
		//Null pointer exception because you never
		//initialized a as a new object
		try{
			Test.a.method1();
		}catch(NullPointerException e){
			System.out.println("Object not initialized");
		}
	}
}
