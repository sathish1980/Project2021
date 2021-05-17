package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonpackage.commonfunctions;

public class facebooklogoutpage 
{

	WebDriver dr;
	commonfunctions cs= new commonfunctions();
	
	public facebooklogoutpage(WebDriver dr)
	{
		this.dr=dr;
		
	}

	public void logoutoption()
	{
		
		cs.elemnetobeclickable(By.xpath("//div[@aria-label='Account']"), dr);
		dr.findElement(By.xpath("//div[@aria-label='Account']")).click();
	}
	
	
	public void logoutfromdropdown()
	{
		cs.elemnetobeclickable(By.xpath("//span[text()='Log Out']//ancestor::div[2]"), dr);
		dr.findElement(By.xpath("//span[text()='Log Out']//ancestor::div[2]")).click();

	}
}
