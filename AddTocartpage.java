package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class AddTocartpage extends Baseclass {
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchbox;

	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement SearchBtn;	
	
	@FindBy(id="button-search")
	WebElement Search;
	
	@FindBy(xpath="//a[contains(text(),'Tablets')]")
	WebElement Tablets;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	WebElement addtocartButton;
	
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]/text()[1]")
	WebElement addedtocartmessage;
	
	public AddTocartpage() {
		PageFactory.initElements(driver,this);
	}
	
	public orderconfirmationpage addtocart() {
		action.click(driver, Tablets);
		action.click(driver, addtocartButton);
		action.isDisplayed(driver, addedtocartmessage);
		return new orderconfirmationpage();
	}
	public boolean validateAddtocart() {
		return action.isDisplayed(driver, addedtocartmessage);
	}
	
	
	
	
	
	
	
	
	
	
}
