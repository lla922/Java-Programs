package file;

import java.io.File;
import java.io.FilenameFilter;

public class ListDirectoryFilter implements FilenameFilter {

	private String regex;

	public ListDirectoryFilter(String regex) {
		this.regex = regex;
	}

	@Override
	public boolean accept(File dir, String name) {
		System.out.format("(list directory filter) %s", name);
		return false;
	}

}
