package pageObject;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class ElementPage {

		public WebDriver driver;
		By ID=By.id("id=\"heatmap-iframe\"");
		By Text= By.xpath("//*[@id=\"option-section\"]/div[6]/span");
		
		
		public LandingPage(WebDriver driver) {
			this.driver=driver;
			// TODO Auto-generated constructor stub
		}

		public WebElement CheckElement()
		{
			return driver.findElement(ID);
		}
	
		public WebElement FindElemet()
		{
			return driver.findElement(Text);
		}
		
		
	}

