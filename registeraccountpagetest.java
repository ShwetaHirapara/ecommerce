package com.ecommerce.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;
import com.ecommerce.pageobjects.Accountcreationpage;
import com.ecommerce.pageobjects.registeraccountpage;

public class registeraccountpagetest extends Baseclass {
	registeraccountpage registerpage;
	Accountcreationpage accountpage;
	
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup() throws InterruptedException {
		launchApp();
		Accountcreationpage accountpage=new Accountcreationpage();
		accountpage.AccCreatePage();
		Thread.sleep(3000);
			
	}
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void teaddown() {
		driver.quit();
	}
	@Test
	public void formentry() throws Exception {
		registeraccountpage registerpage =new registeraccountpage();
		Thread.sleep(4000);
		registerpage.fillingform();
	}
	
	
	
}
