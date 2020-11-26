package comparator;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer arg0, StringBuffer arg1) {
		String s1 = arg0.toString();
		String s2 = arg1.toString();
		//We make them strings because string already have the compareTo method implemented
		return s1.compareTo(s2);
	}

}
