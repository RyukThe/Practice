package April24;

public class Factorial {

	
	public static void main(String[] args) {
		
		int a=3;
		
		int fact=1;
		
		//3=3*2*1
		//5=5*4*3*2*1
		for(int i=a;i>=1;i--)
		{
			fact=i*fact;
		}
		
		System.out.println(fact);
	}
}
