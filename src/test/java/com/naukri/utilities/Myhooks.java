package com.naukri.utilities;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Myhooks {
	public static WebDriver driver;

	@Before
	public static WebDriver setup() {
		// ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("--disable-notifications");

//		WebDriverManager.
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.naukri.com/");
		return driver;
	}

	@After
	public void Setup() {
		driver.quit();
		System.out.println("Closing browser");
	}
}
