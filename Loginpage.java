package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;


public class Loginpage extends Baseclass {

	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement clickonmyaccount;
		
	@FindBy(xpath ="//*[text()=\"Login\"]")
	WebElement login;
	
	@FindBy(id="input-email")
	WebElement emaildata;
	
	@FindBy(id="input-password")
	WebElement passwordn;
		
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbutton;
	
	public  homepage  emailform(String email, String pass) throws InterruptedException {
		action.click(driver, clickonmyaccount);
		action.click(driver, login);
		action.type(emaildata, email);
		action.type(passwordn,pass);
		Thread.sleep(4000);
		action.click(driver,loginbutton);
		return new homepage();
	}	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
