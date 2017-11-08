package webDrivern.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderProcessingTest {

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

		driver.findElement(By.linkText("PRODUCTS")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='proddetail.php?proid=10004']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[value='Add to Cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='checkoutshiping.php']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.id("shipopt"));
		List<WebElement> list = driver.findElements(By.name("shipopt"));
		Boolean is_selected = list.get(0).isSelected();
		if (is_selected == true) {
			list.get(1).click();
		}
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//img[@src='images/continue.gif']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@href='checkfidetail.php?ship=2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='checkfinalreview.php?ship=2']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.name("dcode")).sendKeys("94538");
		
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
