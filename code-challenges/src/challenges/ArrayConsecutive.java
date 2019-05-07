package challenges;

import java.util.Arrays;

public class ArrayConsecutive {
	/*
	 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
	 * each statue having an non-negative integer size. Since he likes to make things perfect, 
	 * he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. 
	 * He may need some additional statues to be able to accomplish that. 
	 * Help him figure out the minimum number of additional statues needed.
	 * 
	 * Example:
	 * statues = [6, 2, 3, 8]
	 * makeArrayConsecutive2(statues) = 3
	 * Ratiorg needs statues of sizes 4, 5 and 7.
	 */
	
	public static void main(String[] args) {
		int[] statues = {6, 2, 3, 8};
		System.out.println(makeArrayConsecutive2(statues));
	}
	
	static int makeArrayConsecutive2(int[] statues) {
		Arrays.sort(statues);
		int statuesNeeded = 0;
		for (int i = 0; i < statues.length-1; i++) {
			statuesNeeded += statues[i+1] - statues[i] - 1;
		}
		return statuesNeeded;
	}
}
