package pck.clocklmavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 
{

@BeforeSuite(alwaysRun=true)
public void method1()
{
		System.out.println("Before Suite");
}
@BeforeClass(alwaysRun=true)
public void method5()
{
		System.out.println("Before Class");
}

@BeforeMethod(alwaysRun=true)
public void method7()
{
		System.out.println("Before Method");
}

@Test(priority=1,groups="SIT")
public void method9()
{
		System.out.println("Test case 1");
}

@Test(priority=0,groups= {"Sanity","SIT"})
public void method10()
{
		System.out.println("Test case 2");
}

@AfterMethod(alwaysRun=true)
public void method8()
{
		System.out.println("After Method");
}

@AfterClass(alwaysRun=true)
public void method6()
{
		System.out.println("After Class");
}

@AfterTest(alwaysRun=true)
public void method4()
{
		System.out.println("After Test");
}

}
