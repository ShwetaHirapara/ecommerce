package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class Orderpage extends Baseclass {

	
	@FindBy(xpath="//*[@id=\"content\"]/form//td[5]")
	WebElement unitprice;
	
	@FindBy(xpath="//*[@id=\"content\"]/form//table/tbody//td[6]")
	WebElement totalprice;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement placeanorder;

public   Orderpage() {
	PageFactory.initElements(driver, this);
}
	public double getunitprice() {
		String unitprice1=unitprice.getText();
		String unit=unitprice1.replaceAll("[^a-zA-Z0-9]", unitprice1);
		double finalunitprice=Double.parseDouble(unit);
		return finalunitprice/100;
	}
	
	public ordersummary clickoncheckout() {
		action.click(driver, placeanorder);
		return new ordersummary();
	}
	
}