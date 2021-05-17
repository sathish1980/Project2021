package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonpackage.commonfunctions;

public class facebooklogin 
{
	WebDriver dr ;
	commonfunctions cf= new commonfunctions();
	
	public facebooklogin(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void username(String uname)
	{
		dr.findElement(By.id("email")).sendKeys(uname);
	}


	public void password(String pwd)
	{
		dr.findElement(By.id("pass")).sendKeys(pwd);
	}

	public void login()
	{
		dr.findElement(By.name("login")).click();
	}
	
	public String incorrectlogin()
	{
		cf.elemnetobevisible(By.xpath("//div[@id='email_container']//child::div[2]"),dr);
		String errormgs=dr.findElement(By.xpath("//div[@id='email_container']//child::div[2]")).getText();
		return errormgs;
	}
}
