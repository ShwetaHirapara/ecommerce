package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class registeraccountpage extends Baseclass {
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//input[@value='0']")
	WebElement subscribebutton;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreecheckbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebutton;

	public  registeraccountpage() {
		PageFactory.initElements(driver, this);
	}

	
	public void fillingform() throws Exception {
		
		action.type(fname,"ram");
		action.type(lname, "shree");	
		action.type(email, "test1@gmail.com");	
		action.type(telephone, "12322");	
		action.type(password, "shweta123")	;
		action.type(confirmpassword, "shweta123");
		action.click(driver, subscribebutton);
		action.click(driver, agreecheckbox);
		action.click(driver, continuebutton);
	}


	
	
	
}
