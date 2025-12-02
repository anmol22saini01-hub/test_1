package testCases;

import org.testng.annotations.Test;

import pageObjects.Home_page;
import pageObjects.Login_page;

public class Home_Test extends BaseTest{

Home_page home;
	
	@Test(priority=1)
	public void click_product() {
		home=new Home_page(driver);
		//login.enter_username("standard_user");
		home.product_action();
	}
	
	@Test(priority=2)
	public void click_cart() {
		home=new Home_page(driver);
		//login.enter_username("standard_user");
		home.cart_action();
	}
}
