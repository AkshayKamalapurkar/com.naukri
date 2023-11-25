package com.naukri.stepdef;

import org.openqa.selenium.WebDriver;

import com.naukri.pages.Home;
import com.naukri.pages.Login;
import com.naukri.pages.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdatePortal {

	public WebDriver driver;
	public Login loginPage;
	public Home homepage;
	public Logout logout;

	@Given("Launch Browser")
	public void launch_browser() {
		driver = hooks.driver;
		loginPage = new Login(driver);
		homepage = new Home(driver);
		logout = new Logout(driver);
	}

	@Given("User navigates to loginpage")
	public void login_page_is_displayed() {

	}

	@When("enter valid username {string}")
	public void enter_a_username(String username) {

		loginPage.clicklogin();
		loginPage.setUsername(username);

	}

	@When("enter valid password {string}")
	public void enter_a_password(String password) {
		loginPage.setPassword(password);

	}

	@Then("click on login button")
	public void click_submit_button() {
		loginPage.clickSubmit();

	}
	
	@And("click on profileableEditHeadline")
	public void click_viewprofile()  {
		homepage.viewProfile();
	}
	
	@Then("click on logout")
	public void logout() throws Exception {
		logout.viewprofile_logout();
	}

}
