package byteoriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// output stream olusturmaliyiz

		write("C:\\Users\\begum\\Desktop\\out.txt", dummyText.loramIpssum.getBytes());

	}

	public static void write(String pathname, byte[] data) {

		try (FileOutputStream out = new FileOutputStream(new File(pathname));) {

			out.write(data);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
