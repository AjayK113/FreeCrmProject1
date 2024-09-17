package com.crm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.crm.base.BaseClass;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.util.Testutil;

public class ContactsPageTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	public ContactsPageTest() throws IOException {
		super();
		}
@BeforeMethod
public void setup() throws IOException {


    driverLunch();
	loginpage=new LoginPage();
	contactspage=new ContactsPage();
	homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	Testutil.switchToFram();
	contactspage=homepage.clickonContactsLink();
}

@AfterMethod
public void tearDown() {


	driver.quit();
}

@DataProvider( )








@Test
public void contactsLogoTest() {

	
	boolean flag=contactspage.contactsLogo();
	Assert.assertTrue(flag,"Contacts logo is missing");
	
}
@Test
public void validateNewContact() {
	
	homepage.newContactsLink();
	contactspage.createNewContact("Mr", "ajay", "kumar", "tcs" );
	
}
	
	
}
