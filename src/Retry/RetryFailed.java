package Retry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailed 
{

	@Test
	public static void Retry()
	
	{    	
	        System.out.println("Failing Test Case1...");	
	        WebDriver wd=    new FirefoxDriver();	
		    wd.get("https://www.admiretheweb.com/articles/15-inspiring-website-drop-menus/");
	    	Assert.assertEquals("abc1", "abc", "Failed");
	    	
	    
	
	}

	@Test
	public static void Retry1()
	
	{    	
	        System.out.println("Failing Test Case2...");	
	    	Assert.assertEquals("abc1", "abc", "Failed");
	    
	
	}
	
	
	
}
