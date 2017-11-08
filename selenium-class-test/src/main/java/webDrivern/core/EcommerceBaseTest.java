package webDrivern.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class EcommerceBaseTest {

	protected WebDriver driver = null;

	@BeforeMethod
	public void setUP() {
	/*	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		// Create the Driveres..
		driver = new ChromeDriver();*/
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ecommerce.saipratap.net");
	}

	
	@AfterTest
	public void cleanUP() {
		//Closing the driver..
	driver.close();
	}





}
