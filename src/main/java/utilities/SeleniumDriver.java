package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

//	Creating a class reference
//	initiate webdriver
	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	final static int TIMEOUT = 30;
	final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bhutt\\Selenium_WorkSpace\\selenium\\src\\main\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));

	}

	public static void openURL(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;

	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}

	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
}
