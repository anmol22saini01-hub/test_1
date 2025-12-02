package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
	 protected WebDriver driver;
	 WebDriverWait wait_elt;
	
	@FindBy(id="user-name")
	WebElement user_name;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login-button")
	WebElement submit;
	
	
	public Login_page(WebDriver driver) {
		this.driver= driver;
		wait_elt = new WebDriverWait(driver, Duration.ofSeconds(40));
		PageFactory.initElements(driver, this);
	}
	
	public void waitDisplay(WebElement element) {
		wait_elt.until(ExpectedConditions.visibilityOf(element));
		//wait_elt = new WebDriverWait(driver, Duration.ofSeconds(40));
	}
	
	public void enter_username(String u_name) {
		waitDisplay(user_name);
		user_name.sendKeys(u_name);
	}
	
	public void enter_password(String p_name) {
		waitDisplay(password);
		password.sendKeys(p_name);
	}
	
	public void enter_submit_button() {
		waitDisplay(submit);
		submit.click();
	}
	
	public boolean check_url()
	{
		return driver.getCurrentUrl().contains("inventory");
	}
	
	
	
}
