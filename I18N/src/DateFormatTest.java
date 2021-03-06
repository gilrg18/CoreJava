import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
	public static void main(String[] args) {
		Date d = new Date();
		DateFormat usDF = DateFormat.getDateInstance(0,Locale.US);
		DateFormat ukDF = DateFormat.getDateInstance(0,Locale.UK);
		
		System.out.println("Date in US Format: "+usDF.format(d));
		System.out.println("Date in UK Format: "+ukDF.format(d));
		
		//Representing the Time
		//DateFormat.getTimeInstance(); default format is 2, but you can overload that method with 0 for full
		DateFormat timeInstance = DateFormat.getTimeInstance(0);
		System.out.println(timeInstance.format(d));
		//0,0 full time and date
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0,0);
		System.out.println(dateTimeInstance.format(d));
	}
}
