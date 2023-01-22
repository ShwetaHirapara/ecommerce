package com.ecommerce.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class Accountcreationpage extends Baseclass{
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	public Accountcreationpage() {
		PageFactory.initElements(driver, this);
	}
	public registeraccountpage AccCreatePage() {
		action.click(driver, myaccount);
		WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
		action.mouseOverElement(register);
		action.click(driver, register);
		return new registeraccountpage();
		
	}
	
		
	
	
	
	
	

}
