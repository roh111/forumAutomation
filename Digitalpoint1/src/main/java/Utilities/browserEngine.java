package Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
 
	public static WebDriver driver;
	
	
	//@Given
	public static WebDriver getBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", testdata.cpath);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	
	

	
	
}
