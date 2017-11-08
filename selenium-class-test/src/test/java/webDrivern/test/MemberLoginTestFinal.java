package webDrivern.test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webDriven.Constants.EcommerceLoginConstant;
import webDrivern.core.EcommerceBaseTest;
import webDrivern.core.XLSUtil;

public class MemberLoginTestFinal extends EcommerceBaseTest implements EcommerceLoginConstant {

	@Test(dataProvider = "memberLoginSuccess")
	public void memberLogin(String email, String password) throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.linkText(MEMBER_LOGIN_ACCOUNT)).click();
		Thread.sleep(3000);

		driver.findElement(By.id(MEMBER_EMAIL)).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_PASSWORD)).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.linkText(MEMBER_LOGIN)).click();
	}

	@DataProvider(name = "memberLoginSuccess")
	public Object[][] dp() {
		return XLSUtil.getTableArray("EcommerceLogin.xls", "Sheet1", "Login");
	}
}
