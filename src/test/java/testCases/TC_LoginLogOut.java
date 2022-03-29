package testCases;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.LoginLogout;
import testBase.TestBase;
import utility.Constant;

public class TC_LoginLogOut extends TestBase {
	@Test
	public void LoginLogOutValidation() throws InterruptedException {

		l.info("**********************************   LoginLogOutValidation  **************************");
		String EUrl = Constant.expectedUrlAfterLogin;
		l.info("Expected URL captured before login");
		String AUrl = TestBase.driver.getCurrentUrl();
		l.info("Actual URL captured after login");
		sassert.assertEquals(EUrl, AUrl);
		LoginLogout.clickOnWelcomearea();
		l.info("Clicked on WelCome area");
		LoginLogout.clickOnLogOutButton();
		l.info("Clicked on Logout button");
		String afterLogOutEUrl = Constant.expectedUrlAfterLogout;
		l.info("Expected URL captured after logout");
		String afterLogOutAUrl = TestBase.driver.getCurrentUrl();
		l.info("Actual URL captured after logout");
		sassert.assertEquals(afterLogOutEUrl, afterLogOutAUrl);
		sassert.assertAll();

	}
}