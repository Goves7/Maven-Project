package actiTimeProject;

import org.junit.Test;
import org.testng.Reporter;

import genericLibrary.BaseClass;
import pomRepository.HomePage;

public class TC_CreateNewCustomer_002 extends BaseClass {

	@Test
	public void createCustomer() {
		HomePage Hp= new HomePage(driver);
		Hp.getTaskTab().click();
		Hp.getAddNewButton().click();
		Hp.getAddNewCustomerLink().click();
		Hp.getCreateCustomerButton().click();
		String errorMessage = Hp.getEmptyCustomerNameMessage().getText();
		Reporter.log(errorMessage, true);
	}
}
