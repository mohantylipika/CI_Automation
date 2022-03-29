package pageObjects.admin.usermanagement;

import org.openqa.selenium.By;

import testBase.TestBase;
import utility.Constant;

public class Users {
	public static By admin = By.xpath("//b[contains(text(),'Admin')]");
	public static By usermanagement = By.xpath("//*[@id=\"menu_admin_UserManagement\"]");
	public static By username = By.xpath("//*[@id=\"searchSystemUser_userName\"]");
	public static By usernamesearch = By.xpath("//input[@id='searchSystemUser_userName']");
	public static By search = By.xpath("//*[@id=\"searchBtn\"]");

	public static void clickAdmin() {
		TestBase.driver.findElement(admin).click();
	}

	public static void clickUserManagement() {
		TestBase.driver.findElement(usermanagement).click();
	}
	public static void clearUserName() {
		//TestBase.driver.findElement(username).click();
		TestBase.driver.findElement(username).clear();
	}
	public static void EnterUsername(String username) {
		TestBase.driver.findElement(usernamesearch).sendKeys(username);
	}
	public static void clickSearchButton() {
		TestBase.driver.findElement(search).click();
	}
}
