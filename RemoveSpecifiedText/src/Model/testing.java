package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class testing {

	public static void main(String[] args) throws IOException {

		
		
		
		
			File file = new File("C:\\Users\\PC\\Desktop\\degis.txt");  // bu dosyadan remove edecegiz . 
			String str = "yaz"; //String to remove
			StringWriter pr = new StringWriter();
			
			BufferedReader rdr = new BufferedReader(new FileReader(file));
			
			File file2 = new File("C:\\Users\\PC\\Desktop\\degistirildi.txt");
			
			
			String line;
			while((line = rdr.readLine()) != null) {
				
				pr.write(line.replaceAll(str, ""));
				
			}
			
			file.delete();
			File file3 = new File("C:\\Users\\PC\\Desktop\\degis.txt");
			FileWriter fr2 = new FileWriter("C:\\Users\\PC\\Desktop\\degis.txt");
			fr2.write(pr.toString());
			
			
			
			fr2.close();
			
		
			

	}
	}
