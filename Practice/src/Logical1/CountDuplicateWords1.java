package Logical1;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicateWords1
{
	public static void main(String[] args) 
	{
		String k="I have Completed Software testing course where I learned and practice manual testing, Automation, API testing, Database testing and UNIX.";
		String str[] =k.split(" ");
		
		HashMap<String, Integer> lo= new HashMap<>();
		for(int i=0;i<=str.length-1;i++)
		{
			String word = str[i];
			
			if(lo.containsKey(word))
			{
				lo.put(word, lo.get(word)+1);
			}
			else
			{
				lo.put(word, 1);
			}
			
		}
		
		Set<String> sd = lo.keySet();
		
		for(String key:sd)
		{
			System.out.println(key+":"+lo.get(key));
		}
		System.out.println("--------------------------------------------");
		
		for(String key:sd)
		{
			if(lo.get(key)>1)
			{
				System.out.println(key+ " :"+ lo.get(key));
			}
		}
	}

}
