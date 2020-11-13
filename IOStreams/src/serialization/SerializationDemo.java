package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Serialization In Action
public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			//.ser is a common extension for serialized objects
			//this will create Emp.ser file for you
			fos = new FileOutputStream("/C:/Users/gilbe/Desktop/FolderOfFolders/Emp.ser");
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee(1,"Gil", 13000, 12345);
			oos.writeObject(emp);
			System.out.println("Employee Object Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
