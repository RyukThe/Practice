package WebTable;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class1 
{
	@Test
	public void webTable() throws MalformedURLException
	{
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver m= new ChromeDriver(op);
		m.get("https://www.naukri.com/");
		List<WebElement> url = m.findElements(By.xpath("//a"));
	
		m.switchTo().newWindow(WindowType.TAB);
		m.get("https://www.facebook.com/");
	
	
		for(WebElement link: url)
		{
			if(!link.isDisplayed())
			{
				String str = link.getAttribute("href");
				System.out.println("hidden  link found" + str);
				
			}
		}
		
		for(WebElement link:url)
		{
			String Url = link.getAttribute("href");
			url(Url);
		
		}
		
		
		
	
	}
	
	
	public ArrayList<String> url(String url) throws MalformedURLException
	{
		ArrayList<String> brokenlink= new ArrayList<>();
		try
		{
			URL l= new URL(url);
			HttpURLConnection link=(HttpURLConnection) l.openConnection();
			link.connect();
			if(link.getResponseCode()>=400)
			{
				System.out.println(url);
				brokenlink.add(url);
				
			}
			else
			{
				System.out.println(url);
				
			}
		
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return brokenlink;
	}

}
