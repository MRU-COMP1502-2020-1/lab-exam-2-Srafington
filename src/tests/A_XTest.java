package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.A_X;

public class A_XTest {
	
	private A_X testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new A_X();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'A');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 0);

	}

}
