package Feb23_02_Selenium;

import java.time.Duration;
import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.dynamic.scaffold.FieldRegistry.Compiled;

public class Class2 
{	
	static WebDriver d= new ChromeDriver();
	
	@BeforeTest
	public void m13(
			) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
	}
	
	@Test
	public static void m1()
	{
	
		try {
			d.get("https://www.facebook.com/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean logo = d.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		Assert.assertTrue(logo);
		WebElement create = d.findElement(By.xpath("//a[text()='Create new account']"));
		boolean visible = create.isDisplayed();
		Assert.assertTrue(visible);
		boolean enable = create.isEnabled();

		Assert.assertTrue(enable);
		create.click();
		
		
		
		
	}
	
	@Test(priority = 1, dependsOnMethods = "m1", groups = "Sign Up ")
	public void m2()
	{
		 WebElement firstName = d.findElement(By.xpath("//input[@name='firstname']"));   
		 firstName.click();
		 boolean true1 = firstName.isEnabled();
		
		Assert.assertTrue(true1,"First Name is not enable");
		
		firstName.sendKeys("Saurav");
		WebElement lastname = d.findElement(By.xpath("//input[@name='lastname']"));
		
		boolean enable = lastname.isEnabled();
		lastname.click();
		Assert.assertTrue(enable,"Last Name is not enable");
		lastname.sendKeys("Kasture");
		WebElement email = d.findElement(By.xpath("//input[@name='reg_email__']"));
		
		email.click();
		boolean visible = email.isDisplayed();
		Assert.assertTrue(visible,"Email text box is visible");
		boolean enable1 = email.isEnabled();
		Assert.assertTrue(enable1,"email is enable");
		email.sendKeys("Sauravkasture@gmail.com");
		
		WebElement password = d.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.click();
		password.sendKeys("0000455112");
		
		
		WebElement day = d.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = d.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s= new Select(day);
		s.selectByIndex(4);
		Actions a= new Actions(d);
		a.moveToElement(month).click().build().perform();
		
		a.sendKeys(Keys.HOME).perform();
		for(int i =0;i<=6;i++)
		{
			a.sendKeys(Keys.ARROW_DOWN).perform();
		}
		a.sendKeys(Keys.ENTER).perform();
		
		WebElement Year = d.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select m=  new Select(Year);
		m.selectByVisibleText("1997");
		SoftAssert as=new SoftAssert();
		
		WebElement FemaleRadio = d.findElement(By.xpath("//input[@value='1']"));
		boolean selected = FemaleRadio.isSelected();
		as.assertTrue(selected,"Female Raddio Button is Not Selected");
		FemaleRadio.click();
		boolean Sel = FemaleRadio.isSelected();
		as.assertTrue(Sel,"Radio button is not selected");
		WebElement male = d.findElement(By.xpath("//input[@value='2']"));
		male.click();
		d.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		
	}

}
