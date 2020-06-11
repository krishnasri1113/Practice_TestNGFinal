package Practice_TestNGFinal;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertSame;

import org.testng.annotations.Test;

public class Login_Assertions {
	
	@Test
	public void Login_01()
	{
		System.out.println("login_01 executed");
		assertEquals(true, true);
		//assertEquals(driver.findelemnet(by.id).isdisplayed(), expected);
		//assertEquals(driver.findelemnet(by.id).gettext(), expected);
		assertEquals(true, true,"Home Screen is not displayed");
		//assertEquals(true, false,"Home Screen is not displayed");
		assertNotSame(true,false, "Home screen is not displyed");
		assertSame(true, true);
	}
	@Test
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
