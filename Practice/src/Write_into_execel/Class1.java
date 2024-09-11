package Write_into_execel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;import org.apache.xml.security.stax.impl.util.ReplaceableOuputStream;

public class Class1 
{
	public static void main(String[] args) throws IOException 
	{
		try {
		// this will create work book 
		Workbook work= new XSSFWorkbook();	//xml spreadsheet format 

		//give name to sheet 
		Sheet sheet = work.createSheet("Test Data");
		//create first row
		Row r = sheet.createRow(0);
		//create first cell
		Cell cell = r.createCell(0);
		//this will set value in that cell
		cell.setCellValue("Hello its sample test data");
	
	
		//create new file in c drive
		File file= new File("D:/new1-excel-file.xlsx");

			//WRITE TO data in excel file 
		FileOutputStream out= new FileOutputStream(file);
		
		work.write(out);
		out.close();
		
		System.out.println("data writen ");
	
	}
		catch (Exception e)
		{
			System.out.println(" An error occured");
			e.printStackTrace();
		}
		
		FileInputStream file = new FileInputStream("D:/new1-excel-file.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Test Data").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}
	
	
		
}
