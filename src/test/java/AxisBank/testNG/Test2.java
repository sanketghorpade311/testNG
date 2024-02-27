package AxisBank.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	WebDriver driver;

	@Test(priority = 1)
	public void testcaseMain() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Test priority 1");
		driver.quit();
	}

	@Test(enabled = false)
	public void testcase2() {
		System.out.println("This is false ");
	}

	@Test(priority = 0)
	public void testcase1() {
		System.out.println("Test 1 priority 0");
	}
}
