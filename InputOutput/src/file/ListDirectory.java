package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;

import file.fileExceptions.invalidProgramArgumentsException;

public class ListDirectory {

	private static final String APP_NAME = "ListDirectory";
	private static final int PATH_ARGUMENT_INDEX = 0;
	private static final int LIST_REGEX_ARGUMENT = 1;

	public static void start(String[] args) {

		/*
		 * Calistirirken java ListDirectory ... ...nin oldugu yer argumanlar listsi ..
		 * bunun 0.indexteki elemani yani ilk arguman bize pathi veriyor .
		 */

		try {
			validateArguments(args);
			String pathname = getPathNameArgument(args); // pathname i veren argumani aldik
			File path = new File(pathname); // onunla bir representasyon olusturduk

			if (path.isFile()) { // dosya ise dogrudan yazdiriyoruz
				writeToConsole(pathname);
				System.exit(1);
			}
			FilenameFilter filter = null;
			if (isListRegex(args))
				filter = new ListDirectoryFilter(getListRegexArgument(args));
			doList(path, filter);

		} catch (invalidProgramArgumentsException e) {
			// TODO Auto-generated catch block
			usage(e.getMessage());
		}

	}

	private static void writeToConsole(String message) {
		System.out.println(message);
	}

	private static String getPathNameArgument(String[] args) { // pathi aldigimiz ilk arguman
		return args[PATH_ARGUMENT_INDEX];
	}

	private static String getItemTypeSign(File path) { // directory ise d file ise f veriyor
		return path.isDirectory() ? "D" : "F";
	}

	private static void doList(File path, FilenameFilter filter) {
		String[] directoryItems = Objects.isNull(filter) ? path.list() : path.list(filter);

		for (String pathItem : directoryItems) { // dizinde bulunan her item

			File p = new File(path, pathItem); // parent olarak file i verdik ,
			System.out.println((String.format("%s  -->  %s", getItemTypeSign(p), p.getAbsolutePath())));
			if (p.isDirectory()) {

				doList(p, filter);

			}

		}

	}

	private static void validateArguments(String[] args) throws invalidProgramArgumentsException {
		if (args.length == 0 || args.length > 2) {
			throw new invalidProgramArgumentsException("wrong args");
		}
		if (!new File(getPathNameArgument(args)).exists()) {
			throw new invalidProgramArgumentsException("path doesnt exist");
		}
	}

	private static boolean isListRegex(String[] args) {
		return args.length == 2;
	}

	private static String getListRegexArgument(String[] args) {
		return args[LIST_REGEX_ARGUMENT];
	}

	private static void usage(String message) {

		System.out.println(System.out.format("%s %nUsage : java %s <path> list[regex]",
				(Objects.isNull(message) ? " " : message), APP_NAME));
	}

	public static void main(String[] args) {

		ListDirectory l = new ListDirectory();

		start(args);

	}

}
