package com.naukri.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[normalize-space()='View profile']")
	@CacheLookup
	private WebElement btn_view_profile;
	
	@FindBy(xpath="//span[contains(text(),'Resume headline')]//following-sibling::span")
	@CacheLookup
	private WebElement txt_resume_headline;
	
	
	@FindBy(xpath="//textarea[@id='resumeHeadlineTxt']")
	@CacheLookup
	private WebElement txt_resume_headline_text;
	
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	private WebElement btn_save;
	
	public void viewProfile()
	{
		btn_view_profile.click();
		txt_resume_headline.click();
		txt_resume_headline_text.sendKeys(".");
		btn_save.click();
	}
	
	
	//click on view profile
			//driver.findElement(By.xpath("//a[normalize-space()='View profile']")).click();
			
			//click on Resume headline
			//driver.findElement(By.xpath("//span[contains(text(),'Resume headline')]//following-sibling::span")).click();
			
			//text box enter .
			//driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']")).sendKeys(".");
			
			//save on entering details
			//driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			
			//click on profile
			//driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
			
			//click on logout
			//driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

}
