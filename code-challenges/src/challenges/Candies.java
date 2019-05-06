package challenges;

/*
 * n children have got m pieces of candy. 
 * They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. 
 * Determine how many pieces of candy will be eaten by all the children together. 
 * Individual pieces of candy cannot be split.
 */

public class Candies {
	public static void main(String[] args) {
		candies(3,10);
	}
	
	public static int candies(int n, int m) {
		return (m/n)*n;
	}
}
