package utility;

import java.util.Random;

public class Constant {
	public static Random random = new Random();
	public static final String chromeDriverPath = "drivers\\chromedriver99.exe";
	public static final String geckoDriverPath = "drivers\\geckodriver.exe";
	public static final String edgeDriverPath = "drivers\\msedgedriver.exe";
	//D:\Software\chromedriver_99
	public static final String orangeHrmUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	public static final String username="Admin";
	public static final String password="admin123";

	public static final String expectedUrlAfterLogin = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	public static final String expectedUrlAfterLogout = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public static final String note="esdxgfchvjb";
	public static final String JobTitle="QA_Lead_"+random.nextInt(900) + 100;
	public static final String JobDescription="awetzrsxydtcfygvbh";
	public static final String TypeUsernamesearch="Admin";
	
	public static final String payGrade="GP_"+random.nextInt(900) + 100;
	
	
	
}
