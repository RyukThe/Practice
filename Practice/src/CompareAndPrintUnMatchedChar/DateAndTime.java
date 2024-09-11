package CompareAndPrintUnMatchedChar;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.devtools.v85.debugger.model.Location;

public class DateAndTime
{
	public static void main(String[] args)
	{
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
		
		LocalDateTime tem= LocalDateTime.now();
		System.out.println(dtf.format(tem));
	
	
		LocalDate date= LocalDate.now();

		

		System.out.println(date);
		
	}

	

}
