package Feb23_02_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class1 
{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("SauravKasture@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Saurav@shdsjd");
		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		if(logo==true)
		{
			System.out.println("logo is present ");
		}
		else
		{
			System.out.println("Logo is noy present ");
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
