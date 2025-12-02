package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	
	
	@BeforeSuite
	public void set_up() throws IOException {
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--incognito");                 // incognito
	     options.addArguments("--disable-notifications");     // block notifications
	     options.addArguments("start-maximized");
	     
		driver= new ChromeDriver();
		FileInputStream file= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\configuration\\config.properties");
		prop= new Properties();
		prop.load(file);
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	}
	
	@AfterSuite
	public void set_up_close() {
		//driver.quit();
		
	
		
	}
	
	
	

}
