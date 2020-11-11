package stringbuffer;
//String Buffer and StringBuilder
public class SBDemo {
 public static void main(String[] args){
	 StringBuffer sb = new StringBuffer();
	 System.out.println("Initial Capacity "+ sb.capacity());
	 
	 sb.append("All the power is within you.");
	 sb.append(" You can do anything and everything");
	 System.out.println(sb);
	 //Capacity accomodates to whatever data we add
	 System.out.println("Current Capacity "+ sb.capacity());
	 System.out.println(sb.charAt(10));
	 
	 StringBuilder a = new StringBuilder();
	 a.append("lolwat");
	 System.out.println(a);
	 
	 StringBuffer sb1 = new StringBuffer("abcde");
	 System.out.println(sb1.reverse());
	 //ads xyz
	 System.out.println(sb1.insert(3, "xyz"));
	 //deletes xyz
	 System.out.println(sb1.delete(3, 6));
	 
	 //STRING BUFFER IS NOT IMMUTABLE
 }
}
