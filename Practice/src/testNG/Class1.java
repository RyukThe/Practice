package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1
{
	
	
	@Test(groups = "login")
	public void login() 
	{
		System.out.println("login ");
		
	}
	
	@Test(groups="Home")
	public void homepage()
	{
		System.out.println("Home page ");
	}
	
	@Test(groups="setting")
	public void setting()
	{
		System.out.println("Setting");
	}

}
