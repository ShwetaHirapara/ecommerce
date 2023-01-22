package com.ecommerce.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Baseclass;
import com.ecommerce.pageobjects.Indexpage;
import com.ecommerce.pageobjects.Loginpage;

public class Indexpagetest extends Baseclass {
	Indexpage indexpage;

	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup() {
		launchApp();
	}
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void teaddown() {
		driver.quit();
	}
	@Test(groups = "Smoke")
	public  void verifylogo() throws InterruptedException {
		Indexpage indexpage=new Indexpage();
		boolean result=indexpage.validatlogo();
		Assert.assertTrue(result);
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle,"Your Store");
		indexpage.loginform();
		System.out.println("done");
		}
		
	}
		

