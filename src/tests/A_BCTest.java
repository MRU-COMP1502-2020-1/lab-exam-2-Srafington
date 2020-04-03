package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.A_BC;

public class A_BCTest {
	
	private A_BC testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new A_BC();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'A');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 2);
		assertEquals(testBody[0], 'B');
		assertEquals(testBody[1], 'C');
	}

}
