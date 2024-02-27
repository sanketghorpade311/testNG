package AxisBank.testNG;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class SimpleTest {

	@Test
	public void testPass() {
		// Do some assertions
		assertTrue(true); // Use TestNG's assertTrue
	}

	@Test
	public void testFail() {
		// Do some assertions
		assertFalse(true); // Use TestNG's assertFalse
	}

	@Test(dependsOnMethods = "testFail")
	public void testSkip() {
		// Do some assertions
		assertTrue(true); // Use TestNG's assertTrue
	}
}
