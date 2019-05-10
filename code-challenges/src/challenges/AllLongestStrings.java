package challenges;

import java.util.ArrayList;

public class AllLongestStrings {

	/*
	 * Given an array of strings, return another array containing all of its longest strings.
	 */

	public static void main(String[] args) {
		String[] a = {"aba", "aa", "ad", "vcd", "aba"};
		allLongestStrings(a);
	}


	static String[] allLongestStrings(String[] inputArray) {
		int longestStringLength = 0;
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() >= longestStringLength) {
				longestStringLength = inputArray[i].length();
			}
		}

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() == longestStringLength) {
				list.add(inputArray[i]);
			}
		}

		int outputArraySize = list.size()-1;
		String[] outputArray = new String[outputArraySize];
		return list.toArray(outputArray);
	}


}
