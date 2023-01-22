package com.ecommerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;

public class searchresultpage extends Baseclass{
@FindBy(xpath="//*[@id=\"CardInstanceLVK3qXlcg1G_bj_vfD4jbw\"]/div[1]/div[2]/div[2]//img")
WebElement productresult;

public searchresultpage() {
	PageFactory.initElements(driver, this);
}

public boolean isproductavailable() {
	return action.isDisplayed(driver, productresult);
}
public AddTocartpage clickonproduct() {
	action.click(driver, productresult);
	return new AddTocartpage();
}










}




