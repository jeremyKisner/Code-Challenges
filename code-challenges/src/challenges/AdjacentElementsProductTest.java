package challenges;

import static org.junit.Assert.*;

import org.junit.Test;

import challenges.AdjacentElementsProduct;

public class AdjacentElementsProductTest {

	@Test
	public void test() {
		int[] inputArray = {3, 6, -2, -5, 7, 3};
		assertEquals(21, AdjacentElementsProduct.adjacentElementsProduct(inputArray));
	}

}
