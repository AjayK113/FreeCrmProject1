package com.crm.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.crm.base.BaseClass;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	


	public LoginPageTest() throws IOException {
		super();
		}

	@BeforeMethod
	public void setUp() throws IOException {
	

		driverLunch();
		loginpage=new LoginPage();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
	
	@Test
	public void loginTest() throws IOException {
		
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test
	public void validateCrmLogoImageTest() {
	
		boolean flag=loginpage.validateCrmLogoImage();
		Assert.assertTrue(flag);
	}
	@Test
	public void loginPageTitleTest() {
	
		String title=driver.getTitle();
		String etitle="CRMPRO";
		Assert.assertEquals(title,etitle);
	}
}
