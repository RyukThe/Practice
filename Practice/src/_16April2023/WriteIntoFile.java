package _16April2023;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteIntoFile 
{
	@Test
	public void writeIntoExcel() throws IOException
	{
		try {
		Workbook  work=new XSSFWorkbook();
		Sheet sh = work.createSheet("Test Data");
		Row row = sh.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Hello its test data");
		
		File file= new File("D:\\test-data02.xlsx");
		FileOutputStream out= new FileOutputStream(file);
		work.write(out);
		out.close();
		work.close();
		System.out.println("write into   file");
		}
		catch(Exception e)
		{
			System.out.println("error occur");
			e.printStackTrace();
			
		}
	
	}

}
