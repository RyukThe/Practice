package Practice_March25;

import java.util.Scanner;

public class MultiDiamensionArray 
{
	public static void main(String[] args) {
		String [] [] [] ar= new String [2] [4] [3];
		Scanner sc= new  Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<2;k++)
				{
				System.out.print("Enter number");
				ar[i][j] [k]=sc.next();
			}
		}
		
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				
				for(int k=0;k<2;k++)
				{
					System.out.print(ar[i] [j] [k ]+ " | ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
