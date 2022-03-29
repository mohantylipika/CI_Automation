package testCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.admin.Admin;
import pageObjects.admin.job.Job;
import pageObjects.admin.job.JobTitle;
import testBase.TestBase;
import utility.Constant;

public class TC_AddJobTitle extends TestBase {
	boolean result;

	@Test
	public void AddJobTitleValidation() throws InterruptedException {

		l.info("*************************************AddJobTitleValidation***********************************************");
		Admin.clickAdmin();
		l.info("Admin option is clicked");

		Job.clickJob();
		l.info("Job option is clicked");
		JobTitle.clickJobTitles();
		l.info("Job Title is clicked");
		String NewJobtitle = Constant.JobTitle;

		JobTitle.clickAddbutton();
		l.info("Add button is clicked");
		JobTitle.enterJobTitle(NewJobtitle);
		l.info("New job title is enterd : " + NewJobtitle);
		JobTitle.enterJobDescription(Constant.JobDescription);
		l.info("JobDescription is entered");
		JobTitle.enterNotestring(Constant.note);
		l.info("Note is entered");
		JobTitle.clickSaveButton();
		l.info("Save button is clicked");
		List<WebElement> allJobTitles = driver.findElements(By.tagName("a"));
		List<String> allJobTitles_String = new ArrayList<String>();
		for (WebElement e : allJobTitles) {
			allJobTitles_String.add(e.getText());
		}
		sassert.assertEquals(allJobTitles_String.contains(NewJobtitle), true);
		sassert.assertAll();

	}

}
