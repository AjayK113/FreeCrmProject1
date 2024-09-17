package com.crm.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.crm.base.BaseClass;
import com.crm.pages.ContactsPage;
import com.crm.pages.DealsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.TaskPage;
import com.crm.util.Testutil;

public class HomePageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	DealsPage dealspage;
	TaskPage taskpage;
	Testutil testutil;
	

	public HomePageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		
		driverLunch();
		 testutil = new Testutil();
		 contactspage= new ContactsPage();
		 dealspage=new DealsPage();
		 taskpage=new TaskPage();
		loginpage=new LoginPage();
		homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		

		driver.quit();
	}
	
	@Test
	public void verifyHomePageTitleTest() {
	
		String homepagetitle=homepage.verifyHomePageTitle();
		
	String expectedttl="Free CRM  - CRM software for customer relationship management, sales, and support";
		Assert.assertEquals(homepagetitle,expectedttl,"homepage title not matched");
	}
	@Test
	public void verifyUsernameTest() throws IOException {
		
	Testutil.switchToFram();
		boolean flag = homepage.verifyUsername();
		Assert.assertTrue(flag);
		
		}
	@Test
	public void verifyContactlinksTest () throws IOException {
		
		Testutil.switchToFram();
		 contactspage = homepage.clickonContactsLink();
	}
	@Test
	public void clickonDealsLink() throws IOException {
		
		Testutil.switchToFram();
		dealspage=homepage.clickonDealsLink();
	}
	@Test
	public void  clickonTaskLink() throws IOException {
		
		Testutil.switchToFram();
		taskpage=homepage.clickonTaskLink();
		
	}
	}
	

	
	
	
	

