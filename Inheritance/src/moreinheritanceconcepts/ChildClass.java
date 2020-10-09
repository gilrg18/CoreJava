package moreinheritanceconcepts;

public class ChildClass extends SuperClass {
	
	ChildClass(){
		this(10);//childclass(int x) this will invoke constructor  with arguments
		System.out.println("No Arg ChildClass Constructor");
	}
	
	ChildClass(int x){
		super(x); //superclass(int x) superclass constructor will be invoked
		System.out.println("One Arg ChildClass Constructor");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}
}
