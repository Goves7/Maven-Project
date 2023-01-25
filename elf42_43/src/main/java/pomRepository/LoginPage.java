package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseClass;

public class LoginPage {

	public LoginPage ( WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username")
	 private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	 private WebElement pwdTextfield; 
	
	@FindBy(id="loginButton")
	 private WebElement loginButton; 
	
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPwdTextfield() {
		return pwdTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	public void loginToPage(String userName,String password){
		usernameTextfield.sendKeys(userName);
		pwdTextfield.sendKeys(password);
		loginButton.click();
	}
}
