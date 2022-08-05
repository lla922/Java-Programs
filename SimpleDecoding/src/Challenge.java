public class Challenge {

	public static String decryptMessage(String encryptedMessage) {

		char[] myarray = encryptedMessage.toCharArray();
		char repeatDigits = 0;
		char reperatedChar = '\0';
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < myarray.length; i++) {
			str.append(myarray[i]);

			if (myarray[i] == '1' || myarray[i] == '2' || myarray[i] == '3' || myarray[i] == '4' || myarray[i] == '5'
					|| myarray[i] == '6' || myarray[i] == '7' || myarray[i] == '8' || myarray[i] == '9') {
				repeatDigits = myarray[i];
				reperatedChar = myarray[i - 1];
				str.deleteCharAt(i);
				for (int x = 1; x < Character.getNumericValue(repeatDigits); x++) {
					str.insert(i, reperatedChar);
				}

			}

		}

		System.out.println(str);
		return encryptedMessage;

	}

	public static void main(String[] args) {

		String str = "be6gum";

		System.out.println(decryptMessage(str));

	}
}
