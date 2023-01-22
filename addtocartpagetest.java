package com.ecommerce.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ecommerce.base.Baseclass;
import com.ecommerce.pageobjects.AddTocartpage;
import com.ecommerce.pageobjects.Loginpage;
import com.ecommerce.pageobjects.homepage;

public class addtocartpagetest extends Baseclass {
	AddTocartpage addtocartpage=new AddTocartpage();
	@Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
		public void setup() {
			launchApp();
		}
		@AfterMethod(groups= {"Smoke","Sanity","Regression"})
		public void teaddown() {
			driver.quit();
		}
		@Test(groups= {"Regression","Sanity"})
		public void addtocarttest() throws InterruptedException  {
			Loginpage loginpage=new Loginpage();
			AddTocartpage addtocartpage =new AddTocartpage();
			loginpage.emailform(prop.getProperty("email"), prop.getProperty("pass"));
			Thread.sleep(3000);
			addtocartpage.addtocart();
			
			}
	}
