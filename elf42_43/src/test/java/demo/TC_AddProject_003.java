package demo;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ReadData;
import genericLibrary.WebDriverUtility;
import pomRepository.HomePage;

public class TC_AddProject_003 extends BaseClass{

	@Test
	public void addProject() throws InterruptedException {
		HomePage Hp= new HomePage(driver);
		Hp.getTaskTab().click();
		Hp.getAddNewButton().click();
		Hp.getAddNewProjectLink().click();
		Hp.getEnterProjectNameTextField().sendKeys(ReadData.fromPropertyFile("project"));
		Hp.getCustomerSelectionDropDown().click();
		Hp.getCustomerNameFromDropdown().click();
		WebDriverUtility wd=new WebDriverUtility();
		wd.scrollUsingJavaScript(driver);
		Thread.sleep(10000);
		Hp.getCreateProjectUnderCustomerButton().click();
	}
}
