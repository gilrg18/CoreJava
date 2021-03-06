package outputstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Copy a file using FileOutputStream
//Works with text and pictures
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/C:/Users/gilbe/Desktop/FolderOfFolders/IOdemo.txt");
			//FileOutputStream will create a new file called IOdemoCOPY or however you want to call it 
			fos = new FileOutputStream("/C:/Users/gilbe/Desktop/FolderOfFolders/IOdemoCOPY.txt");
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
				System.out.print((char) data);
			}
			System.out.println("\nFile Copied Succesfully");
		} catch (FileNotFoundException e) {
			System.out.println("File not found gg wp");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
