package Practice_TestNGFinal;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations1 {
	@BeforeSuite
	public void a1()
	{
		System.out.println("a1 @BeforeSuite");
	}
	@AfterSuite
	public void a2()
	{
		System.out.println("a2 @AfterSuite");
	}
	@BeforeTest
	public void a3()
	{
		System.out.println("a3 @BeforeTest");
	}
	@AfterTest
	public void a4()
	{
		System.out.println("a4 @AfterTest");
	}
	@BeforeClass
	public void a5()
	{
		System.out.println("a5 @BeforeClass ");
	}
	@AfterClass
	public void a6()
	{
		System.out.println("a6 @AfterClass ");
	}
	@BeforeMethod
	public void a7()
	{
		System.out.println("a7 @BeforeMethod ");
	}
	@AfterMethod
	public void a8()
	{
		System.out.println("a8 @AfterMethod");
	}
	@BeforeGroups
	public void a9()
	{
		System.out.println("a7 @BeforeGroups");
	}
	@AfterGroups
	public void a10()
	{
		System.out.println("a7 @BeforeGroups");
	}
	@Test
	public void a11()
	{
		System.out.println("a11 @test writing the testcases ");
	}
	

}
