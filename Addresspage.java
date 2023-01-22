package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class Addresspage extends Baseclass {
	@FindBy(xpath="//h1[1]")
	WebElement proceedtocheckout;

public Addresspage() {
	PageFactory.initElements(driver, this);
}
public shippingpage clickonproceedtocheckout() {
	action.click(driver, proceedtocheckout);
	return new shippingpage();
}




}