package LogicalProgRamPractice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\daduk\\git\\repository\\Practice\\pro.properties");
		Properties pr=new Properties();
		pr.load(file);
	System.out.println(pr.get("Username"));
	}
}
