package CompareAndPrintUnMatchedChar;

public class Class2m
{
	public static void main(String[] args) 
	{
		String s1= "Hello world";
		String s2="Hwllo kmOl";
		
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(s2.indexOf(ch) == -1)
			{
				System.out.println("Unmatched Char in s1 :" + ch);
			}
			
		}
		
		
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(s1.indexOf(ch)==-1)
			{
				System.out.println("unmatched char  in s2 :"+ ch);
			}
		}
		
	}

}
