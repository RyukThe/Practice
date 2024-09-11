package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 
{
	@Parameters("BrowserName")
	@Test
	public void openBroswer(String BrowserName)
	{
		WebDriver m= null;
		if(BrowserName.equals("chrome"))
		{
			ChromeOptions op= new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			op.addArguments("–-disable-notifications");
			m=new ChromeDriver(op);
			m.get("https://www.google.com/");
		}
		else if(BrowserName.equals("firefox"))
		{
			m= new FirefoxDriver();
			m.get("https://www.google.com/");
		}
		else if(BrowserName.equals("edge"))
		{
			m= new EdgeDriver();
			m.get("https://www.google.com/");
		}
		
		
		
	}

}
