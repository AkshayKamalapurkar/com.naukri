package com.naukri.utilities;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import java.time.Duration;
import java.time.Duration;

public class hooks {
	public static WebDriver driver;

	@Before
	public void setup() {
	System.out.println("In Set up");
	}

	@After
	public  void Teardown() {
		driver.quit();
		System.out.println("Closing browser");
	}

	public static WebDriver LaunchBrowser()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		//FirefoxProfile fx = new FirefoxProfile();
		//fx.setPreference("dom.webnotifications.enabled",false);
//		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
		return driver;
	}
}
