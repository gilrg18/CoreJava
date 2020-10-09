package interfaces;

public class MyCircle implements Circle, CircleTwo{

	@Override
	public void calculateArea() {
		System.out.println(Circle.pi);
	}

	@Override
	public int calculateArea(float radius) {
		return (int) radius;
	}
	
	public static void main(String[] args) {
		MyCircle c = new MyCircle();
		System.out.println(c.calculateArea(3));
	}
	
}
