package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class homepage extends Baseclass {
	@FindBy(xpath="//a[text()='View your order history']")
	WebElement orderhistory;
	
	@FindBy(xpath="//a[text()='Returns']")
	WebElement Returns;
	
	@FindBy(xpath="//a[normalize-space()='Your Store']")
	WebElement loggedstore;
	
	@FindBy(xpath="//a[text()='Wish List']")
	WebElement wishlist;
	
	@FindBy(xpath="//*[@id='cart']/button")
	WebElement cartbutton;
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateloggedInname() {
		 action.isDisplayed(driver, loggedstore);
	}
	public void validateorderhistory() {
		action.click(driver,orderhistory);
		action.isDisplayed(driver, cartbutton);
		
	}
		
}
