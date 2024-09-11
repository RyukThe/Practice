package LogicalMarch;

public class SwipeTowNumber 
{
public static void main(String[] args)
{
	int num1=10;
	int num2=20;
	int temp;
	System.out.println("With out swap :");
	System.out.println( "Num1- "+num1 +" and "+ "num2 - "+num2);
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("After swap ");
	System.out.println(" num1= "+ num1 + " And "+ "num2 = "+ num2);
}
}
