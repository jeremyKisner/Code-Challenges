package challenges;

public class AlmostIncreasingSequence {
	
	/*
	 * Given a sequence of integers as an array, 
	 * determine whether it is possible to obtain a strictly increasing sequence by
	 *  removing no more than one element from the array.
	 */

	public static void main(String[] args) {
		int[] s = {1, 2, 3};
		System.out.println(almostIncreasingSequence(s));
	}
	
	static boolean almostIncreasingSequence(int[] sequence) {
	    int last = Integer.MIN_VALUE;
	    int lastPrev = Integer.MIN_VALUE;
	    int counter = 0;
	    
	    for (int number : sequence) {
	        if (number <= last) {
	        	counter++;
	            if (number > lastPrev) last = number;
	        } else {
	            lastPrev = last;
	            last = number;
	        }
	    }
	    return counter <= 1;
	}
}
