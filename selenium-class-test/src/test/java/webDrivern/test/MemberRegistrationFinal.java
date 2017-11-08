package webDrivern.test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webDriven.Constants.EcommerceRegistrationConstant;
import webDrivern.core.EcommerceBaseTest;
import webDrivern.core.XLSUtil;

public class MemberRegistrationFinal extends EcommerceBaseTest implements EcommerceRegistrationConstant {

	@Test(dataProvider = "memberRegistrationSuccess")
	public void memberRegister(String fname, String lname, String day, String month, String year, String email,
			String houseno, String address, String city, String state, String country, String postcode, String phone,
			String fax, String password, String cpassword) throws Exception {

		driver.findElement(By.linkText(MEMBER_REGISTER_ACCOUNT)).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(MEMBER_REGISTER_SIGNUP)).click();
		Thread.sleep(3000);
		driver.findElement(By.id(MEMBER_REGISTER_FIRST_NAME)).sendKeys(fname);

		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_LAST_NAME)).sendKeys(lname);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_DAY)).sendKeys(day);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_MONTH)).sendKeys(month);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_YEAR)).sendKeys(year);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_EMAIL)).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_HOUSE_NO)).sendKeys(houseno);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_ADDRESS1)).sendKeys(address);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_CITY)).sendKeys(city);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_STATE)).sendKeys(state);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_COUNTRY)).clear();
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_COUNTRY)).sendKeys(country);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_POSTCODE)).sendKeys(postcode);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_PHONE)).sendKeys(phone);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_FAX)).sendKeys(fax);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_PASSWORD)).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id(MEMBER_REGISTER_CPASSWORD)).sendKeys(cpassword);
		Thread.sleep(2000);
		if (!driver.findElement(By.id(MEMBER_REGISTER_NEWSLETTER)).isSelected()) {
			Thread.sleep(2000);
			driver.findElement(By.id(MEMBER_REGISTER_NEWSLETTER)).click();
		}

		if (!driver.findElement(By.id(MEMBER_REGISTER_TERMS)).isSelected()) {
			Thread.sleep(2000);
			driver.findElement(By.id(MEMBER_REGISTER_TERMS)).click();
		}
		driver.findElement(By.name(MEMBER_REGISTER_SUBMIT)).click();
		
		Thread.sleep(3000);
	}

	@DataProvider(name = "memberRegistrationSuccess")
	public Object[][] dp() {
		return XLSUtil.getTableArray("EcommerceRegistration.xls", "Sheet1", "RegistrationDetails");
	}
}
