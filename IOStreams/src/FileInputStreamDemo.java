import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//Read a File Using FileInputStream
//Input streams and output streams are used to deal with binary data

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File("/C:/Users/gilbe/Desktop/FolderOfFolders/IOdemo.txt"));
			System.out.println("File Opened");

			int i;
			// the end of the file is represented by -1
			while ((i = fis.read()) != -1) {
				// if you print i only, you will print the byte values
				// you want the char values, so cast it to char
				System.out.print((char) i);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//when it tries to read a file and it cant be read for whatever reason
			// it will throw an io exception
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//close the file
			try {
				fis.close();
				System.out.println("\nFile Closed");
				//while closing a file we need to handle IOException
				//when it tries to close a file and it cant be closed for whatever reason
				// it will throw an io exception
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
