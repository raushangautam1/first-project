package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void clickOnViewHeatmapButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By viewHeatmap = By.xpath("//div[contains(text(),'View heatmap')]");
		driver.findElement(viewHeatmap).click();
		Reporter.log("User clicks on View Heatmap button.", true);
//		return driver.findElement(Button);
	}

}
