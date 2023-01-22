package com.brokenlink;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecommerce.base.Baseclass;
import com.ecommerce.utilities.Verifybrokenlink;

public class brokenlinktest extends Baseclass {
	WebDriver driver;
	List<WebElement>activelinkimage=new ArrayList<WebElement>();
	
	@BeforeTest
	public void setapp() {
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
	}
	@Test(priority=1)
	public void getLinks() {
		List<WebElement> linkimglist=driver.findElements(By.tagName("a"));
		System.out.println(linkimglist);
		linkimglist.addAll(driver.findElements(By.tagName("img")));
		int total=linkimglist.size();
		System.out.println("total number of links and images"+total);
		
		for(int i=0;i<linkimglist.size();i++) {
			if(linkimglist.get(i).getAttribute("href")!=null&&(!linkimglist.get(i).getAttribute("href").contains("javascript"))) {
				activelinkimage.add(linkimglist.get(i));
			}
		}
		int total1=activelinkimage.size();
		System.out.println("total active links and images"+total1);
	}
	@Test(priority=2)
	public void verifybrokenlinks() {
		Verifybrokenlink obj=new Verifybrokenlink();
		for(int j=0;j<activelinkimage.size();j++) {
			WebElement ele=activelinkimage.get(j);
			String url=ele.getAttribute("href");
			obj.verfiybrokenlinks(url);
		}
		System.err.println("total valid links"+obj.validlink);
		System.err.println("total valid links"+obj.invalidlink);
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	}
