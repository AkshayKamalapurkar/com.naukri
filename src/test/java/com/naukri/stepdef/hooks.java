package com.naukri.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class hooks {
	public static WebDriver driver;

	@Before
	public void setup() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
//		opt.setHeadless(true);
//		opt.addArguments("--headless");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
	}

	@After
	public void embedScreenshot(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
			}
		driver.close();
		driver.quit();

}


}

