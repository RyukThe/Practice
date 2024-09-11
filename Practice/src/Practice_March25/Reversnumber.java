package Practice_March25;

public class Reversnumber
{
	public static void main(String[] args)
	{
		int k= 578124457;
		int rev=0;
		for(int i=k;i>0;i=i/10)
		{
			int rem= i%10;
			rev= rev*10+rem;
		}
		
		System.out.println(rev);
		
	}

}
