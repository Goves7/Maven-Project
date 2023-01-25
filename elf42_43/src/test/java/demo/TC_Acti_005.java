package demo;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;
import genericLibrary.ReadData;
import genericLibrary.WebDriverUtility;
import pomRepository.HomePage;

public class TC_Acti_005 extends BaseClass {

	String expectedCustomerName=ReadData.fromPropertyFile("customername1");
	SoftAssert sa= new SoftAssert();

@Test	
public void verifyCustomerCreation() throws InterruptedException {
	
	HomePage Hp=new HomePage(driver);
	Hp.getTaskTab().click();
	Hp.getAddNewButton().click();
	Hp.getAddNewCustomerLink().click();
	Hp.getEnterCustomerNameTextField().sendKeys(ReadData.fromPropertyFile("customername1"));
	
	WebDriverUtility wd= new WebDriverUtility();
	wd.scrollUsingJavaScript(driver);
	Thread.sleep(5000);
	Hp.getCreateCustomerButton().click();
	Hp.getCustomersSearchBox().click();
	Thread.sleep(5000);
	Hp.getCustomersSearchBox().sendKeys(ReadData.fromPropertyFile("customername1"));
	
	
}
}
