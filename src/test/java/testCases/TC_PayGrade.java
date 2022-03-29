package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.admin.Admin;
import pageObjects.admin.job.Job;
import pageObjects.admin.job.PayGrades;
import testBase.TestBase;
import utility.Constant;

public class TC_PayGrade extends TestBase {

	@Test
	public void PayGradeValidation()  {
		
		l.info("********************  PayGradeValidation    ****************************");
		Admin.clickAdmin();
		l.info("Clicked on Admin");
		Job.clickJob();
		l.info("Clicked on Job");
		PayGrades.clickOnPayGradeOption();
		l.info("Clicked on Pay Grade option");
		PayGrades.clickOnAddButton();
		l.info("Clicked on Add button");
		PayGrades.enterPayGradeName(Constant.payGrade);
		l.info("Entered new Pay Grade value");
		PayGrades.clickOnSaveButton();
		l.info("Clicked on Save button");
		Job.clickJob();
		l.info("Again clicked on Job");
		PayGrades.clickOnPayGradeOption();
		l.info("Again clicked on Pay Grade option");
		List<WebElement> allPayGrades = driver.findElements(By.tagName("a"));
		List<String> allPayGrades_String = new ArrayList<String>();
		for (WebElement e : allPayGrades) {
			allPayGrades_String.add(e.getText());
		}
		sassert.assertEquals(allPayGrades_String.contains(Constant.payGrade), true);
		sassert.assertAll();
		
	}
}
