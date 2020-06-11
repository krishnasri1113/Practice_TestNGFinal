package Practice_TestNGFinal;


import org.testng.annotations.Test;

public class Login_DependsonMethods {
	@Test
	public void Login_01() throws Exception
	{
		System.out.println("login_01 executed");
		//throw new Exception("Intentionally");
	}
	@Test(dependsOnMethods ="Login_01")
	public void Login_02()
	{
		System.out.println("login_02 executed");
	}
	@Test
	public void Login_03()
	{
		System.out.println("login_03 executed");
	}
	@Test
	public void Login_04()
	{
		System.out.println("login_04 executed");
	}



}
