import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws ParseException {
		//M/dd/yyyy
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		//String to Date
		//this might be coming from a db or something..
		String dateAsString = "10-12-2020";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date date1 = sdf1.parse(dateAsString);
		System.out.println(date1);
		
		//Including Time
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		String date2 = sdf2.format(new Date());
		System.out.println(date2);
	}
}
	
