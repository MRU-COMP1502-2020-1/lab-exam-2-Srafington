package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.A_AA;

public class A_AATest {
	
	private A_AA testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new A_AA();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'A');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 2);
		assertEquals(testBody[0], 'A');
		assertEquals(testBody[1], 'A');
	}

}
