package Write_into_execel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTableData
{
	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver          ();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		try {
			Workbook work= new XSSFWorkbook();
			Sheet sh = work.createSheet("table - data");
			WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
			List<WebElement> rows = table.findElements(By.xpath("//tr"));
			int rowsi=rows.size();
			int col= rows.get(0).findElements(By.xpath("//th")).size();
			
			for(int i=0;i<rowsi;i++)
			{
				Row row = sh.createRow(i);
				 List<WebElement> data = rows.get(i).findElements(By.xpath("td"));
			
			for(int j=0;i<col-1;i++)
			{
				 Cell cell = row.createCell(j);
				 if(i==0)
				 {
					 cell.setCellValue(data.get(j).findElement(By.tagName("th")).getText());
				 }
				 else
				 {
					 cell.setCellValue(data.get(j).getText());
				 }
				 System.out.print(cell.getStringCellValue() +" \t");
			}
			}
		
		File file = new File("D:/newtabledata.xlsx");
		FileOutputStream out= new FileOutputStream(file);
		work.write(out);
		out.close();
		work.close();
		System.out.println("Data write successfully ");
		}
		catch (Exception e)
		{
			System.out.println("system oocur ");
			e.printStackTrace();
		}

		
		
}
}
