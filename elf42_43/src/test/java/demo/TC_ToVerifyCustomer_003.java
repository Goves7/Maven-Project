package demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;
import genericLibrary.ReadData;
import genericLibrary.WebDriverUtility;
import pomRepository.HomePage;

public class TC_ToVerifyCustomer_003 extends BaseClass {

	@Test
	public void allCustomersInCreateProject() throws InterruptedException {
		HomePage Hp = new HomePage(driver);
		Hp.getTaskTab().click();
		Hp.getAddNewButton().click();
		Hp.getAddNewProjectLink().click();
		Hp.getEnterProjectNameTextField().sendKeys(ReadData.fromPropertyFile("project"));
		Hp.getCustomerSelectionDropDown().click();
		Hp.getNewCustomerOption().click();
		Thread.sleep(5000);
		Hp.getNewCustomerInNewProjectTextField().sendKeys(ReadData.fromPropertyFile("canara"));
		Thread.sleep(5000);
		WebDriverUtility wd = new WebDriverUtility();
		wd.scrollUsingJavaScript(driver);
		Thread.sleep(10000);
		Hp.getCreateProjectUnderCustomerButton().click();
		
//		int actualCustomers = select.getOptions().size();
//		SoftAssert sa= new SoftAssert();
//		sa.assertEquals(actualCustomers, 12, "");
//		
	}
}
