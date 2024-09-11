package Compatibility;

import java.util.Scanner;

public class SchoolLikeMultiplication
{
	public static void main(String[] args) 
	{
	
		int a=125;
		int b=25;
		
		int c= b%10;
		int mulc=a*c;
		int c2=(b/10)*10;
		int mulc2=a*c2;
		int FianlAnswer=mulc+mulc2;
	
		/*System.out.println(" "+a);
		System.out.println(" X "+ b);
		System.out.println(" --------");
		System.out.println("    " +mulc);
		System.out.println(" + "+ mulc2);
		System.out.println(" --------");
		System.out.println("   "+FianlAnswer);
		*/
		System.out.printf(" %d\n X%d\n--------\n   %d \n+ %d\n-------- \n  %d",a,b,mulc,mulc2,FianlAnswer);
		
		
	}
		}
