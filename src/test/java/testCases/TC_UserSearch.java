package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.admin.Admin;
import pageObjects.admin.usermanagement.Users;
import testBase.TestBase;
import utility.Constant;

public class TC_UserSearch extends TestBase {
	@Test

	public void UserSearchValidation() throws InterruptedException {
		
		l.info("************************* UserSearchValidation   *************************************** ");

		Admin.clickAdmin();
		l.info("Admin option is clicked");
		Users.clearUserName();
		l.info("UserName search box is cleared");
		Users.EnterUsername(Constant.TypeUsernamesearch);
		l.info("UserName is entered: "+Constant.TypeUsernamesearch);
		Users.clickSearchButton();
		l.info("Search button is clicked");
		List<WebElement> allUsers = driver.findElements(By.tagName("a"));
		List<String> allUsers_String = new ArrayList<String>();
		for (WebElement e : allUsers) {
			allUsers_String.add(e.getText());
		}
		sassert.assertEquals(allUsers_String.contains(Constant.TypeUsernamesearch), true);
		sassert.assertAll();

	}

}
