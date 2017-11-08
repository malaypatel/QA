package apex.selenium.selenium_class_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GoogleTest {

		public static void main(String[] args) throws InterruptedException {
		/*	//WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "/Users/malay/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			//driver.manage().window().fullscreen();
			driver.get("http://www.google.com");
			Thread.sleep(3000);
			
			driver.navigate().to("http://www.facebook.com");
			driver.close();*/
			
			  WebDriver driver=new FirefoxDriver();
		        driver.get("http://www.google.com");
		        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Cheese");   
		        driver.findElement(By.xpath("//button[@name='btnG']")).click();
		        Assert.assertTrue(driver.getTitle().startsWith("Cheese"), "TRUE");
		}
}
