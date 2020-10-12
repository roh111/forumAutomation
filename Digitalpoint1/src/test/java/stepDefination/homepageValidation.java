package stepDefination;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.browserEngine;
import Utilities.logcollector;
import Utilities.testdata;
@RunWith(Cucumber.class)



public class homepageValidation {
	public static WebDriver driver;

    @Given("^Home page of the forum web site$")
    public void home_page_of_the_forum_web_site() throws Throwable {
    	driver=browserEngine.getBrowser();
    	
    }

    @When("^user launch the home page$")
    public void user_launch_the_home_page() throws Throwable {
    	
    	driver.get("https://forum.digitalpoint.tech/user/index.php/login");
        driver.findElement(By.name("email")).sendKeys(testdata.logID);
    	driver.findElement(By.name("password")).sendKeys(testdata.Pass);
    	driver.findElement(By.xpath(testdata.signBT)).click();
    	driver.findElement(By.xpath(testdata.logoutDRP)).click();
    	driver.findElement(By.xpath(testdata.LogoutBT)).click();
    	System.out.println("Application opened successfully");
    	logcollector.debug("Opened with log successfully");
  
    	
    	
    }

    @Then("^Home page loaded$")
    public void home_page_loaded() throws Throwable {
    	 System.out.println("application opened successfully");
         logcollector.debug("application opened successfully");
       
          
    }

    @And("^Title check completed successfully$")
    public void title_check_completed_successfully() throws Throwable {
    	String homepageEtitle= "Digital Point - Forum | User Login";
    	String homepageAtitle= driver.getTitle();
    	Assert.assertEquals(homepageEtitle, homepageAtitle);
    	System.out.println("Assert command completed successfully");
    	logcollector.debug("Assert command competed successfully");
    	//driver.close();
    	
    	


    

 
    }
	
	
	
	
	
	
	
	
	
	
	
}
