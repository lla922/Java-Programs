package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class RemoveOccurrences {
	
	private final static int stringToRemoveIndex = 0;
	private final static int fileToRemoveFromIndex = 1;
	
	
	public static void removeOccurrences(String[] args) throws IOException {
		File file = new File(args[1]);  // We will remove occurances from this file.
		String str = args[0]; //String to remove
		StringWriter stringWriter = new StringWriter();
		BufferedReader rdr = new BufferedReader(new FileReader(file));
		
		String line;
		while((line = rdr.readLine()) != null) {
			stringWriter.write(line.replaceAll(str, "")); //we read into stringWriter object
		}
		
		file.delete();   // we delete the file
		File file3 = new File(args[1]); //create the same file path again
		FileWriter fileWriter = new FileWriter(file3);
		fileWriter.write(stringWriter.toString());
		fileWriter.close();
		
	}

}
