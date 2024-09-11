package OpenNewWindowAndTab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Class1 
{
	@Test
	public static void m1()
	{
		ChromeOptions op= new ChromeOptions();
		// op.addArguments("--headless");
		 op.addArguments("--disable-popup-blocking");
		 WebDriver m=new ChromeDriver(op);
		
		 m.get("https://www.google.com/");
		
		 m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		 m.switchTo().newWindow(WindowType.TAB);
		 m.get("https://www.google.com/");
	}

}
