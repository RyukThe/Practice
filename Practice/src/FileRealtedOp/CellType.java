package FileRealtedOp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellType {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f= new FileInputStream("C:\\Users\\daduk\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	
Sheet sh = WorkbookFactory.create(f).getSheet("Sheet2");
			
	int ri = sh.getLastRowNum();
	
	try {
	for(int i=0;i<=ri;i++)
	{
		int ci = sh.getRow(i).getLastCellNum();
		for(int j=0;j<=ci-1;j++)
		{
			Cell c = sh.getRow(i).getCell(j);
			
			org.apache.poi.ss.usermodel.CellType ct = c.getCellType();
			
			if(ct==org.apache.poi.ss.usermodel.CellType.NUMERIC)
			{
				System.out.print(c.getNumericCellValue()+ " | ");
			}
			else if(ct==org.apache.poi.ss.usermodel.CellType.STRING)
			{
				System.out.print(c.getStringCellValue()+ " | ");
			}
			else if( ct==org.apache.poi.ss.usermodel.CellType.BOOLEAN)
			{
				System.out.print(c.getBooleanCellValue() + " | ");
			}
			
			
		}
		System.out.println("");
	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	
	System.out.println("hello");
	}
	
}
