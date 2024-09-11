package CompareAndPrintUnMatchedChar;

import java.util.LinkedHashSet;

public class Class3
{
	public static void main(String[] args) 
	{
		String s1= "My Name Is Saurav";
		String s2="My name is Dadu";
		
		if(s1.equals(s2))
		{
			System.out.println("Both Strings are mathcing ");
		}
		else
		{
			LinkedHashSet<Character> unmatch= new LinkedHashSet<>();
			LinkedHashSet<Character>unmatch2= new LinkedHashSet<Character>();
			
			for(Character ch:s1.toCharArray())
			{
				unmatch.add(ch);
			}
			
			for(Character ch: s2.toCharArray())
			{
				unmatch2.add(ch);
			}
			
			for(Character ch: s1.toCharArray())
			{
				unmatch2.remove(ch);
			}
			
			for(Character ch: s2.toCharArray())
			{
				unmatch.remove(ch);
			}
			
			System.out.println("Unmatch Char in s1: "+ unmatch);
			System.out.println("UnMatch char in s2 :" + unmatch2);
		}
	}

}
