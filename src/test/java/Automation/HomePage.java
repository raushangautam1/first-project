package Automation;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class HomePage extends base{

	@Test
	public void homePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get(initializeDriver1());		
		LandingPage landingPage= new LandingPage(driver);	
		landingPage.clickOnViewHeatmapButton();
		landingPage.heatMapPage();
		landingPage.moveToFrame();
	
	
	}
}
