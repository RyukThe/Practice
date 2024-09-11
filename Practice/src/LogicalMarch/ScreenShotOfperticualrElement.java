package LogicalMarch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfperticualrElement
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement loginbox = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		File src = loginbox.getScreenshotAs(OutputType.FILE);
		File des= new File("F:\\ScreenShotsel\\loginbox.png");
		FileHandler.copy(src, des);
		
		
		
	}

}
