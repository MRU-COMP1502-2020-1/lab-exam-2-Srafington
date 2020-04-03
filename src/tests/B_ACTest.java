package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.B_AC;
import lsystems.LRule;

public class B_ACTest {
	
	private B_AC testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new B_AC();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'B');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 2);
		assertEquals(testBody[0], 'A');
		assertEquals(testBody[1], 'C');
	}
	
	@Test
	public void testInheritance() {
		assertTrue(testClass instanceof LRule);
	}

}
