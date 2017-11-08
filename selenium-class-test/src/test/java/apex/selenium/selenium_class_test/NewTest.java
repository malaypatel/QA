package apex.selenium.selenium_class_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void CheckGoogle() throws InterruptedException {
	  WebDriver driver=new FirefoxDriver();
      driver.get("http://www.google.com");
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Cheese");   
      driver.findElement(By.xpath("//button[@name='btnG']")).click();
      //Assert.assertTrue(driver.getTitle().contains("Cheese"));
      System.out.println(driver.getTitle());
      Thread.sleep(5000);
      Assert.assertTrue(driver.getTitle().contains("Cheese"));
      
      System.out.println("True done");
  }
}
