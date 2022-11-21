package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;

	private static WebDriver driver;

	private static WebDriverWait waitDriver;


	public SeleniumDriver() {
		
		
		System.setProperty("webdriver.chrome.driver", "/home/oleks/eclipse-workspace2/ProductStore/src/main/resources/executables/chromedriver");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	System.out.println(driver);

		
		
	}
	   public static void openPage(String websiteURL) {
	    	System.out.println(websiteURL);
	    	System.out.println(driver);
	        driver.get(websiteURL);
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }

	    public static void setUpDriver() {
	       if (seleniumDriver == null) {
	            seleniumDriver = new SeleniumDriver();
	       }
	    }

	    public static void tearDown() {
	        if (driver != null) {
	            driver.close();
	            driver.quit();
	        }
	        seleniumDriver = null;
	    }
	    public static void waitForPageToLoad()
	    {
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
	    }
}
