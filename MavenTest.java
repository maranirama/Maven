package com.mavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mavenProject.MavenOne;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
	private WebDriver driver;
	@Test
	public void launch()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	}
	 MavenOne m1=new MavenOne(driver);
	 m1.clickOnReg();

}
