package Practice_March25;

public class Class1Multiplication 
{
	public static void main(String[] args) 
	{
		int num=125;
		int num2=25;
		
		/*
		 * 125
		 * X 25
		 * ----------
		 * 	 625
		 *     0
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int c=num2%10;
		int mul1=num*c;
		int d=(num2/10)*10;
		int mul2=num*d;
		int total=mul1+mul2;
	System.out.printf("  %d\n X %d\n ---------- \n    %d \n +  %d\n ---------- \n     %d\n",num,num2, mul1,mul2,total);
		
		
		
		

		
	
		
	
		
		
		
		
		
		
		
		
	}

}
