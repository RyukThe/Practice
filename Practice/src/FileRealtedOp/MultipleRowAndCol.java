package FileRealtedOp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleRowAndCol {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f= new FileInputStream("C:\\Users\\daduk\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		Sheet s = WorkbookFactory.create(f).getSheet("Sheet1");
	
		int row = s.getLastRowNum();
	
		for(int i=0;i<=row;i++)
		{
			 int celid = s.getRow(i).getLastCellNum();
			for(int j=0;j<=celid-1;j++)
			{
				System.out.print(s.getRow(i).getCell(j).getStringCellValue()+ " | ");
			}
			System.out.println();
		}
		
	}
}
