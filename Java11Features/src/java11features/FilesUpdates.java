package java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdates {
	public static void main(String[] args) throws IOException {
		//Write string data to a temp file
		Path writeString = Files.writeString(Files.createTempFile("test", ".txt"), "Data that goes into the file");
		System.out.println(writeString);
		String str = Files.readString(writeString);
		System.out.println(str);
	}
}
