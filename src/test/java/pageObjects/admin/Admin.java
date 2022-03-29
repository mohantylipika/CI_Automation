package pageObjects.admin;

import org.openqa.selenium.By;

import testBase.TestBase;

public class Admin {
	public static By admin = By.xpath("//b[contains(text(),'Admin')]");

	public static void clickAdmin() {
		
		TestBase.driver.findElement(admin).click();
	}
}