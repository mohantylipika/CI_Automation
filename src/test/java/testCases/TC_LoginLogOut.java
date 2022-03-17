package testCases;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.LoginLogout;
import utility.Constant;
import utility.TestBase;

public class TC_LoginLogOut extends TestBase {
	@Test
	public void LoginLogOutValidation() throws InterruptedException {

		
		String EUrl = Constant.expectedUrlAfterLogin;
		String AUrl = TestBase.driver.getCurrentUrl();
		System.out.println(AUrl);
		sassert.assertEquals(EUrl, AUrl);
		LoginLogout.clickOnWelcomearea();
		LoginLogout.clickOnLogOutButton();
		String afterLogOutEUrl = Constant.expectedUrlAfterLogout;
		String afterLogOutAUrl = TestBase.driver.getCurrentUrl();
		System.out.println(afterLogOutAUrl);
		sassert.assertEquals(afterLogOutEUrl, afterLogOutAUrl);
		sassert.assertAll();

	}
}