package Practice_TestNGFinal;


import org.testng.annotations.Test;

public class TC_Login_Group {
	@Test(groups = "sanity")
	public void Login_01()
	{
		System.out.println("login_01 executed");
	}
	@Test(groups={"sanity","regression"})
	public void Login_02()
	{
		System.out.println("login_02 executed");
	}
	@Test(groups="regression")
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
