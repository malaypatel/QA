package webDrivern.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webDriven.Constants.EcommerceOrderProcessConstant;
import webDrivern.core.EcommerceBaseTest;
import webDrivern.core.XLSUtil;


public class OrderProcessTestDPFinal extends EcommerceBaseTest implements EcommerceOrderProcessConstant {

	@Test(dataProvider = "orderProcessSuccess")
	public void processOrder(String email, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.linkText(ORDER_ACCOUNT)).click();
		Thread.sleep(3000);

		driver.findElement(By.id(ORDER_EMAIL)).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id(ORDER_PASSWORD)).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.linkText(ORDER_LOGIN)).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText(ORDER_PRODUCTS)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ORDER_PRODUCT_ID)).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(ORDER_ADD_TO_CART)).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText(ORDER_CHECKOUT)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(ORDER_CHECKOUT_SHIPPING)).click();
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.name(ORDER_SHIP_OPT));
		Boolean is_selected = list.get(0).isSelected();
		if (is_selected == true) {
			list.get(1).click();
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath(ORDER_CONTINUE)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(ORDER_CHECK_FI_DETAILS)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(ORDER_CHECK_FINAL_REVIEW)).click();
		Thread.sleep(2000);

		driver.findElement(By.name(SUBMIT)).click();

		Thread.sleep(5000);
	}

	@DataProvider(name = "orderProcessSuccess")
	public Object[][] dp() throws Exception {
		return XLSUtil.getTableArray("EcommerceLogin.xls", "Sheet1", "Login");
	}


}
