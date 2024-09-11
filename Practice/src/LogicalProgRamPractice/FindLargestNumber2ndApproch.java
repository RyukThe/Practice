package LogicalProgRamPractice;

import java.util.Scanner;

public class FindLargestNumber2ndApproch 
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		System.out.print("Enter Third Number : ");
		int c=sc.nextInt();
	
		
		int largest=a>b?a:b;
		largest=c>largest?c:largest;
		
		System.out.println(largest +" is largest number");
		
		
		
		int largestnumber=c>(a>b?a:b)?c:(a>b?a:b);
	
	System.out.println(largestnumber);
	}

	
	
}
