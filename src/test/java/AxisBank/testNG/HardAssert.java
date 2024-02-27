package AxisBank.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void testHardAssert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Performing hard assert on the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Orange";
		Assert.assertEquals(expectedTitle, actualTitle, "Title mismatch!");

		// Performing actions only if the title assertion passes
		if (actualTitle.equals(expectedTitle)) {
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			System.out.println("Username added successfully!");
		} else {
			System.out.println("Title assertion failed. Username not added.");
		}

		// Close the browser
		driver.close();
	}
}
