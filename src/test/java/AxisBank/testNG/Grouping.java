package AxisBank.testNG;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = ("Sanity"))
	public void login() {
		System.out.println("Sanity");
	}

	@Test(groups = ("Regression"))
	public void AddtoCart() {
		System.out.println("Regression");
	}

	@Test(groups = { "Regression", "Sanity" })
	public void ProductsListed() {
		System.out.println("Regression and Sanity");
	}

	@Test(groups = ("Sanity"))
	public void Orders() {
		System.out.println("Sanity");
	}

}
