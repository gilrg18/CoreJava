package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Deserialization In Action
public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("/C:/Users/gilbe/Desktop/FolderOfFolders/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		//typecasting
		Employee emp = (Employee) obj;
		System.out.println("Employee Id: "+ emp.id);
		System.out.println("Employee Name: "+ emp.name);
		System.out.println("Employee Salary: "+ emp.salary);
		//SSN prints 0 because it is transient.. meaning it wasnt serialized/added to the file
		//the default value for an integer is 0, thats why it is 0;
		System.out.println("Employee SSN: "+ emp.ssn);
	}
/*
 * java.io contains all the input/output interfaces and classes
 * The process of writing an object to a stream is called Serialization
 * Reader and Writer should be used while working with text data
 * hasMoreTokens() should be used in StringTokenizer class to check for more tokens
 * try with resources can close/clean up the resources automatically
 * Deserialzation is the process of converting data from stream to an object
 */
}
