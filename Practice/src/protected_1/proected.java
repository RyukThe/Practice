package protected_1;

import java.util.Properties;
import java.util.Set;

import Practice_March25.Array;

public abstract class proected extends Array
{

	
	public static void main(String[] args)
	{
			Properties sys = System.getProperties();
			Set<String> sas = sys.stringPropertyNames();
			for( String s:sas)
			{
				System.out.println(s);
			}
		
	}
	
	
	
	
	abstract void main1();
}
