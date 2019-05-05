package challenges;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicate {

	/*
	 * Given an array a that contains only numbers in the range from 1 to a.length, 
	 * find the first duplicate number for which the second occurrence has the minimal index. 
	 * In other words, if there are more than 1 duplicated numbers, 
	 * return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. 
	 * If there are no such elements, return -1.
	 */
	
	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 3, 2};
		System.out.println(firstDuplicate(a));
		firstDuplicate(a);
	}
	
	static int firstDuplicate(int[] a) {
		Map<Integer, Integer> answers = new LinkedHashMap<Integer, Integer>();
		int answerKey = -1;
		for (int i = 0; i < a.length; i++) {
			if (!answers.containsKey(a[i])) {
				answers.put(a[i], i);
			}
			else {
				answerKey = a[i];
				return answerKey;
			}
		}
		return answerKey;

}

}
