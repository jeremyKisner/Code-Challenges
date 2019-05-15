package challenges;

import java.util.LinkedList;
import java.util.List;

public class CommonCharacterCount {
	
	/*
	 * Given two strings, find the number of common characters between them.
	 */

	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "adcaa";
		commonCharacterCount(s1, s2);
	}
	
	public static int commonCharacterCount(String s1, String s2) {
		List<String> charaters = new LinkedList<String>();
		for (String letter: s1.split("")) {
			if (s2.contains(letter)) {
				s2 = s2.replaceFirst(letter, "");
				charaters.add(letter);
			}
		}
		return charaters.size();
	}


}
