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
		driver.get("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlcmltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsInZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9%22");		LandingPage landingPage= new LandingPage(driver);	
		landingPage.clickOnViewHeatmapButton();
		landingPage.heatMapPage();
		landingPage.moveToFrame();
	
	
	}
}
