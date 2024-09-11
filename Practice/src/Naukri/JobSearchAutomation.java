package Naukri;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
	import java.util.List;

	public class JobSearchAutomation {

	    public static void main(String[] args) throws InterruptedException {

	        // Set up Chrome driver
	    	ChromeOptions op= new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(op);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	        // Navigate to job portal
	        driver.get("https://www.naukri.com/");

	        // Enter search criteria
	        
	        driver.findElement(By.xpath("//a[text()='Login']")).click();
	       driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vidyanandsawai17@gmail.com");
	    driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Ram@123");
	    driver.findElement(By.xpath("(//button[@type='submit'])")).click();
	    driver.findElement(By.xpath("//span[text()='Search jobs here']")).click();
	    driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("software testing, Manual testing, Automation Testing, Selenium, Java,");
	      driver.findElement(By.xpath("//div[@class='dropdownMainContainer focus']")).click();
	      driver.findElement(By.xpath("(//div[@class='dropdownMainContainer focus']//span)[5]")).click();
	       driver.findElement(By.xpath("(//input[@class='suggestor-input '])[2]")).sendKeys("Ahmedabad, Pune, Mumbai, ");
	      //Ahmedabad, Pune, Mumbai, 
	       driver.findElement(By.xpath("//span[text()='Search']")).click();
	   

	        // Wait for search results to load
	        Thread.sleep(5000);

	        // Keep track of applied job titles
	        List<String> appliedJobTitles = new ArrayList<>();

	        // Loop through search results
	       // click on job title 
	       List<WebElement> jobTitles = driver.findElements(By.xpath("//div[@class='jobTupleHeader']/div/a"));
	       
	       for(WebElement jobtitle: jobTitles)
	       {
	    	   if(jobtitle.getText().contains("software testing, manual testing, automation testing, QA "))
	    	   {
	    		   jobtitle.click();
	    		   break;
	    	   }
	       }
	       
	       if(driver.findElement(By.xpath("(//button[text()='Apply'])[1]")).getText()=="Apply")
	       {
	    	   driver.findElement(By.xpath("(//button[text()='Apply'])[1]")).click();
	       }
	       else if(driver.findElement(By.xpath("(//button[text()='Apply on company site'])[1]")).getText()=="Apply on company site")
	       {
	    	   driver.close();
	       }
	    }
	}