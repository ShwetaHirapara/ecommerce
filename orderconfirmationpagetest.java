package com.ecommerce.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.base.Baseclass;
import com.ecommerce.pageobjects.AddTocartpage;
import com.ecommerce.pageobjects.Loginpage;
import com.ecommerce.pageobjects.orderconfirmationpage;

public class orderconfirmationpagetest extends Baseclass {
		Loginpage loginpage;
		AddTocartpage addtocartpage;
		orderconfirmationpage orderconfirmpage;
		
		@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
			public void setup() {
				launchApp();
			}
			@AfterMethod(groups= {"Smoke","Sanity","Regression"})
			public void teaddown() {
				driver.quit();
			}
			@Test(groups = "Regression")
			public void logintest() throws InterruptedException  {
				Loginpage loginpage=new Loginpage();
				loginpage.emailform(prop.getProperty("email"), prop.getProperty("pass"));
				AddTocartpage addtocartpage =new AddTocartpage();
				orderconfirmationpage orderconfirmpage=new orderconfirmationpage();
				Thread.sleep(3000);
				addtocartpage.addtocart();
				Thread.sleep(3000);

				orderconfirmpage.checkoutcart();
				
				}
		}

