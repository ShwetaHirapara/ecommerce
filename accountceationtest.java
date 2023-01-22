package com.ecommerce.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.actiondriver.action;
import com.ecommerce.base.Baseclass;
import com.ecommerce.pageobjects.Accountcreationpage;


public class accountceationtest extends Baseclass{
	Accountcreationpage accountcreationpage=new Accountcreationpage();
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup() {
		launchApp();
	}
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void teaddown() {
		driver.quit();
	}
	@Test(groups = "Sanity")
	public void clickonmyaccountbutton() throws InterruptedException {
		Accountcreationpage accountpage=new Accountcreationpage();
		accountpage.AccCreatePage();
		Thread.sleep(3000);
		String actultitle=driver.getCurrentUrl();
		System.out.println(actultitle);
		Assert.assertEquals(actultitle,"http://tutorialsninja.com/demo/index.php?route=account/register");
	}
	

}
