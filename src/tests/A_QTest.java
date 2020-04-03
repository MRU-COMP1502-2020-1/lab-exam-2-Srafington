package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.A_Q;

public class A_QTest {
	
	private A_Q testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new A_Q();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'A');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 1);
		assertEquals(testBody[0], 'Q');
	}

}
