package FileRealtedOp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleRowSingle {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\daduk\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int rowInd = sh.getLastRowNum();
		for(int i=0;i<=rowInd;i++)
		{
			String vlue = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(vlue);
		}
	}
}
