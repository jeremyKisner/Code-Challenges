package challengestest;

import static org.junit.Assert.*;

import org.junit.Test;

import challenges.AddTwoNumbers;

public class AddTwoNumbersTest {

	@Test
	public void testAdd() {
		assertEquals(4, AddTwoNumbers.add(2,2));
		assertEquals(0, AddTwoNumbers.add(-2,2));
		assertEquals(-7, AddTwoNumbers.add(-2,-5));
	}

}
