package StarPattern;

public class Class1 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println("*");
		}
		
		
		for (int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int star=1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
		}
		
		int star2=10;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star2--;
		}
		
		int space=0;
		int star3=10;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star3;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star3--;
		}
		
		
		
		int space1=5;
				int star4=1;
				for(int i=1;i<=6;i++)
				{
					for(int j=1;j<=space1;j++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=star4;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					space1--;
					star4++;
				}
		
				int star6=1;
				int space6=7;
				for(int i=1;i<=7;i++)
				{
					for(int j=1;j<=space6;j++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=star6;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					star6=star6+2;
					space6--;
				}
	}

}
