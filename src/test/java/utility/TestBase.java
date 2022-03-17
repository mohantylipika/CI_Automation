package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pageObjects.LoginLogout;

public class TestBase {

	public static WebDriver driver;
	public SoftAssert sassert = new SoftAssert();
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", Constant.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void openWebPage(String url) {
		driver.get(url);

	}

	public static void closeBrowser() {
		driver.close();
	}

	@BeforeMethod
	public void beforeExecution() {

		
		TestBase.openBrowser();
		TestBase.openWebPage(Constant.orangeHrmUrl);
		LoginLogout.enterUserName(Constant.username);
		LoginLogout.enterPassword(Constant.password);
		LoginLogout.clickOnLoginButton();
	}

	@AfterMethod
	public void afterExecution() {
		TestBase.closeBrowser();
	}
	  
	

}
