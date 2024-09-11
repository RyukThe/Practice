package LogicalMarch;

import java.util.HashMap;
import java.util.Set;

public class Star1 
{
	public static void main(String[] args) 
	{
		String s =" https://testingjob.in/sensia-careers-drive-software-qa-engineer-pune-march/";
		
		
		HashMap<Character, Integer> mp= new HashMap<Character, Integer>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char chart = s.charAt(i);
			
			if(mp.containsKey(chart))
			{
				mp.put(chart, mp.get(chart)+1);
			}
			else
			{
				mp.put(chart, 1);
			}
			
			
			
		}
		
		Set<Character> keys = mp.keySet();
		
		for(Character key: keys)
		{
			System.out.println(key+ ": "+ mp.get(key));
		}
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		for(Character key: keys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+ ":" +mp.get(key));
			}
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 

		
	}

}
