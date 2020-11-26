package sortingobjects;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {


	@Override
	//THIS WILL SORT THEM BASED ON THEIR NAMES
	public int compare(Employee o1, Employee o2) {
		String name1 = o1.name;
		String name2 = o2.name;
		
		return name1.compareTo(name2);
	
	}

}
