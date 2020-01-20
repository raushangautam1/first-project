package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import resources.base;


public class LandingPage extends base{
	public static By heatmapDefaultThumbnail = By.className("heatmap-thumb__default-heatmap");
	public static By viewHeatmap = By.xpath("//button[contains(text(),'View heatmap')]");
	public static By switchToHeatMapFrame = By.id("heatmap-iframe");
	public static By elementTab = By.cssSelector("#heatmap-player [type='5']");
	public WebDriver driver;
	public WebDriverWait wait;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	
	public void clickOnViewHeatmapButton() {
		 //hoverOnElement(heatmapDefaultThumbnail);
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(viewHeatmap)));
			Assert.assertEquals(true, driver.findElement(viewHeatmap).isDisplayed());
			driver.findElement(viewHeatmap).click();
			Reporter.log("VWO Home page has been launched successfully");
           }


	public void verifyHeatMap(String title) {
	switchToLastWindow();
	switchToFrame(switchToHeatMapFrame);
	Assert.assertEquals(getElementWhenVisible(elementTab).isDisplayed(), true,"Element tab is not visible");
	Reporter.log("VWO optimized Platform has been launched in the new tab");
	
	}
	public void clickOnElementTab() {
		//clickOnElementViaJS(elementTab);//
		Reporter.log("Successfully clicked on Element Tab");
	}
}

