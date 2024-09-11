package Practice_March25;

public class Hello1Im  implements Hello
{

	@Override
	public void m1() {
		System.out.println("Ruuning m1");
		
	}

	@Override
	public void m2() {
	System.out.println("Running m2");
		
	}

	@Override
	public void m3() {
		System.out.println("Ruuning method m2");
		
	}

	public static void main(String[] args) 
	{
		Hello1Im m= new Hello1Im();
		m.m1();
		m.m2();
		m.m3();
	}
}
