package apex.selenium.selenium_class_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MemberRegistrationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		 WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.get("https://accounts.google.com/signin/v2/identifier");
		driver.get("http://ecommerce.saipratap.net");
		Thread.sleep(2000);
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SignUp")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fname")).sendKeys("Malay");
		Thread.sleep(1000);
		driver.findElement(By.id("lname")).sendKeys("Patel");
		Thread.sleep(1000);
		driver.findElement(By.id("day")).sendKeys("07");
		Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("1992");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("testmail@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("houseno")).sendKeys("2010");
		Thread.sleep(1000);
		driver.findElement(By.id("add1")).sendKeys("Stevenson Common");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("Fremont");
		Thread.sleep(1000);
		driver.findElement(By.id("state")).sendKeys("California");
		Thread.sleep(1000);
		driver.findElement(By.id("country")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("country")).sendKeys("USA");
		Thread.sleep(1000);

		driver.findElement(By.id("postcode")).sendKeys("94538");
		Thread.sleep(1000);
		driver.findElement(By.id("phone")).sendKeys("123-456-7890");
		Thread.sleep(1000);
		driver.findElement(By.id("fax")).sendKeys("123-456-7890");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("test123");
		Thread.sleep(1000);
		driver.findElement(By.id("cpassword")).sendKeys("test123");
		Thread.sleep(1000);
		if (!driver.findElement(By.id("newsletter")).isSelected()) {
			Thread.sleep(2000);
			driver.findElement(By.id("newsletter")).click();
		}

		if (!driver.findElement(By.id("terms")).isSelected()) {
			Thread.sleep(2000);
			driver.findElement(By.id("terms")).click();
		}

		driver.findElement(By.name("Submit")).click();

		Thread.sleep(5000);
		driver.close();

	}

}
