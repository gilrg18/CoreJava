//Using @Override
public class MyChild extends MyParent {
	//To ensure we are really overriding the parent method 
	@Override
	public String greet(String name){
		return "Hi "+name;
	}
}
