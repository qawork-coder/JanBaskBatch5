package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
public WebDriver driver;
	
	public MenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[text()='Electronics'])[3]")
	public WebElement electronicsLabel;
	
	@FindBy(xpath = "//*[text()='Cell Phones & Accessories']")
	public WebElement cellPhoneLabel;
	
	public void navigationFlow()
	{
		electronicsLabel.click();
		cellPhoneLabel.click();
	}
	

}

