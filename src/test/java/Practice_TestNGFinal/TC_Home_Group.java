package Practice_TestNGFinal;


import org.testng.annotations.Test;

public class TC_Home_Group {
	@Test(groups="sanity")
	public void Home_01()
	{
		System.out.println("home_01 executed");
	}
	@Test(groups="regression")
	public void Home_02()
	{
		System.out.println("home_02 executed");
	}

}
