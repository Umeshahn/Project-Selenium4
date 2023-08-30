package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseTest;

public class DriverActions {
	 WebDriver driver = null;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public  WebDriver getDriver() {
		return driver;
	}
	
	public boolean initialize(String browser) {
		try {
			if(browser.toLowerCase().equals("chrome"))
				setDriver(new ChromeDriver());
			else if(browser.toLowerCase().equals("edge"))
				setDriver(new EdgeDriver());
			else
				System.out.println("Please Specify the browser");
		}catch (Exception e) {
			System.out.println("The error message is "+e.getMessage());
			return false;
		}
		return true;
	}
	
	public void urlLaunch() {
		try {
			driver.get(BaseTest.url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
		}
	}
	
	public void quit() {
		try {
			driver.quit();
		}catch (Exception e) {
			System.out.println("The error message is "+e.getMessage());
		}
	}
	
	public void initializeAndLaunch(String browser) {
		try {
			initialize(browser);
			urlLaunch();
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
		}
		
	}

}
