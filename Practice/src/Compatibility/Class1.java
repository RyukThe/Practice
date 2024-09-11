package Compatibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 
{
	@Parameters("BrowserName")
	@Test
	public void m1(String BrowserName)
	{
		if(BrowserName.equals("chrome"))
		{
			WebDriver m= new ChromeDriver();
			m.get("https://www.google.com/");
			
		}
		else if (BrowserName.equals("fireFox"))
		{
			WebDriver m= new FirefoxDriver();
			m.get("https://www.google.com/");
		}
		
	}

}
