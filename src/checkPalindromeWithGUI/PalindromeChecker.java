package checkPalindromeWithGUI;

import javax.swing.JLabel;

public class PalindromeChecker {
	// 6) Create a program that tells if a word is a palindrome or not
		public static void isPalindrome(String text, JLabel result) {
			String clean = text.replaceAll("\\s+", "").toLowerCase();
			int length = clean.length();
			int forward = 0;
			int backward = length - 1;
			
			while (backward > forward) {
				char forwardChar = clean.charAt(forward++);
				char backwardChar = clean.charAt(backward--);
				if (forwardChar != backwardChar)
					result.setText("It isn't a palindrome");
					
			}
			result.setText("It is a palindrome");
			
		}

}
