package FileRealtedOp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromRow {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new FileInputStream("C:\\Users\\daduk\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int rowInd = sh.getLastRowNum();
		System.out.println(rowInd);	
		int ci = sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<=ci-1;i++)
		{
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}
}
