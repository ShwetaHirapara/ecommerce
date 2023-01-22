package com.ecommerce.testcase;

	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.ecommerce.actiondriver.action;
	import com.ecommerce.base.Baseclass;
	import com.ecommerce.pageobjects.Loginpage;
	import com.ecommerce.pageobjects.homepage;

	public class myaccountpagetest extends Baseclass {
		Loginpage loginpage;
		homepage Myaccpage;
		
		@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
		public void setup() {
			launchApp();
		}
		@AfterMethod(groups= {"Smoke","Sanity","Regression"})
		public void teaddown() {
			driver.quit();
		}
		
		@Test
		public void accountpage() throws InterruptedException   {
		Loginpage loginpage=new Loginpage();
		loginpage.emailform(prop.getProperty("email"), prop.getProperty("pass"));
		homepage Myaccpage=new homepage();
		Myaccpage.validateloggedInname();
		Myaccpage.validateorderhistory();
		Thread.sleep(4000);	
			
			}
	}

