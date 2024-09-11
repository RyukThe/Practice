package Collection;

public class Fibonacci 
{
	public static void main(String[] args) {
		int prv=0;
		int next=1;
		for(int i=1;i<=10;i++)
		{
			System.out.print(prv+ " ");
			int sum=prv+next;
			prv=next;
			next=sum;
			
		}
	}

}
