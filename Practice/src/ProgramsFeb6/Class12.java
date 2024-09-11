package ProgramsFeb6;

public class Class12
{
	public static void main(String[] args)
	{
		int sapce=0;
		int star=10;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=sapce;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			sapce++;
			star--;
		}
		
	}

}
