package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utility.elementActions;

public class LoginPage {
	
	private WebDriver driver = null;
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	/**
	 * Start - Page Elements
	 */
	
	@FindBy(id = "okta-signin-username")
	private WebElement loginUsernameTxt;
	
	@FindBy(id = "okta-signin-password")
	private WebElement loginPasswordTxt;
	
	@FindBy(id = "okta-signin-submit")
	private WebElement signInBtn;
	
	@FindBy(id = "auth-org-logo")
	private WebElement loginLogo;
	
	/**
	 * End - Page Elements
	 */
	
	
	
	/** 
	 * To pass the user name
	 * @return boolean
	 */
	public boolean enterLoginUsername(String username) {
		try {
			elementActions.enterwithclear(driver, loginUsernameTxt, username, "Username Text Field");
		}catch(Exception e) {
			System.out.print("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	/** 
	 * To pass the user password
	 * @return boolean
	 */
	public boolean enterLoginPassword(String password) {
		try {
			elementActions.enterwithclear(driver, loginPasswordTxt, password, "Password Text Field");
		}catch(Exception e) {
			System.out.print("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	/** 
	 * To click on sign In 
	 * @return boolean
	 */
	public boolean clickOnSignIn() {
		try {
			elementActions.click(driver, signInBtn, "Sign In Button");
		}catch(Exception e) {
			System.out.print("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	/** 
	 * To verify the user name
	 * @return boolean
	 */
	public boolean verifyLoginUsername() {
		try {
			
		}catch(Exception e) {
			System.out.print("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	/** 
	 * To verify the user password
	 * @return boolean
	 */
	public boolean verifyLoginPassword() {
		try {
			
		}catch(Exception e) {
			System.out.print("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	/** 
	 * To verify the sign In 
	 * @return boolean
	 */
	public boolean verifySignIn() {
		try {
			
		}catch(Exception e) {
			System.out.print("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	
}
