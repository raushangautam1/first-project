package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Raushan\\Wingify\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//String appurl=prop.getProperty("url");
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			//WebDriverManager.chromedriver().version("2.41").setup();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raushan\\Downloads\\sql server\\chromedriver_win32 (1)\\chromedriver.exe");
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
}
