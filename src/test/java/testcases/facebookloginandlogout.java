package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commonpackage.browser;
import commonpackage.commonfunctions;
import commonutils.excelreadwrite;
import pages.facebooklogin;
import pages.facebooklogoutpage;

public class facebookloginandlogout extends browser
{
	 
commonfunctions cf= new commonfunctions();

@BeforeSuite
public void start()
{
	launchbrowser("chrome");
}

@BeforeTest
public void loadurl()
{
	dr.get("https://www.facebook.com");
}



@Test(priority=0,dataProvider="excel",dataProviderClass=datproviderclass.class)
public void loginandlogout(String usname,String powd)
{
	try
	{
	facebooklogin fc= new facebooklogin(dr);
	fc.username(usname);
	fc.password(powd);
	fc.login();
	facebooklogoutpage f= new facebooklogoutpage(dr);
	f.logoutoption();
	String reportpath=cf.capture(dr);
	f.logoutfromdropdown();
	et.log(LogStatus.PASS,et.addScreenCapture(reportpath));
	}
	catch(Exception e)
	{
		et.log(LogStatus.FAIL,e);
	}
}


@Test(priority=1)
public void incorrectvalue()
{
	try
	{
	facebooklogin fc= new facebooklogin(dr);
	fc.username("kumar sadaf sadasd assdasd");
	fc.password("AdminsR");
	fc.login();
	String Actualerromessage=fc.incorrectlogin();
	System.out.println(Actualerromessage);
	String Expectederrormessage="The email address or mobile number you entered isn't connected to an account. Create a new Facebook account.";
	Assert.assertEquals(Actualerromessage,Expectederrormessage);
	String reportpath=cf.capture(dr);
	et.log(LogStatus.PASS,et.addScreenCapture(reportpath));
}
catch(Exception e)
{
	et.log(LogStatus.FAIL,e);
}
}

@AfterSuite
public void teardown()
{
	dr.quit();
	er.endTest(et);
	er.flush();
}
}
