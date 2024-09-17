package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.crm.base.BaseClass;

public class ContactsPage extends BaseClass {

	public ContactsPage() throws IOException {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactslogo;
    @FindBy(xpath = "//strong[contains(text(),'Name')]")
	WebElement name;
	@FindBy(id="first_name")
	WebElement firstname;
	@FindBy(id="surname")
	WebElement lastname;
	@FindBy(name="client_lookup")
	WebElement companyname;
	@FindBy(xpath = "//input[@type='submit' and @class='button']")
	WebElement savebtn;
	
	
       public boolean contactsLogo() {
		return contactslogo.isDisplayed();
}
       public void createNewContact(String title, String ftName, String ltName, String comp) {
    	   Select select =new Select(driver.findElement(By.name("title")));
    	   select.selectByVisibleText(title);
    	   firstname.sendKeys(ftName);
    	   lastname.sendKeys(ltName);
    	   companyname.sendKeys(comp);
    	   savebtn.click();
    	   
    	   
    	   
    	   
       }

	
	
}
