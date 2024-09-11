package CompareAndPrintUnMatchedChar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium
{
	public static void main(String[] args)
	{
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-popup-blocking");
		WebDriver m= new ChromeDriver(op);

		m.get("https://www.google.com/");
		
	}

}
