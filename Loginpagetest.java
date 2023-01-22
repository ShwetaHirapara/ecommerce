package com.ecommerce.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Baseclass;
import com.ecommerce.pageobjects.Loginpage;


public class Loginpagetest extends Baseclass {
	Loginpage loginpage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void teaddown() {
		driver.quit();
	}
	
	@Test
	public void logintest() throws InterruptedException  {
		Loginpage loginpage=new Loginpage();
		loginpage.emailform(prop.getProperty("email"), prop.getProperty("pass"));
		Thread.sleep(3000);
		}
}
