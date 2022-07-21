package bgm.yzl.ReplaceText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
		
	public static void replaceText(File fileToBeChanged, File newFile, String change, String changeInto, String[] args) throws FileNotFoundException {
		
		fileToBeChanged = new File(args[0]);
		newFile = new File(args[1]);
		change = args[2];
		changeInto = args[3];
		
		if(fileToBeChanged.exists()) {
			
			Scanner scanner = new Scanner(fileToBeChanged);
			PrintWriter wr = new PrintWriter(newFile);
			
			while(scanner.hasNext()) {
				String str = scanner.next();
				
				if(!str.equals(change)) {
					wr.print(str);
					wr.print(" ");
				}else {
					wr.print(changeInto);
					wr.print(" ");
				} 
			}wr.close();
		}
		
	}
	
	

}
