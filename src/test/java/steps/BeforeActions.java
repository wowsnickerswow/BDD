package steps;




import io.cucumber.java.BeforeAll;
import utils.SeleniumDriver;

public class BeforeActions  {

	@BeforeAll
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}