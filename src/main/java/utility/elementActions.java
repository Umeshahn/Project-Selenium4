package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementActions {

	private WebDriver driver = null;
	
	public static boolean click(WebDriver driver, WebElement element, String elementDescription) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	public static boolean click(WebDriver driver, By element, String elementDescription) {
		try {
			driver.findElement(element).click();
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	public static boolean enterwithclear(WebDriver driver, WebElement element, String text, String elementDescription) {
		try {
			element.sendKeys(text);
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	public static boolean enterwithclear(WebDriver driver, By element, String text, String elementDescription) {
		try {
			driver.findElement(element).sendKeys(text);
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
}
