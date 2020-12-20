package java10features;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class VarDemo {
	//You can not use var in class level
	//var classLevel = 10;
	
	public static void main(String[] args) {
		//The java compiler will infer the variable type
		//var is not a keyword, you can use var as variable name (not recommended)
		var x = 10;
		var var = "abc";
		//Type mismatch error because x is inferred as integer
		//x = "a";
		
		//Using var for complex collections
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		//if you use var without specifying the <> type, it will become a generic type
		var map2 = new HashMap<String, List<String>>();
		
		//for(Map.Entry<String,List<String>> entry: map.entrySet()) {
		for(var entry: map.entrySet()) {
			var value = entry.getValue();
		}
		
		//VAR RESTRICTIONS
		//if you assign null, compiler wont know what type it is
		//var s = null;
		Consumer<Integer> lambdaExpression = (i)-> {
			//you can use var inside lambda expressions
			var z = 10;
			System.out.println(i);
		};
		//var doesnt know lambda expressions
		//var lambdaExpression = (i)-> {
		//	System.out.println(i);
		//};
		
		//if you use var without specifying the <> type, it will become a generic type
		var list = new ArrayList<>();
		list.add(123);
		list.add("xyz");
		
		
		/*
		 * We can assign any type of data to a variable that is already declared using var: FALSE
		 * 
		 * We can not assign null values to variables declared using var: TRUE
		 * 
		 * We can use var declarations inside a lambda expression: TRUE (YOU CANT ASSIGNT LAMBDA EXPRESSIONS TO VAR THOUGH)
		 * 
		 */
	}
}
