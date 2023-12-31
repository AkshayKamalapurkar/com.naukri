package com.naukri.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

public class Home {
    public WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[normalize-space()='View profile']")
    @CacheLookup
    private WebElement btn_view_profile;

    @FindBy(xpath = "//span[contains(text(),'Resume headline')]//following-sibling::span")
    @CacheLookup
    private WebElement txt_resume_headline;


    @FindBy(xpath = "//textarea[@id='resumeHeadlineTxt']")
    @CacheLookup
    private WebElement txt_resume_headline_text;


    @FindBy(xpath = "//button[normalize-space()='Save']")
    @CacheLookup
    private WebElement btn_save;

    @FindBy(xpath = "//input[@id='attachCV']")
    @CacheLookup
    private WebElement updateResume;

    @FindBy(xpath = "//span[@class='fullname']")
    @CacheLookup
    private WebElement ProfileName;


    public void viewProfile() {

        btn_view_profile.click();
        txt_resume_headline.click();
        txt_resume_headline_text.sendKeys(".");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btn_save));
        ele.click();
        updateResume();
    }

    public void updateResume() {
        File uploadFile;
        String names = ProfileName.getText().trim();
        switch (names) {
            case "Shubham Eknath Panegaon":
                uploadFile = new File("src/test/resources/naukriresumes/Shubham79.pdf");
                updateResume.sendKeys(uploadFile.getAbsolutePath());
                break;

            case "Shubham Panegaon":
                uploadFile = new File("src/test/resources/naukriresumes/ShubhamStorage.pdf");
                updateResume.sendKeys(uploadFile.getAbsolutePath());
                break;

            case "Ashrita Honnungar":
                uploadFile = new File("src/test/resources/naukriresumes/ASHRITA_HONNUNGAR_CV.docx");
                updateResume.sendKeys(uploadFile.getAbsolutePath());
                break;
            default:
                Assert.assertTrue(false);
                System.out.println("Names did not match");
        }
    }


}
