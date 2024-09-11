package CompareAndPrintUnMatchedChar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time
{

	public static void main(String[] args) 
	{
		String m= new SimpleDateFormat("MMMM").format(new Date());
		System.out.println(m);
		
	}


}
