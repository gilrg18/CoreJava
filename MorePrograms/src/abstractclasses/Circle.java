package abstractclasses;

public abstract class Circle {
	int r;
	
	Circle(int r){
		this.r=r;
	}
	
	public void area(){
		System.out.println("Area");
	}
	
	public abstract void perimeter();
}
