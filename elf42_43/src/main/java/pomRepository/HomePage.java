package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	@FindBy(id="container_tasks")
	private WebElement taskTab;
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Project']")
     private WebElement addNewProjectLink;
	
	
	@FindBy(xpath="//div[text()='+ New Customer']")
    private WebElement addNewCustomerLink;
	
	
	@FindBy(css="input[class^='projectNameField']")
	private WebElement enterProjectNameTextField;
	
	
	@FindBy(css="input[class^='inputFieldWithPlaceholder']")
	private WebElement enterCustomerNameTextField;
	
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerSelectionDropDown;

	@FindBy(xpath="//div[text()='Customer:']/../..//div[text()='shell']")
    private WebElement customerNameFromDropdown;
	
	
	@FindBy(xpath="//div[text()='Create Project']")
    private WebElement createProjectUnderCustomerButton;
	
	@FindBy(xpath="((//div[@class='itemRow 'and text()='-- New Customer --']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @tabindex='2']")
	private WebElement newCustomerInNewProjectTextField;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement customersSearchBox;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerButton;
	
	@FindBy(xpath="Customer name cannot be empty")
	private WebElement emptyCustomerNameMessage;
	
	
	public WebElement getEmptyCustomerNameMessage() {
		return emptyCustomerNameMessage;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCustomersSearchBox() {
		return customersSearchBox;
	}

	public WebElement getNewCustomerInNewProjectTextField() {
		return newCustomerInNewProjectTextField;
	}

	public WebElement getAddNewCustomerLink() {
		return addNewCustomerLink;
	}
	
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getCreateProjectUnderCustomerButton() {
		return createProjectUnderCustomerButton;
	}

	public WebElement getCustomerSelectionDropDown() {
		return customerSelectionDropDown;
	}

	public WebElement getCustomerNameFromDropdown() {
		return customerNameFromDropdown;
	}

	public WebElement getTaskTab() {
		return taskTab;
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getAddNewProjectLink() {
		return addNewProjectLink;
	}

	public WebElement getEnterProjectNameTextField() {
		return enterProjectNameTextField;
	}

	public WebElement getEnterCustomerNameTextField() {
		return enterCustomerNameTextField;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
