package testCases;

import org.testng.annotations.Test;

import pageObjects.admin.Admin;
import utility.TestBase;

public class TC_UserSearch extends TestBase {
	@Test

	public void UserSearchValidation() throws InterruptedException {

		Admin.clickAdmin();
		sassert.assertAll();

	}

}
