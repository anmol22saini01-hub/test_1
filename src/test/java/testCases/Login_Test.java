package testCases;

import org.testng.annotations.Test;

import org.testng.Assert;
import pageObjects.Login_page;

public class Login_Test extends BaseTest  {
	Login_page login;
	
	@Test(priority=1)
	public void enter_username() {
		login=new Login_page(driver);
		//login.enter_username("standard_user");
		login.enter_username(prop.getProperty("username"));
	}
	
	@Test(priority=2)
	public void enter_password() {
		login=new Login_page(driver);
		//login.enter_password("secret_sauce");
		login.enter_password(prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void click_submit() {
		login=new Login_page(driver);
		login.enter_submit_button();
		Assert.assertTrue(login.check_url(),"Login failed");
	}

}
