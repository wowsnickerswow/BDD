package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;


import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "steps", plugin = { "pretty",
		"json:targer/RunCucumber/cucumber/json", "html:targer/RunCucumber/cucumber.html",
		})

public class RunCucumber extends AbstractTestNGCucumberTests {

	public static void setup() {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir") + "\\target\\Extent_Reports\\" + strDate + ".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);

		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-confix.xml"));

		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "106.52 ");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "4.0");
//		Map systemInfo = new HashMap();
//
//		ExtentCucumberFormatter.addSystemInfo(systemInfo);

	}

}
