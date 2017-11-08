package webDrivern.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MemberLoginTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// driver.get("https://accounts.google.com/signin/v2/identifier");
		driver.get("http://ecommerce.saipratap.net");
		Thread.sleep(2000);
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("testmail@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("test123");
		Thread.sleep(2000);
	
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
