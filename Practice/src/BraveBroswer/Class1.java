package BraveBroswer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void m1()
	{

		
		ChromeOptions op=new ChromeOptions();
		op.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver d=new ChromeDriver(op);
	}
}
