package com.ecommerce.actiondriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.base.Baseclass;


public class action extends Baseclass {
	public static void scrollByVisibilityOfElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
	}
public static boolean selectByIndex(WebElement ele,int index) {
	boolean flag=false;
	try {
		Select s =new Select(ele);
		s.selectByIndex(index);
		flag=true;
	}catch(Exception e) {
		return false;
	}finally {
		if(flag) {
			System.out.println("option selected by index");
		}else {
			System.out.println("option not selected by index");
		}
	}
	return flag;
}
public static boolean selectByValue(WebElement ele,String value) {
	boolean flag=false;
	try {
		Select s =new Select(ele);
		s.selectByValue(value);
		flag=true;
		return true;
	}catch(Exception e) {
		return false;
	}finally {
		if(flag) {
			System.out.println("option selected by value");
		}else {
			System.out.println("option not selected by value");
		}
	}
}
public static boolean selectByVisibleText(String visibleText,WebElement ele) {
	boolean flag=false;
	try {
		Select s =new Select(ele);
		s.selectByVisibleText(visibleText);
		flag=true;
		return true;
	}catch(Exception e) {
		return false;
	}finally {
		if(flag) {
			System.out.println("option selected by visibleText");
		}else {
			System.out.println("option not selected by visibleText");
		}
	}
}
public static boolean mouseHoverByJavascript(WebElement locator) {
	boolean flag = false;
	try {
		WebElement mo=locator;
		String javaScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent('mouseover', true, false)"
				+"arguments[0].dispatchEvent(evObj)";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(javaScript, mo);
		flag=true;
		return true;
	}
	catch (Exception e) {
	return false;
	}finally {
		if(flag) {
			System.out.println("mousehover action is performed");
		}else {
			System.out.println("mousehover action is not performed");
		}
	}
		}

public static void click(WebDriver ldriver,  WebElement locatorName) {
	Actions act= new Actions(ldriver);
	act.moveToElement(locatorName).click().build().perform();
}
public static boolean JSClick(WebDriver driver,WebElement ele) throws Exception {
	boolean flag=false;
	try {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		flag=true;
	} catch(Exception e) {
		throw e;
	}finally {
		if(flag) {
			System.out.println("click action is performed");
		}else if (!flag) {
			System.out.println("click action is not performed");
		}
	}return flag;
}
public static boolean switchToFrameByIndex(int Index) {
	boolean flag=false;
	try {
		new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(null));
		driver.switchTo().frame(Index);
		flag=true;
		return true;
	}catch(Exception e){
		return false;
	}finally {
		if(flag) {
			System.out.println("Frame with index "+ Index + "is selected");
	}else {
		System.out.println("Frame with index " + Index + "is not selected");
	}
	}
}
public static boolean switchToFrameByName(String nameValue) {
	boolean flag=false;
	try {
		new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(null));
		driver.switchTo().frame(nameValue);
		flag=true;
		return true;
	}catch(Exception e){
		return false;
	}finally {
		if(flag) {
			System.out.println("Frame with index "+ nameValue + "is selected");
	}else {
		System.out.println("Frame with index " + nameValue + "is not selected");
	}
	}
}
public static boolean switchToDefaultFrame() {
	boolean flag=false;
	try {
		driver.switchTo().defaultContent();
		flag=true;
		return true;
	}catch(Exception e){
		e.printStackTrace();
		return false;
	}finally {
		if(flag) {
			System.out.println("success");
		}else {
			System.out.println("not success");
		}
	}
}
public static boolean findElement (WebDriver ldriver,WebElement ele) {
	boolean flag = false;
	try {
		ele.isDisplayed();
		flag = true;
	}catch(Exception e) {
		flag= false;
	} finally {
		if(flag) {
			System.out.println("successfully found element");
		}else {
			System.out.println("unable to locate element");
		}
	}		
		return flag;
	}
public static boolean isDisplayed(WebDriver ldriver,WebElement ele) {
	boolean flag=false;
	flag=findElement(ldriver,ele);
	if(flag) {
		flag=ele.isDisplayed();
		if(flag) {
			System.out.println("element is displayed");
		}else {
			System.out.println("element is not displayed");
		}
	}else {
			System.out.println("not displayed");	
			}
		return flag;
}
public static boolean isSelected(WebDriver ldriver,WebElement ele) {
	boolean flag=false;
	flag=findElement(ldriver,ele);
	if(flag) {
		flag=ele.isSelected();
		if(flag) {
			System.out.println("element is selected");
		}else {
			System.out.println("element is not selected");
		}
	}else {
			System.out.println("not selected");	
			}
		return flag;
	}
public static boolean isEnabled(WebDriver ldriver,WebElement ele) {
	boolean flag=false;
	flag=findElement(ldriver,ele);
	if(flag) {
		flag=ele.isEnabled();
		if(flag) {
			System.out.println("element is enabled");
		}else {
			System.out.println("element is not enabled");
		}
	}else {
			System.out.println("not enabled");	
			}
		return flag;
	}
public static boolean type(WebElement ele,String text) {
		boolean flag= false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag=true;
		}catch(Exception e) {
			System.out.println("location not found");
			flag=false;
		}finally {
			if(flag) {
				System.out.println("successfully entered value");
			}else{
				System.out.println("unable to enter value");
			}
		}
		return flag;			
	}
public static void mouseOverElement(WebElement element) {
	boolean flag=false;
	try {
		new Actions(driver).moveToElement(element).build().perform();
		flag=true;
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(flag) {
			System.out.println("Mouseover Action is performed on");
		}else {
			System.out.println("Mouseover Action is not performed on");
		}
	}
}
public static boolean switchToFrameByID(String idValue) {
	boolean flag=false;
	try {
		//new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(null));
		driver.switchTo().frame(idValue);
		flag=true;
		return true;
	}catch(Exception e){
		return false;
	}finally {
		if(flag) {
			System.out.println("Frame with id "+ idValue + "is selected");
	}else {
		System.out.println("Frame with id " + idValue + "is not selected");
	}
	}
}
public static boolean selectBySendkeys(WebElement ele,String value) {
			boolean flag=false;
			try {
				ele.sendKeys(value);
				flag=true;
				return true;
			}catch (Exception e) {
				return false;
				}finally {
					if(flag) {
						System.out.println("select value from dropdown");
					}else {
						System.out.println("not selected value from dropdown");
					}	
					}				
}}