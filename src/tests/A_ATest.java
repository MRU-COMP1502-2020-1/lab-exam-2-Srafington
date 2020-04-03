package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.A_A;

public class A_ATest {
	
	private A_A testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new A_A();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'A');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 1);
		assertEquals(testBody[0], 'A');
	}

}
