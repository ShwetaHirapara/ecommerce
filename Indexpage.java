package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class Indexpage extends Baseclass {
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement clickonmyaccount;
		
	@FindBy(xpath ="//*[text()=\"Login\"]")
	WebElement login;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement SearchBtn;
	
	@FindBy(xpath="//a[normalize-space()='Your Store']")
	WebElement ninjalogo;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchbox;

	private Object Assert;
	
	public Indexpage() {
		PageFactory.initElements(driver, this);
	}
	public void clickonsebutton() {
		action.click(driver, SearchBtn);
	}
	public boolean validatlogo() {
		return action.isDisplayed(driver, ninjalogo);
	}
	
	public searchresultpage searchproduct(String productname) {
		action.type(searchbox, productname);
		action.click(driver, SearchBtn);
		return new searchresultpage();
	}
	public Loginpage loginform() throws InterruptedException {
		action.click(driver, clickonmyaccount);
		action.click(driver, login);
		return new Loginpage();
	}
	
}
