package CompareAndPrintUnMatchedChar;

import org.apache.batik.apps.rasterizer.Main;

public class PrintUnMathcedString 
{
	public static void main(String[] args)
	{
		String s="Hello dfc";
		String s1="Halxs gfv";
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(s1.indexOf(ch)==-1)
			{
				System.out.println("Unmatched Charcter in s: "+ ch);
			}
		}
		
		
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(s.indexOf(ch)==-1)
			{
				System.out.println("Unmatched Charcter in s1 : " +ch      );
			}
		}
		
	}

}
