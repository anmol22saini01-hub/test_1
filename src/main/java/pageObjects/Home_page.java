package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_page {
	
	 WebDriver driver;
	 WebDriverWait wait_elt;
	
	@FindBy(xpath="//a[@id='item_5_title_link']")
	WebElement product;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement cart_button;
	
	public Home_page(WebDriver driver) {
		this.driver= driver;
		wait_elt = new WebDriverWait(driver, Duration.ofSeconds(40));
		PageFactory.initElements(driver, this);
	}
	
	public void waitDisplay(WebElement element) {
		wait_elt.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void product_action() {
		waitDisplay(product);
		product.click();
	}
	
	public void cart_action() {
		waitDisplay(cart_button);
		cart_button.click();
		
	}

}
