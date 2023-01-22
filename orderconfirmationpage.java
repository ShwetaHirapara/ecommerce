package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class orderconfirmationpage extends Baseclass {
	@FindBy(xpath="//*[@id=\"cart\"]/button")
	WebElement cartbutton;
		
	@FindBy(xpath="//strong[normalize-space()='Checkout']")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement Checkout;
	
	public orderconfirmationpage() {
		PageFactory.initElements(driver, this);
	}
	public void checkoutcart() {
		Loginpage loginpage=new Loginpage();
		AddTocartpage addtocartpage =new AddTocartpage();
		action.click(driver, cartbutton);
		action.click(driver,proceedtocheckout);
		action.click(driver, Checkout);
	
	}
}
