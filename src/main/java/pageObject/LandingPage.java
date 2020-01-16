package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By Button=By.xpath("//div[contains(text(),'View heatmap')]");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public WebElement buttonclick()
	{
		return driver.findElement(Button);
	}
	
	
}

