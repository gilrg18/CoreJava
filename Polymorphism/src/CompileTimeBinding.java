
public class CompileTimeBinding {
	
	void add(int a, int b){
		System.out.println("Result: "+(a+b));
	}
	
	void add(float a, float b){
		float result = a+b;
		System.out.println(result);
	}
	
	void add(int a, int b, int c){
		int result = a+b+c;
		System.out.println(result);
	}
	
	public static void main(String[] args){
		CompileTimeBinding c = new CompileTimeBinding();
		c.add(10, 20);
		c.add(1f, 2f);
		c.add(1, 2, 3);
	}
}
