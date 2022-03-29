package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pageObjects.LoginLogout;
import utility.Constant;

public class TestBase {

	public static Properties prop;
	public static FileInputStream fip;
	public static String browser;
	public static Logger l;
	public static WebDriver driver;
	public static SoftAssert sassert;

	@BeforeMethod
	public static void openBrowser() throws Throwable {

		fip = new FileInputStream(".\\config\\GlobalProperty.properties");
		prop = new Properties();
		prop.load(fip);
		browser = prop.getProperty("browser");
		l = Logger.getLogger("devpinoyLogger");
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + ".\\config\\log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		l.info("Browser is selected : " + browser);
		sassert = new SoftAssert();
		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", Constant.chromeDriverPath);
			driver = new ChromeDriver();
			l.info("Chrome browser is opened");

		}
		if (browser.equalsIgnoreCase("Mozilla") || browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constant.geckoDriverPath);
			driver = new FirefoxDriver();
			l.info("Mozilla browser is opened");

		}
		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", Constant.edgeDriverPath);
			driver = new EdgeDriver();
			l.info("Edge browser is opened");

		}
		driver.get(Constant.orangeHrmUrl);
		driver.manage().window().maximize();
		l.info("Window is maximized now");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		l.info("Implicit Wait has been set");
		l.info("URL is opened");
		LoginLogout.enterUserName(Constant.username);
		LoginLogout.enterPassword(Constant.password);
		LoginLogout.clickOnLoginButton();

	}

	@AfterMethod
	public void afterExecution() {
		driver.quit();
		l.info(browser + " is closed");
	}

}
