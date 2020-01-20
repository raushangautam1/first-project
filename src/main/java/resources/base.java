package resources;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\admin\\Desktop\\first script\\first-project\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//String appurl=prop.getProperty("url");
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().version("2.41").setup();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Raushan\\Downloads\\sql server\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();	
		} else if (browserName == "firefox") {

		} else if (browserName == "IE") {

		}
		driver.manage().window().maximize();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, 500)");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public String initializeDriver1() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\admin\\Desktop\\first script\\first-project\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String appurl=prop.getProperty("url");
		return appurl;
	}
	
	protected void switchToFrame(By frame) {
		driver.switchTo().frame(getElementWhenVisible(frame));
	}
		
	protected WebElement getElementWhenVisible(By elementToken) {
		WebElement foundElement=null;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			foundElement = wait.until(ExpectedConditions.elementToBeClickable(elementToken));
		} catch (NoSuchElementException excp) {
			fail(logMessage("[ASSERT FAILED]: Element " + elementToken + " not found on the webPage !!!"));
		} catch (NullPointerException npe) {
			fail("[UNHANDLED EXCEPTION]: " + npe.getLocalizedMessage());
		}
		return foundElement;
	}
	
	protected String logMessage(String message) {
		Reporter.log(message, true);
		return message;
	}
	
	
	protected void switchToLastWindow() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int n=tabs.size();
		driver.switchTo().window(tabs.get(n-1));
	}
	
}
