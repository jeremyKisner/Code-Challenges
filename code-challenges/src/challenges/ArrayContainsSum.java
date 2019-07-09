package challenges;

public class ArrayContainsSum {
	
	/*
	 * Given a list of number, and a number 'k', return whether any two numbers
	 * from the list add up to 'k';
	 */

	public static void main(String[] args) {
		int[] arr = {10, 15, 3, 7};
		int sum = 17;
		findSum(arr, sum);
	}

	public static boolean findSum(int arr[], int sum) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length;j++) {
				temp = arr[i] + arr[j];
				if (temp == sum) {
					return true;
				}
			}
		}
		return false;
	} 

}
