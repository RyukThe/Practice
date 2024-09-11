package CompareAndPrintUnMatchedChar;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUnMathcedChar 
{
	public static void main(String[] args) 
	{
		String s="Hello my name is Saurav ";
		String s2="Helli ym nkjem si Kalurav";
		
		if(s.equals(s2))
		{
			System.out.println("both Strings Are equal  ");
		}
		else
		{
			LinkedHashSet<Character> s1= new LinkedHashSet<Character>();
			LinkedHashSet<Character> ss2 =new LinkedHashSet<Character>();
			
			for(Character ch:s.toCharArray())
			{
				s1.add(ch);
			}
			
			for(Character ch:s2.toCharArray())
			{
				ss2.add(ch);
			}
			
			
			for(Character ch:s.toCharArray())
			{
				ss2.remove(ch);
			}
			
			for(Character ch :s2.toCharArray())
			{
				s1.remove(ch);
			}
			System.out.println(s1);
			System.out.println(ss2);
		}
		
		
		
		
	}

}
