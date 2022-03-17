package testCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.admin.Admin;
import pageObjects.admin.job.Job;
import pageObjects.admin.job.JobTitle;
import utility.Constant;
import utility.TestBase;

public class TC_AddJobTitle2 extends TestBase {
	@Test
	public void AddJobTitleValidation() throws InterruptedException {

		Admin.clickAdmin();
		Job.clickJob();
		JobTitle.clickJobTitles();
		//String constant = "QA Lead435";
		/*List<WebElement> allJobTitles = driver.findElements(By.tagName("a"));
		
		String jobtitle;
		Iterator<WebElement> itr = allJobTitles.iterator();
		while (itr.hasNext()) {
			jobtitle = itr.next().getText();
			System.out.println(jobtitle);

			if (jobtitle.equals(constant)) {
				// System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
				System.out.println("JobTitle " + constant + " Already Exists,Please Try with  a different one.");
			}*/
			
		
			JobTitle.clickAddbutton();
			JobTitle.enterJobTitle(Constant.JobTitle);
			JobTitle.enterJobDescription(Constant.JobDescription);
			JobTitle.enterNotestring(Constant.note);
			JobTitle.clickSaveButton();
			
		}
		// sassert.assertAll();
	}


