
public class AnyRunnableTest {
	public static void main(String[] args) {
		//This works because the thread class implements the runnable interface
		//this wont work because Thread doesnt implement comparable interface
		//AnyRunnable<Thread> t = new AnyRunnable<>();
		AnyRunnable<MyClass> m = new AnyRunnable<>();
		//Doesnt work because String does not use runnable interface
		//AnyRunnable<String> s = new AnyRunnable<>();
	}
}
