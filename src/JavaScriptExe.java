import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class JavaScriptExe {

	public static void main(String[] args) 
	{

	
	 FirefoxDriver fd=   new FirefoxDriver();
	 fd.get("https://www.youtube.com/watch?v=DeNjIFAaqRc");
	 fd.manage().window().maximize();
	 ((JavascriptExecutor)fd).executeScript("scroll(0,-8400)");
	 WebElement el= fd.findElement(By.id("eow-title"));
	 ((JavascriptExecutor)fd).executeScript("arguments[0].setAttribute('style,'border: solid 2px red;');",el);
	 
	}

}
