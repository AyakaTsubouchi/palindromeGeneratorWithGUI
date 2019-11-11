package checkPalindromeWithGUI;

import java.util.Random;

public class PalindromeGenerator {
	static String str = "abcdefghijklmnopqrstuvwxyz";
	public static String PalindromeGenerator(int inputNum) {
		StringBuilder result = new StringBuilder();
		int halfsize = (int) Math.floor((inputNum / 2));

//		for (int i = 0; i < halfsize; i++) {
//			int num = getRandomNum();
//			char ch = str.charAt(num);
//			result.append(ch);
		//}
		if (inputNum % 2 == 0) {
			for (int i = 0; i < halfsize; i++) {
				int num = getRandomNum();
				char ch = str.charAt(num);
				result.append(ch);
			}
			// 'reverses' all the word*/
			String reverse = result.toString();
			result.append(reverseword(reverse));
			return result.toString();
		}else {
			for (int i = 0; i <= halfsize; i++) {
				int num = getRandomNum();
				char ch = str.charAt(num);
				result.append(ch);
			}
			StringBuilder removedLast = new StringBuilder(result);
			removedLast.setLength(removedLast.length()-1);
			String reverse = removedLast.toString();
			result.append(reverseword(reverse));
			return result.toString();			
		}
	}

	private static int getRandomNum() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(26);
		return randomInt;

	}

	// 7) Create a program that 'reverses' the word*/
	public static String reverseword(String text) {
		StringBuilder result = new StringBuilder();
		String clean = text.replaceAll("\\s+", "").toLowerCase();
		for (int i = clean.length() - 1; i >= 0; i--) {
			result.append(clean.charAt(i));			
		}
		return result.toString();
	}
}
