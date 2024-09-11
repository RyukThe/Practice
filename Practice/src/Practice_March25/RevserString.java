package Practice_March25;

import LogicalMarch.primenumberm;

public class RevserString 
{
	public static void main(String[] args) 
	{
		String s= "Saurav";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.print(s.charAt(i));
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);
	}



}
