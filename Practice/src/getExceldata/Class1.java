package getExceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("F:\\Excel\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int row = sh.getLastRowNum();
		
		for(int i=0;i<=row;i++)
		{
			int ci = sh.getRow(i).getLastCellNum();
			for(int j=0;j<=ci-1;j++)
			{
				String data = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data +" ");
			}
			System.out.println();
		}
	}

}
