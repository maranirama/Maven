package com.mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MavenOne {
	
	public MavenOne(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='/register']")
	WebElement Register;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement login;
	
	@FindBy(xpath="(//span[@class=\"cart-label])[1]")
	
	WebElement ShopingKart;
	
	public void clickOnReg()
	{
		Register.click();
	}

	public void clickOnLogin()
	{
		login.click();
	}
	public void clickOnShop()
	{
		ShopingKart.click();
	}
	

}
