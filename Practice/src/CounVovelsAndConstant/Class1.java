package CounVovelsAndConstant;

public class Class1 
{
	public static void main(String[] args) 
	{
		String s="My name is saurav kastaure";
		
		
		String sl = s.toLowerCase();
		int countv=0,countc=0;
		
		for(int i=0;i<=sl.length()-1;i++)
		{
			char ch = sl.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u')
			{
				countv++;
			}
			else if(ch>='a' && ch<='z')
			{
				countc++;
			}
			
			
		}
		
		System.out.println("vowels "+ countv);
		System.out.println("constant"+ countc);
		
	}

}
