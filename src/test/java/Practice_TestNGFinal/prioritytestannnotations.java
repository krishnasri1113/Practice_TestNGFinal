package Practice_TestNGFinal;


import org.testng.annotations.Test;

public class prioritytestannnotations {
	@Test(priority =1)
	public void s1a()
	{
		System.out.println("s1 @test");
	}
	@Test(priority=1)
	public void s2A()
	{
		System.out.println("s1a @test");
	}
	@Test(priority=2)
	public void s2()
	{
		System.out.println("s2 @test");
	}
	@Test(priority=-1,enabled =false)
	public void s3()
	{
		System.out.println("s3 @test");
	}
	@Test 
	public void s4()
	{
		System.out.println("s4 @test");
	}

}
