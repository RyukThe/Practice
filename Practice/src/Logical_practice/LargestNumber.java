package Logical_practice;

import java.util.Scanner;

public class LargestNumber {

	
	public static void main(String[] args) {
	
		/*
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd number");
	int b = sc.nextInt();
	System.out.println("Enter 3rd number");
	int c = sc.nextInt();
	
	if(a>b && a>c)
	{
		System.out.println(a  + " is largest number");
	}
	else if(b>a  &&  c>a)
	{
		System.out.println(b + " is largest number");
	}
	else if(c>a && c>b)
	{
		System.out.println(c  + " is largest number");
	}
	
	*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number ");
		int c = sc.nextInt();
		
		
	/*	int largest=a>b?a:b;
		 largest=largest>c?largest:c;
		
		System.out.println(largest);
		*/
		
		/*int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest);*/
		
		
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest);
	}
}
