package checked;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedException {
	/*
	 *So the throws keyword can be used to 
	 *declare that a method is not going to handle the 
	 *checked exception but
	 *the caller needs to handle it. 
	 *And if at the end nobody handles it, 
	 *everybody declares it using throws, 
	 *it will go to the JVM's default
	 *exception handler.
	 */
	void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("");
	}
	//Checked exceptions will immediatly complain that
	//you need to take care of a exception
	public static void main(String[] args) throws FileNotFoundException {
		CheckedException ce = new CheckedException();
		try{
			ce.readFile();
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		
	}

}
