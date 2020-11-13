package serialization;

import java.io.Serializable;

//Serialization In Action
public class Employee implements Serializable {
	int id;
	String name;
	double salary;
	// we dont want ssn to be serialized because it is sensitive information
	// so we use the keyword: transient
	transient int ssn;

	Employee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
}
