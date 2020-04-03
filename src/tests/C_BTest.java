package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.C_B;
import lsystems.LRule;

public class C_BTest {
	
	private C_B testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new C_B();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'C');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 1);
		assertEquals(testBody[0], 'B');
	}

	@Test
	public void testInheritance() {
		assertTrue(testClass instanceof LRule);
	}
}
