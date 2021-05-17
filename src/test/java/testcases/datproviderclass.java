package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import commonutils.excelreadwrite;

public class datproviderclass 
{
	excelreadwrite ec= new excelreadwrite();
	String filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\90clocklmavenproject\\inputfile\\";
	String fileName="facebooklogin.xls";
	String sheetName="input";

	@DataProvider
	public String[][] excel() throws IOException
	{
		return ec.excelreaddata(filepath,fileName,sheetName );
	}
}
