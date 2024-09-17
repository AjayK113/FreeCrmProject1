package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		PageFactory.initElements(driver,this);
				}
	
	@FindBy(xpath="//td[contains(text(),'User: AJAY  KUMAR')]")
	WebElement usernameLable;
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskLinks;
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	
	
	public String verifyHomePageTitle() {
		
		return  driver.getTitle();
	}
	public boolean verifyUsername() {
		return usernameLable.isDisplayed();
	}
    public ContactsPage clickonContactsLink() throws IOException{
    	contactsLink.click();
    	return new ContactsPage();
     }
	public DealsPage clickonDealsLink() {
		dealslink.click();
		return new DealsPage();
	}
	public TaskPage clickonTaskLink() {
		taskLinks.click();
		return new TaskPage();
	}
	public void newContactsLink() {
		Actions action =new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	
}
