package _16April2023;

import java.net.HttpURLConnection;
import java.net.URL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class bROKENlIN {
	
	@Test
	public void brokenlinks()
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		for (WebElement webElement : alllinks) 
		{
			String url = webElement.getAttribute("href");
			
			TestUrl(url);
		}
		
	
	
	}

	
	public void TestUrl(String Url)
	{
		
		

		
		
		try {
			
			URL url=new URL(Url);
			HttpURLConnection ht=(HttpURLConnection)url.openConnection();
			ht.connect();
			if(ht.getResponseCode()>=400)
			{
				System.out.println(Url+ "broken link"+ht.getResponseMessage());

			}
			
			else
			{
				System.out.println(Url+ "workin fine");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
}
