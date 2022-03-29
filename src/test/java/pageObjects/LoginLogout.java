package pageObjects;

import org.openqa.selenium.By;

import testBase.TestBase;

public class LoginLogout {

	public static By username = By.xpath("//*[@id=\"txtUsername\"]");
	public static By password = By.xpath("//*[@id=\"txtPassword\"]");
	public static By loginbutton = By.xpath("//*[@id=\"btnLogin\"]");
	public static By welcomearea = By.xpath("//*[@id=\"welcome\"]");
	public static By logoutbutton = By.xpath("//a[contains(text(),'Logout')]");

	public static void enterUserName(String usernm) {
		TestBase.driver.findElement(username).sendKeys(usernm);
	}

	public static void enterPassword(String passwd) {
		TestBase.driver.findElement(password).sendKeys(passwd);

	}

	public static void clickOnLoginButton() {
		TestBase.driver.findElement(loginbutton).click();
	}

	public static void clickOnWelcomearea() {
		TestBase.driver.findElement(welcomearea).click();
	}

	public static void clickOnLogOutButton() {
		
		TestBase.driver.findElement(logoutbutton).click();
	}

}
