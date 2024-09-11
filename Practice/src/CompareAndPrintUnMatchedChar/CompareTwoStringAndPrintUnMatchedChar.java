package CompareAndPrintUnMatchedChar;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoStringAndPrintUnMatchedChar 
{
	public static void main(String[] args)
	{
		String s1="Hello world";
		String s2="Hello Wxmk";
		
		
	
		if(s1.equals(s2))
				{
			System.out.println("Strings are equal ");
		}
		else
		{
			Set<Character>unmatcheds1= new HashSet<>();
			Set<Character> unmatcheds2=new HashSet<Character>();
			
			for(Character c:s1.toCharArray())
			{
				unmatcheds1.add(c);
			}
			
			for(Character c:s2.toCharArray())
			{
				unmatcheds2.add(c);
			}
			
			//remove all char which are s2
			for(Character c: s2.toCharArray())
			{
				unmatcheds1.remove(c);
			}
			
			//remove all char which are s1
			for(Character  c: s1.toCharArray())
			{
				unmatcheds2.remove(c);
			}
			
			System.out.println("Print unmatched Character in s1 : " +unmatcheds1.toString());
			System.out.println("Print Unmatched Character in s2 : "+ unmatcheds2.toString());
		}
	}

}
