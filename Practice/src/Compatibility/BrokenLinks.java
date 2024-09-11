package Compatibility;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrokenLinks 
{



	public static void main(String[] args) 
	{
		FirefoxOptions m1= new FirefoxOptions();
		m1.addArguments("--disable-popup-blocking");
		m1.addArguments("--headless");
		WebDriver m = new FirefoxDriver(m1);
		
		m.get("https://www.amamzon.com/");
		
		List<WebElement> allurl = m.findElements(By.xpath("//a"));
		System.out.println(allurl.size());
		
	try {
		
	
		for(int i=0;i<=allurl.size()-1;i++)
		{
			WebElement url = allurl.get(i);
			String web = url.getAttribute("herf");
			URL u= new URL(web);
			HttpsURLConnection wm= (HttpsURLConnection)u.openConnection();
			wm.connect();
			int rsc = wm.getResponseCode();
			if(rsc>=400)
			{
				System.out.println(url+ " broken link "+ wm.getResponseCode() +"- Responsnse message "+ wm.getResponseMessage());
				
			}
			
		}
	}
		 catch (Exception e) 
		 {
				// TODO: handle exception
			}
		
		
		
		
		
		
		
		
		
		
		

		
		
	}
}
