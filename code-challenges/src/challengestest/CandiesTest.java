package challengestest;

import static org.junit.Assert.*;

import org.junit.Test;

import challenges.Candies;

public class CandiesTest {

	@Test
	public void testCandies() {
		assertEquals(9, Candies.candies(3,10));
		assertEquals(0, Candies.candies(3,0));

	}

}
