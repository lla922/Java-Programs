package charoriented;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import byteoriented.dummyText;

public class WriteFile {

	public static void main(String[] args) {

		write("C:\\\\Users\\\\begum\\\\Desktop\\\\WriteByCharArray.txt", dummyText.loramIpssum.toCharArray());
		writeByChars("C:\\\\Users\\\\begum\\\\Desktop\\\\writeByChars.txt", dummyText.loramIpssum.toCharArray());
		writeWithBuffer("C:\\\\Users\\\\begum\\\\Desktop\\\\writeByBuffer.txt", dummyText.loramIpssum.toCharArray());
	}

	public static void write(String pathname, char[] string) {

		try (FileWriter writer = new FileWriter(new File(pathname));) {

			writer.write(string);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// karakter karakter tek tek...
	public static void writeByChars(String pathname, char[] string) {

		try (FileWriter writer = new FileWriter(pathname);) {

			for (char c : string) {
				writer.write(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeWithBuffer(String pathname, char[] data) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathname));) {

			writer.write(data);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
