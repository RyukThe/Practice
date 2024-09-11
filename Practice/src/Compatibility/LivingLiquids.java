package Compatibility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LivingLiquids 
{
	public static void main(String[] args)
	{
		WebDriver m= new ChromeDriver();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.get("https://livingliquidz.com/");
		m.findElement(By.xpath("(//a[@role='button'])[5]")).click();
		List<WebElement> os = m.findElements(By.xpath("(//div[@class='row g-0'])[2]"));
		
			
		
		for(int i=0;i<=os.size()-1;i++)
		{
			String text = os.get(i).getText();
			
			System.out.println(text.replace("View All", "."));
		
		}
	}
	

}
