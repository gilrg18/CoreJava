package moreinheritanceconcepts;

public class Child extends Parent {
	
	int c,d;
	
	Child(int a, int b, int c, int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	
	void displayDetails(){
		System.out.println("Parents a "+super.a);
		System.out.println("Parents b "+super.b);
		System.out.println("Child c "+ this.c);
		System.out.println("Child d "+ this.d);
	}
	
	@Override
	void f1(){
		//super keyword allows us to access parents methods inside 
		//childs methods even though we override those methods
		super.f1();
		System.out.println(this);
		System.out.println("Inside Childs f1");
	}
}
