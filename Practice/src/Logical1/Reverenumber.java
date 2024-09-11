package Logical1;

public class Reverenumber
{
	public static void main(String[] args) 
	{
		int k=85547454;
		String str = Integer.toString(k);
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	
		
		int revNum = Integer.parseInt(rev);
		System.out.println(revNum);
		
		
		
		
		
		
		
		
		int l=23641575;
		String strn=Integer.toString(l);
		String rev2="";
		for(int i=strn.length()-1;i>=0;i--)
		{
			rev2=rev2+strn.charAt(i);
		}
		
		int Revn2 = Integer.parseInt(rev2);
		System.out.println(Revn2);
		
	
		
		
		int sum=0;
		for(int i=l;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum*10+rem;
		}
		System.out.println();
		
		
		
	int ka=4578454;
	int sum1=0;
	for(int i=ka;i>0;i=i/10)
	{
		int rem=i%10;
		sum1=sum1*10+rem;
	}
	System.out.println(sum1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
