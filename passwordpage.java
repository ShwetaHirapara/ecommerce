package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class passwordpage extends Baseclass {
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement passwordbox;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signInSubmit;
	
public void passwordenter(String password) {
		action.type(passwordbox,password);
		}
	
public Accountspage signInSubmit() {
	action.click(driver, signInSubmit);
	return new Accountspage();
	}

public  passwordpage() {
	PageFactory.initElements(driver, this);
}

}
