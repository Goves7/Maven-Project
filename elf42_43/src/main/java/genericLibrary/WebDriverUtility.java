package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public void scrollUsingJavaScript(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,1000)");
	}
	
	public void javscriptclickUsingJavaScript(WebDriver driver,WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",element);
	}
	
	public void waitForTitle(WebDriver driver, String completeTitle) {
		WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(15));
		explicitWait.until(ExpectedConditions.titleIs(completeTitle));
	}

}
