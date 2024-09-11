package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectlistBox 
{
	public static void main(String[] args) {
		
		WebDriver d= new FirefoxDriver();
		d.get("file:///D:/multiselectlistbox.html");
		
		WebElement list = d.findElement(By.xpath("//select[@id='1234']"));
	
	Select s= new Select(list);
	System.out.println(s.isMultiple());
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	
	System.out.println(s.getFirstSelectedOption().getText());
	for(WebElement option:s.getOptions())
	{
		System.out.println(option.getText());
	}
	
	
	
	
	}

}
