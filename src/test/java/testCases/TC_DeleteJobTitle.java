package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.admin.Admin;
import pageObjects.admin.job.Job;
import pageObjects.admin.job.JobTitle;
import testBase.TestBase;

public class TC_DeleteJobTitle extends TestBase {

	@Test
	public void DeleteJobTitleValidation() throws InterruptedException {

		l.info("********************** Delete Job Tilte  *************************************");
		Admin.clickAdmin();
		l.info("Clicked on Admin");
		Job.clickJob();
		l.info("Clicked on Job");
		JobTitle.clickJobTitles();
		l.info("Clicked on Job Title");
		JobTitle.selectCheckBox();
		l.info("Clicked on the check box to be deleted");
		JobTitle.clickDeleButton();
		l.info("Clicked on Delete button");
		JobTitle.clickOkButton();
		l.info("Clicked on OK button on the pop up");
		// driver.findElement(By.xpath("//*[@id=\"deleteConfModal\"]/div[2]"));
		Thread.sleep(3000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		sassert.assertAll();
	}
}

/*
 * // Login System.setProperty("webdriver.chrome.driver",
 * "D:\\Software\\chromedriver_97\\chromedriver.exe"); WebDriver driver = new
 * ChromeDriver(); driver.get(
 * "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials"
 * ); driver.manage().window().maximize(); WebElement username =
 * driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
 * username.sendKeys("Admin"); WebElement password =
 * driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
 * password.sendKeys("admin123"); WebElement login =
 * driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")); login.click();
 * Thread.sleep(2000); WebElement admin =
 * driver.findElement(By.xpath("//b[contains(text(),'Admin')]")); admin.click();
 * driver.findElement(By.xpath("//input[@id='jobTitle_jobTitle']")).click();
 * 
 * Thread.sleep(2000); WebElement delete =
 * driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_42']"));
 * delete.click(); // WebElement delete =
 * driver.findElement(By.xpath("//input[@id='btnDelete']")); Thread.sleep(2000);
 * 
 * Alert alert = driver.switchTo().alert(); alert.accept();
 * 
 * }
 */
