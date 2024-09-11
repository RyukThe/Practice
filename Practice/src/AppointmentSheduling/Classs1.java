package AppointmentSheduling;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Classs1 
{
	public static void main(String[] args) throws InterruptedException {
	 
	WebDriver m= new FirefoxDriver();
		m.get("https://demo.openemr.io/openemr/interface/login/login.php?site=default");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.manage().window().maximize();
		m.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("receptionist");
		m.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("receptionist");
		m.findElement(By.xpath("//button[text()='Login']")).click();
		m.switchTo().frame("cal");
		m.findElement(By.xpath("//table[@class='table table-sm table-borderless']/tbody/tr/td[2]")).click();
		String month=new SimpleDateFormat("MMMM").format(new java.util.Date());
		String date=new SimpleDateFormat("dd").format(new java.util.Date());
		String time=new SimpleDateFormat("HH:mm").format(new java.util.Date());

		List<WebElement> moths = m.findElements(By.xpath("//div[@id='monthPicker']/table//tr"));
		for(WebElement moth:moths)
		{
			String ma = moth.getText();
			System.out.println(ma);
			if(ma.contains(month))
			{
				System.out.println(ma);
				moth.click();
				break;
			}
		}
		
		m.switchTo().defaultContent();
		m.switchTo().frame("cal");
		Thread.sleep(2000);
		
	
		 List<WebElement> dates = m.findElements(By.xpath("//table[@class='table table-sm table-borderless']//tr[position() >= 3 and position() <= 7]//td"));
	
		 for(WebElement d:dates)
		 {
			String date1 = d.getText();
			if(date1.equals(date))
			{
				d.click();
				break;
			}
		 }
		 
		 
		
			
		 List<WebElement> dates1 = m.findElements(By.xpath("//table[@class='table']//tr"));
			
		 for(WebElement d:dates1)
		 {
			 String time1 = d.getText();
			
			
			 if(time1.equals(time))
				{
					 d.click();
					 break;
				 }
			
			
		 }
	}
	

	
	
}
