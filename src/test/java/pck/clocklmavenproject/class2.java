package pck.clocklmavenproject;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {

	@AfterSuite(alwaysRun=true)
	public void method2()
	{
			System.out.println("After Suite");
	}

	@BeforeTest(alwaysRun=true)
	public void method3()
	{
			System.out.println("Before Test");
	}
	
	@BeforeClass(alwaysRun=true)
	public void method5()
	{
			System.out.println("Before Class at class 2");
	}
	
	@Test(priority=2,dependsOnMethods="method10",groups="SIT")
	public void method9()
	{
			System.out.println("Test case 1 in class2");
	}

	@Test(priority=3,description="validlogin",groups= {"SIT","Sanity"})
	public void method10()
	{
			System.out.println("Test case 2 in class2");
	}
	
	@Test(priority=4,groups="Sanity",invocationCount=3,invocationTimeOut=1,successPercentage=10,timeOut=60)
	public void method11()
	{
			System.out.println("Test case 3 in class2");
			int a=5;
					int b=0;
					int c=a/b;
			
	}
}
