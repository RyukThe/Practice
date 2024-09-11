package Logical1;

public class ResersePrimeNumber
{
	public static void main(String[] args)
	{
		String l="I have Completed Software testing course where I learned and practice manual testing, Automation, API testing, Database testing and UNIX.";
		String [] str=l.split(" ");
		
		for(int i=1;i<=str.length-1;i++)
		{
			String word = str[i];
			
			int count=0;
			String rev="";
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;//if number is divisble by any number between 2 and less than that number then counter become1
					break;
				}
				
				
			}
			if(count==0)
			{
				for(int j=word.length()-1;j>=0;j--)
				{
					rev=rev+word.charAt(j);
				}
				System.out.print(rev+" ");
			}
			else
			{
				System.out.print(word+ " ");
			}
		}
		
	}

}
