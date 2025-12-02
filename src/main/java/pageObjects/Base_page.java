package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page {
	 WebDriver driver;
	 WebDriverWait wait_elt;
	
	public Base_page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		this.wait_elt = new WebDriverWait(driver, Duration.ofSeconds(40));
	}

}
