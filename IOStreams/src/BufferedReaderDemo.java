import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

// Count words and lines using BufferedReader and StringTokenizer
public class BufferedReaderDemo {

	public static void main(String[] args) {

		int countLines = 0;
		int count = 0;

		// BufferedReader is a decorator of FileReader, it will do some
		// additional work.

		// TRY WITH RESOURCE BLOCK
		try (
				// INSIDE THE RESOURCE BLOCK
				// The jvm will automatically close the fr and the br when they
				// are not used.
				// So we delete the finally block with fr.close() and br.close()
				// which are not necessary now.
				// The jvm handles the closing of resources for us
				FileReader fr = new FileReader("/C:/Users/gilbe/Desktop/FolderOfFolders/BufferedReaderDemo.txt");
				BufferedReader br = new BufferedReader(fr);
			) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println("LINE "+countLines);
				StringTokenizer st = new StringTokenizer(line);
				countLines++;
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
				
			}
			System.out.println("Number of lines: " + countLines);
			System.out.println("Number of words in the file: " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
