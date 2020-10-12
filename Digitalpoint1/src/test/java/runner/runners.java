package runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\features",
	
	glue= {"stepDefination"},
	
			plugin = {"pretty", "html:target/htmlreports", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
					
	monochrome = true, //display the console output in a proper readable format
	strict = true, //it will check if any step is not defined in step definition file
	dryRun = false //to check the mapping is proper between feature file and step def file
	//tags = {"@regressiontest"}
	)

public class runners {
	

	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));

}
}
