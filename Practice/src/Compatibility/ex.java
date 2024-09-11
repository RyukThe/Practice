package Compatibility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();

		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new  ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(3000);
		
		
	driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
	Thread.sleep(2000);
		//Select s1=new Select(w1);
		//s1.selectByVisibleText("Admin");
	List<WebElement> opt = driver.findElements(By.xpath("//div[@role='option']"));
	String role="Admin";
	for(WebElement s:opt)
	{
		if(role.equals(s.getText()))
		{
			s.click();
			break;
		}
	}
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("a");
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.xpath("//div[@role='option']"));
	for(int i=0;i<=list.size()-1;)
	{
		list.get(i).click();
		break;
	}
	
	
/*	String	st= "Peter Mac Anderson";
 
 for(WebElement option:lis)
 {
	 String str = option.getText();

	if(st.equals(str))
	{
		option.click();
	}
 }
	*/
		
		
//	Actions at= new Actions(driver);
//	at.click(lis).perform();
//	at.sendKeys(Keys.ARROW_DOWN).perform();
//	at.sendKeys(Keys.ENTER).perform();
//	
		
		
	
	}
	
	public static void act(WebDriver driver, int n, WebElement w)
	{
		Actions a1=new Actions(driver);
		a1.click(w).perform();
		a1.sendKeys(Keys.HOME);
		for(int i=0;i<=n;i++)
		{
			a1.sendKeys(Keys.ARROW_DOWN).perform();;
			a1.sendKeys(Keys.ENTER).perform();
		}
	}

	public static void act(WebDriver driver, int n, WebElement eml,String empname)
	{
		Actions a1=new Actions(driver);
		a1.click(eml).perform();
		a1.sendKeys(empname);
		a1.sendKeys(Keys.HOME);
		for(int i=0;i<=n;i++)
		{
			a1.sendKeys(Keys.ARROW_DOWN).perform();;
			a1.sendKeys(Keys.ENTER).perform();
		}
	}

}
