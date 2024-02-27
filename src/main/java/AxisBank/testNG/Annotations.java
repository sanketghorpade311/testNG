package AxisBank.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Before and After methods is the most popular one

public class Annotations {
	@Test
	public void f() {
		System.out.println("Test");
		System.out.println(" ");
	}

	@Test
	public void f2() {
		System.out.println("Test 2");
		System.out.println(" ");
	}

	@BeforeMethod // Popular
	public void beforeMethod() {
		System.out.println("Before Method ");
		System.out.println(" ");
	}

	@AfterMethod // Popular
	public void afterMethod() {
		System.out.println("After method");
		System.out.println(" ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		System.out.println(" ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		System.out.println(" ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(" Before Test");
		System.out.println(" ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println(" After Test");
		System.out.println(" ");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
		System.out.println(" ");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
		System.out.println(" ");
	}

}
