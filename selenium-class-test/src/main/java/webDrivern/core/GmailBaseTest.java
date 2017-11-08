package webDrivern.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GmailBaseTest {

	public WebDriver driver = null;

	@BeforeMethod
	public void setUP() {
	/*	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver = new ChromeDriver();*/
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https:\\accounts.google.com/signin/v2/identifier?service=mail");
	}

	@AfterMethod
	public void cleanUP() {
		//Closing the driver...
		driver.close();
	}


}
