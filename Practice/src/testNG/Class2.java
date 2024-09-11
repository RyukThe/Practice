package testNG;

import org.testng.annotations.Test;

public class Class2 
{
	@Test(groups="login")
	public void login2()
	{
		System.out.println("login");
	}
	@Test(groups="Home")
	public void home2()
	{
		System.out.println("HomeClass2");
	}
	
	@Test(groups="setting")
	public void setting()
	{
		System.out.println("setting");
	}

}
