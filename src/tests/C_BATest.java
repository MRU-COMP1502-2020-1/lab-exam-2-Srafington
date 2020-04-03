package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lsystems.C_BA;
import lsystems.LRule;

public class C_BATest {
	
	private C_BA testClass;
	@Before
	public void setUp() throws Exception {
		testClass = new C_BA();
	}

	@Test
	public void testGetMatch() {
		assertEquals(testClass.getMatch(), 'C');
	}

	@Test
	public void testGetBody() {
		char[] testBody = testClass.getBody();
		
		assertEquals(testBody.length, 2);
		assertEquals(testBody[0], 'B');
		assertEquals(testBody[1], 'A');
	}
	
	@Test
	public void testInheritance() {
		assertTrue(testClass instanceof LRule);
	}

}
