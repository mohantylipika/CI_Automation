package pageObjects.admin.job;

import org.openqa.selenium.By;

import testBase.TestBase;

public class PayGrades {

	public static By payGradesOption = By.xpath("//a[@id='menu_admin_viewPayGrades']");
	public static By addButton = By.xpath("//input[@id='btnAdd']");
	public static By nameTextBox = By.xpath("//input[@id='payGrade_name']");
	public static By saveButton = By.xpath("//input[@id='btnSave']");

	public static void clickOnPayGradeOption() {

		TestBase.driver.findElement(payGradesOption).click();
	}

	public static void clickOnAddButton() {

		TestBase.driver.findElement(addButton).click();
	}

	public static void enterPayGradeName(String payGrade) {
		TestBase.driver.findElement(nameTextBox).sendKeys(payGrade);
	}

	public static void clickOnSaveButton() {
		TestBase.driver.findElement(saveButton).click();
	}

}
