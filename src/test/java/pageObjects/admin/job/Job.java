package pageObjects.admin.job;

import org.openqa.selenium.By;

import testBase.TestBase;

public class Job {
	public static By Job = By.xpath("//a[@id='menu_admin_Job']");


public static void clickJob() {
	TestBase.driver.findElement(Job).click();
}
}