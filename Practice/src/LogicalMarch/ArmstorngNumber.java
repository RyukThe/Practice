package LogicalMarch;

public class ArmstorngNumber
{
	public static void main(String[] args)
	{
		int num=153;
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem= i%10;
			sum=(rem*rem*rem)+sum;
		}
		if(sum==num)
		{
			System.out.println("number is armstorng ");
		}
		else
		{
			System.out.println("number is not armstorng");
		}
	}

}
