package com.crm.pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.base.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
     WebElement username;	
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	@FindBy(xpath="//a[(text()='Sign Up')]")
	WebElement signupbtn;
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmlogo;
	//DIFFERENT ACTION IN LOGIN CLASS
	
	public String  loginPageTitleTest() {
		return driver.getTitle();
	}
	public boolean validateCrmLogoImage() {
	      return crmlogo.isDisplayed();
	}
	public HomePage login(String un,String pwd) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
		
	}
	
	
	
}
