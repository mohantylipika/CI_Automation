package pageObjects.admin.job;

import org.openqa.selenium.By;

import utility.TestBase;

public class JobTitle {
	public static By jobTitles = By.xpath("//a[@id='menu_admin_viewJobTitleList']");
	public static By addButton = By.xpath("//input[@id='btnAdd']");
	public static By jobTitle = By.xpath("//input[@id='jobTitle_jobTitle']");
	public static By jobDescription = By.xpath("//textarea[@id='jobTitle_jobDescription']");
	public static By note = By.xpath("//textarea[@id='jobTitle_note']");
	public static By saveButton = By.xpath("//input[@id='btnSave']");
	public static By checkox = By.xpath("//input[@id='ohrmList_chkSelectRecord_1']");
	public static By deleteButton= By.xpath("//input[@id='btnDelete']");
	public static By alert=By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='deleteConfModal']/div[2]");
	public static By okButton= By.xpath("//input[@id='dialogDeleteBtn']");
	
	
	//*[@id=\"ohrmList_chkSelectRecord_29\"]

	public static void clickJobTitles() {
		TestBase.driver.findElement(jobTitles).click();
	}
	public static void clickAddbutton() {
		TestBase.driver.findElement(addButton).click();
	}
	public static void enterJobTitle(String typeJobTitle) {
		TestBase.driver.findElement(jobTitle).sendKeys(typeJobTitle);
	}
	
	public static void enterJobDescription(String typeJobDescription) {
		TestBase.driver.findElement(jobDescription).sendKeys(typeJobDescription);
	}
	public static void enterNotestring (String typenote) {
		TestBase.driver.findElement(note).sendKeys(typenote);
	}
	public static void clickSaveButton() {
		TestBase.driver.findElement(saveButton).click();
	}
	public static void selectCheckBox() {
		TestBase.driver.findElement(checkox).click();
	}
	public static void clickDeleButton() {
		TestBase.driver.findElement(deleteButton).click();
	}
	public static void accessAlert() {
		
		TestBase.driver.findElement(alert);
	}
	public static void clickOkButton() {
		TestBase.driver.findElement(okButton);
	}
	
}
