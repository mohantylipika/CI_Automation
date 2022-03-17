package testCases;

import org.testng.annotations.Test;


import pageObjects.admin.Admin;
import pageObjects.admin.job.Job;
import pageObjects.admin.job.JobTitle;
import utility.Constant;
import utility.TestBase;

public class TC_AddJobTitle extends TestBase {
	@Test
	public void AddJobTitleValidation() throws InterruptedException {

		Admin.clickAdmin();
		Job.clickJob();
		JobTitle.clickJobTitles();
		JobTitle.clickAddbutton();
		JobTitle.enterJobTitle(Constant.JobTitle);
		JobTitle.enterJobDescription(Constant.JobDescription);
		JobTitle.enterNotestring(Constant.note);
		JobTitle.clickSaveButton();
		sassert.assertAll();

	}

}
