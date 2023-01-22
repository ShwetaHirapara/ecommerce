package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class youtube {
	static WebDriver driver;
	public static void main(String[] args) throws FindFailed {
		
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Screen s= new Screen();
		s.find("pause.png");
		s.click("pause.png");
		System.out.println("pause button clicked");
		
		
		
		
		
		
	}

}
