package bgm.yzl.ReplaceText;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

public static void main(String[] args) {
		
		File file = new File(args[0]);
		File file2 = new File(args[1]);
		String ch = args[2];
		String chto = args[3];
		
		try {
			ReplaceText.replaceText(file,file2,ch,chto,args);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
