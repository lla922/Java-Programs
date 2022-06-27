package Copy;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPaste {

	private static int pathOfFileToCopyIndex = 0;
	private static int pathOfFolderToCopyInto = 1;

	public static String getPathOfFileToCopyArgument(String args[]) {
		return args[pathOfFileToCopyIndex];
	}

	public static String getFolderPathToCopyToArgument(String[] args) {
		return args[pathOfFolderToCopyInto];
	}

	private static void validateArguments(String[] args) throws InvalidArgumentException {

		if (args[0] == null) {
			throw new InvalidArgumentException("Please enter path of the file to copy");
		} else if (args[1] == null) {
			throw new InvalidArgumentException("Please enter a location to copy the file .");
		}

	}

	private static void doCopy(File fileToCopy, File folderToCopyTo, String[] args) {

		fileToCopy = new File(args[pathOfFileToCopyIndex]);
		folderToCopyTo = new File(args[pathOfFolderToCopyInto]);

		if (fileToCopy.exists() && fileToCopy.isFile()) {
			if (folderToCopyTo.isDirectory()) {

				try {

					File newCopiedFile = new File(folderToCopyTo, fileToCopy.getName());

					BufferedInputStream is = new BufferedInputStream((new FileInputStream(fileToCopy)));

					FileOutputStream o = new FileOutputStream(newCopiedFile);

					String str = "";
					int i;

					while ((i = is.read()) != -1) {
						o.write(i);

					}

					newCopiedFile.createNewFile();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	public static void main(String[] args) {

		try {
			validateArguments(args);
		} catch (InvalidArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file1 = new File(args[pathOfFileToCopyIndex]);
		File file2 = new File(args[pathOfFolderToCopyInto]);
		doCopy(file1, file2, args);

	}

}
