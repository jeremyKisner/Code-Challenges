package challenges;

public class CheckPalindrome {
	/*
	 * Given the string, check if it is a palindrome.
	 */
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(checkPalindrome("anna"));
		long stop = System.nanoTime();
		long total = stop-start;
		System.out.println(total);

	}
	
	static boolean checkPalindrome(String inputString) {
	    for(int i = 0; i < inputString.length(); i++){
	        if(inputString.charAt(i) != inputString.charAt(inputString.length()-i-1))
	            return false;
	    }
	    return true;
	}
}
