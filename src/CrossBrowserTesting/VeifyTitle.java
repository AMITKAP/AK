package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VeifyTitle 
{
  
	WebDriver driver ;
	
	@Parameters("browser")
	@Test
	public void VeriFyTitle(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.navigate().to("https://google.com");
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();

			
		}
		
		else if(browsername.equalsIgnoreCase("ie"))
		{
			
			System.setProperty("webdriver.ie.driver","C:\\Drivers\\IEDriverServer.exe");
			driver =new InternetExplorerDriver();

		}

		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.quit();
		
		
	}




}
