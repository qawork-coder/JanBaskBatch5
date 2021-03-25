package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.CellPhonePage;
import pages.HomePage;
import pages.MenuPage;

public class TestCase1 extends Base{
	//1. We need to declare the class objects and driver
	//2. Need to extend the class for the driver 
	//3. Need to initialise the objects of the pages
	
	public WebDriver driver;
	CellPhonePage cellObj=null;
	HomePage homeObj=null;
	MenuPage menuObj=null;
	
	//CellPhonePage cellObj=new CellPhonePage(); A default constructor automatically

	@BeforeSuite
	public void initialSetup()
	{
		driver=getDriver();
		cellObj=new CellPhonePage(driver);
		homeObj=new HomePage(driver);
		menuObj=new MenuPage(driver);
		
	}
	
	@Test
	public void TC1()
	{
		homeObj.intialVerification();
		homeObj.openMenu();
		menuObj.navigationFlow();
		cellObj.cellPhonePageVerification();
		
	}

}
