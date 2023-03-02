package Compatibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 
{
	@Parameters("BrowserName")
	@Test
	public void m1(String BrowserName)
	{
		if(BrowserName.equals("Chrome"))
		{
			WebDriver m= new ChromeDriver();
			m.get("https://www.google.com/");
			
		}
		
	}

}
