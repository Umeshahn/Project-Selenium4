package base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public static String url = null;
	
	@BeforeSuite
	@Parameters({"url"})
	public void setUp(@Optional("check the URL") String url) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		    System.setProperty("current.date.time", dateFormat.format(new Date()));
			BaseTest.url = url;
		}catch(Exception e) {
			System.out.println("The error message is "+e.getMessage());
		}
	}

}
