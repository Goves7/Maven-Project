package demo;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TC_Bikes_011_Test {

	@Test(groups = "Smoke")
	public void bikes(@Optional("firefox") String bname) {
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=null;
		if(bname.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(bname.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else {
			Reporter.log("Please pass a valid browser Name", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://kawasaki-india.com/");
		driver.quit();
	}	
}
