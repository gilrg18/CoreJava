
public class NonStaticMembersDemo {
	int num;
	//IF THE COMPILER DOESNT FIND A DEFAULT CONSTRUCTOR IT WILL CREATE ONE
	//IN OTHER WORDS, YOU CAN DELETE THIS DEFAULT CONSTRUCTOR AND STILL CREATE OBJECTS
	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}
	
	{
		System.out.println("Inside the non static block");
	}
	
	static{
		System.out.println("Inside the static block");
	}

	//NON STATIC BLOCKS GET EXECUTED EVERY TIME WE CREATE AN OBJECT
	//STATIC BLOCK GETS EXECUTED ONLY ONCE, WHEN THE CLASS IS LOADED
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		obj.doSomething();
		
	}
	
	void doSomething(){
		System.out.println("Inside doSomething");
	}
	
}
