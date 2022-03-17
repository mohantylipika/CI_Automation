package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.admin.Admin;
import pageObjects.admin.job.Job;
import pageObjects.admin.job.JobTitle;
import utility.TestBase;

public class TC_DeleteJobTitle extends TestBase {

	@Test
	public void DeleteJobTitleValidation() throws InterruptedException {

		Admin.clickAdmin();
		Job.clickJob();
		JobTitle.clickJobTitles();
		JobTitle.selectCheckBox();
		JobTitle.clickDeleButton();
		JobTitle.clickOkButton();
		// driver.findElement(By.xpath("//*[@id=\"deleteConfModal\"]/div[2]"));
		Thread.sleep(3000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		

//		JobTitle.accessAlert();

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
