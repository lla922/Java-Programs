
package file;

import java.util.Arrays;

public class ProgramArguments {

	/*
	 * java processi ayaga kaldirildigi zaman disardan ona arguman gecebiliyoruz .
	 * Dolayisiyla java processi string arrayi seklinde bunlari oraya aktariyor .
	 */

	public static void main(String[] args) {

		System.out.println(args.length);
		System.out.println(Arrays.toString(args));

	}

}
