package Practice_TestNGFinal;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// same annotations are running in this script
// all were different and we get to know whihc one will execute first

//When you have SAME annotaions for more than one methods. order will be depending on Numbers,alphabets(Capital,Small),

//Before,After method will run every time of before the @test condetion

//Ideally you should not have any method without annotaions
// In case if you have it.. how you will call it is using  annotaions methods. 

public class multipletestannotations {
	@BeforeSuite
	public void a1()
	{
		System.out.println("a1 beforesuit");
	}
	@BeforeSuite
	public void a0()
	{
		System.out.println("a0 beforesuit");
	}
	@BeforeClass
	public void a3()
	{
		System.out.println("a3 before class");
	}
	@BeforeTest
	public void a4()
	{
		System.out.println("a4 beforetest");
	}
	@BeforeMethod
	public void a5()
	{
		System.out.println("a5 beforemethod");
	}
	@AfterMethod
	public void a6()
	{
		System.out.println("a6 aftermethod");
	}
	@Test
	public void S1a1()
	{
		System.out.println("S1a1  @test");
	}
	@Test
	public void s1c1()
	{
		System.out.println("s1c1 @test");
	}
	@Test(enabled =false)
	public void s1b1()
	{
		System.out.println("s1b1 @test");
	}
	@Test
	public void sa1()
	{
		System.out.println("Sa1 @test");
	}@Test
	public void s1() {
		System.out.println("s1 @test");
	}

}
