package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.B_A;

public class B_ATest {
	
	private B_A testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new B_A();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'B');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 1);
		assertEquals(testBody[0], 'A');
	}

}
