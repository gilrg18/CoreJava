import java.util.ArrayList;

public class WildcardParams {
	
	public static void main(String[] args) {
		WildcardParams wcp = new WildcardParams();
		//MyClass arraylist works because it extends thread
		//wcp.myMethod(new ArrayList<MyClass>());
		//wcp.myMethod(new ArrayList<Thread>());
		//WILDCARD AND SUPER
		wcp.myMethod(new ArrayList<A>());
	}
	//<?> is a wildcard
	//WILDCARD AND EXTENDS
	//public void myMethod(ArrayList<? extends Thread> l){
	public void myMethod(ArrayList<? super B> l){	
		l.add(null);
		
		//l.add(new A());
		//<?> only accepts null
		//The main advantage of super is, it allows us to add objects to the type that is
		//being passed in or to the parameter that is being passed in.
		l.add(new B());
		
				
	}
}
