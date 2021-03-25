package baseSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {


	public WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_89/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		return driver;
	}
}
