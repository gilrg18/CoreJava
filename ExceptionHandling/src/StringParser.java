
public class StringParser {

	public static void main(String[] args) {
		String s = "asd";
		try	{
			int i = Integer.parseInt(s);
		}catch(NumberFormatException e){
			System.out.println("Cant convert that string to int");
		}
	}

}
