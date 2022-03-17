package pageObjects.admin.usermanagement;

import org.openqa.selenium.By;

import utility.Constant;
import utility.TestBase;

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
	public static void clickUserName() {
		TestBase.driver.findElement(username).click();
	}
	public static void clickUserNameSearch() {
		TestBase.driver.findElement(usernamesearch).sendKeys(Constant.TypeUsernamesearch);
	}
}
