import java.util.ArrayList;
import java.util.List;

public class B {
	//Using @SuppressWarnings (removes deprecated methods warnings
	//@SuppressWarnings(value = { "deprecation" })
	//Another way to do it
	@SuppressWarnings({ "deprecation", "unused", "rawtypes" })
	public static void main(String[] args){
		//Using @Deprecated
		//now A shows a warning because of @Deprecated
		A a = new A();
		a.myMethod();
		a.myMethod2();
		System.out.println(a.id);
		//click lightbulb to suppress warnings
		List list = new ArrayList();
	}
}
