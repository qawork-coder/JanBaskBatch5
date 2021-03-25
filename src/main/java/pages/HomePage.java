package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//1. Locators
	//2. Constructors
	//3. Methods 
	
	//WebElement signButton=driver.findElemnent(By.id("")).isDisplayed();
	
	//Using Page Object Model , we need to use Page Factory concept
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-link-accountList")
	public WebElement signInButton;
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement HamburgerIcon;
	
	
	public void intialVerification()
	{
		signInButton.isDisplayed();
	}
	
	public void openMenu()
	{
		HamburgerIcon.click();
	}
}
