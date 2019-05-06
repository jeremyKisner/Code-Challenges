package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentElementsProduct {
	
	/*
	 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
	 */
	
	public static void main(String[] args) {
		int[] inputArray = {3, 6, -2, -5, 7, 3};
		adjacentElementsProduct(inputArray);
	}
	
	public static int adjacentElementsProduct(int[] inputArray) {
		List<Integer> products = new ArrayList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			if (i < inputArray.length-1) {
				products.add(inputArray[i] * inputArray[i+1]);
			}
		}
		Collections.sort(products);
		return products.get(products.size()-1);
	}
}
