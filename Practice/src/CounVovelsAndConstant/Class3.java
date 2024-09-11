package CounVovelsAndConstant;

public class Class3 
{
	public static void main(String[] args)
	{
		String s="Myname@4512";
		int incount=0;
		int chcount=0;
		int spcount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				incount++;
			}
			else if(Character.isAlphabetic(ch))
			{
				chcount++;
			}
			else
			{
				spcount++;
			}
			
		}
		
		
		System.out.println("special Character : "+ spcount);
		System.out.println("letter : "+ chcount);
		System.out.println("digit : "+ incount);
	}

}
