package com.naukri.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	@CacheLookup
	private WebElement user_username;

	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	@CacheLookup
	private WebElement user_password;

	@FindBy(xpath = "//a[@id='login_Layer']")
	@CacheLookup
	private WebElement btnLogin;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	@CacheLookup
	private WebElement btnSubmit;

	public void setUsername(String username) {
		user_username.sendKeys(username);
	}

	public void setPassword(String password) {
		user_password.sendKeys(password);
	}

	public void clicklogin() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		ele.click();
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	// Login Button
	// driver.findElement(By.xpath("//a[@id='login_Layer']")).click();

	// EMAIL ID
	// driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID
	// / Username']")).sendKeys("Shubhampanegaon@gmail.com");

	// Password
	// driver.findElement(By.xpath("//input[@placeholder='Enter your
	// password']")).sendKeys("Sunitha@1994");

	// Submit

	// driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

}
