package outputstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Using Reader and Writer
//Readers and writers deal with text data
public class ReaderAndWriterDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("/C:/Users/gilbe/Desktop/FolderOfFolders/ReaderWriterDemo.txt");
		fw = new FileWriter("/C:/Users/gilbe/Desktop/FolderOfFolders/newReaderWriterDemo.txt");
		
		int ch;
		
		while((ch=fr.read())!= -1){
			fw.write(ch);
		}
		fw.write("\n[COPY USING FILEREADER AND FILEWRITER]");
		fr.close();
		fw.close();
		//its a good practice to have try catch but ill skip it here 
	}

}
