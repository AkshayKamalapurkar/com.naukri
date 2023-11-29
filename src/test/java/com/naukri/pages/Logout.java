package com.naukri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver driver;
	public Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='nI-gNb-drawer__icon']")
	@CacheLookup
	private WebElement btn_viewprofile;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	@CacheLookup
	private WebElement btn_logout;
	
	
	public void viewprofile_logout() throws Exception {
		btn_viewprofile.click();
		btn_logout.click();
	}
	
	//click on profile
			//driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
			
			//click on logout
		//	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	
}
