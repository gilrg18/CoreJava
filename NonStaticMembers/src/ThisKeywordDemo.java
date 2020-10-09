
public class ThisKeywordDemo {
	int x;
	
	ThisKeywordDemo(){
		//THIS KEYWORD CAN ONLY BE USED IN A NONSTATIC CONTEXT
		System.out.println(this);
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}
}
