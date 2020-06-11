package Practice_TestNGFinal ;


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

public class annotations {
	@BeforeSuite
	public void s1()
	{
		System.out.println("s1 @BeforeSuite");
	}
	@BeforeClass
	public void s2()
	{
		System.out.println("s2 @BeforeClass");
	}
	@BeforeGroups
	public void s3() {
		System.out.println("s3 @BeforeGroups");
	}
	@BeforeMethod
	public void s4()
	{
		System.out.println("s4 @BeforeMethod");
	}
	@BeforeTest
	public void s5()
	{
		System.out.println("s5 @BeforeTest");
	}
	@Test
	public void testcase()
	{
		System.out.println("this is for writing the testcases @test" );
	}
	@AfterSuite
	public void s6()
	{
		System.out.println("s6 @AfterSuit");
	}
	@AfterClass
	public void s7() {
		System.out.println("s7 @AfterClass");
	}
	@AfterGroups
	public void s8() {
		System.out.println("s8 @AfterGroups");
	}
	@AfterMethod
	public void  s9()
	{
		System.out.println("s9 @AfterMethod");
	}
	@AfterTest
	public void s10()
	{
		System.out.println("s10 @AfterTest");
	}
	

}
