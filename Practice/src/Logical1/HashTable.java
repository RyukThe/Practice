package Logical1;

import java.util.Hashtable;
import java.util.Set;

public class HashTable
{

	public static void main(String[] args)
	{
		Hashtable<String, Integer> table=new Hashtable<>();
		table.put("Saurav", 45);
		table.put("kas",47);
		
		Set<String> keys = table.keySet();
		for(String k:keys)
		{
			System.out.println(k+ ": "+ table.get(k));
		}
		
	}
}
