package CompareAndPrintUnMatchedChar;

import java.util.HashSet;

public class Class2
{
	public static void main(String[] args) 
	{
		String s="Hello World";
		String s2="Helom moun";
		
		if(s.equals(s2))
		{
			System.out.println("Both Strings are equal.");
		}
		else
		{
			HashSet<Character> unmatcheds= new HashSet<>();
			HashSet<Character> unmatcheds1=new HashSet<Character>();
			
			for(Character ch:s.toCharArray())
			{
				unmatcheds.add(ch);
			}
			
			for(Character ch:s2.toCharArray())
			{
				unmatcheds1.add(ch);
			}
			
			for(Character ch:s2.toCharArray())
			{
				unmatcheds.remove(ch);
			}
			for(Character ch:s.toCharArray())
			{
				unmatcheds1.remove(ch);
			}
			
			System.out.println("Unmatched Character in String s1 :" + unmatcheds);
			System.out.println("Unmacthed Character in String s2 : " + unmatcheds1);
			
		}
		
	}

}
