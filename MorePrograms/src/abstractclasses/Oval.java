package abstractclasses;

public class Oval extends Circle{

	Oval(int r) {
		super(r);
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter");
	}

}
