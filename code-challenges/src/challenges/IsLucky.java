package challenges;

public class IsLucky {
	
	/*
	 * Ticket numbers usually consist of an even number of digits. 
	 * A ticket number is considered lucky if the sum of the first
	 *  half of the digits is equal to the sum of the second half.
	 */

	public static void main(String[] args) {
		isLucky(1230);
	}
	
	public static boolean isLucky(int n) {
		int half = String.valueOf(n).length()/2;
		int firstHalfSum = 0;
		int secondHalfSum = 0;
		for (int i = 0; i < String.valueOf(n).length(); i++) {
			if (i < half) {
				firstHalfSum += Character.getNumericValue(String.valueOf(n).charAt(i));
			}
			else {
				secondHalfSum += Character.getNumericValue(String.valueOf(n).charAt(i));
			}
		}
		if (firstHalfSum == secondHalfSum) return true;
		return false;
	}


}
