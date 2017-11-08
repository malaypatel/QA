package testingGoogleChrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForAutomation {

	public static void main(String[] args) throws InterruptedException {
	/*	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/malay/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div/a")).click();
		Thread.sleep(1000);
		
		 WebElement element = driver.findElement(By.id("gs_htif0"));
		 element.sendKeys("Hello");
		 driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();*/
		//driver.findElement(By.xpath("//input[@id='gs_htif0']")).click();
		//driver.findElement(By.xpath(".//input[@id='gs_htif0']")).sendKeys("Hello");
		//driver.navigate().to("http://www.facebook.com");
		//driver.close();
		/*
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).click();
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("malaypatel6180@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		//driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).click();
		WebElement passElement = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passElement.click();
		passElement.sendKeys("Malay");
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();*/
		
		

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java"); 
        driver.findElement(By.name("btnK")).click();
       
/*       
        List<WebElement> no = driver.findElements(By.tagName("a"));
        int nooflinks = no.size(); 
        System.out.println(nooflinks);
        for (WebElement pagelink : no)
             {
              String linktext = pagelink.getText();
              String link = pagelink.getAttribute("href"); 
              System.out.println(linktext+" ->");
              System.out.println(link);
              }
*/
        
       
		}

	}


