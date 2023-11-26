package com.naukri.testscript;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/updateprofile.feature",
glue = { "com.naukri.stepdef" }, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

//tags ="smoke",
  //dryRun = true,
//		publish = true

public class TestRunner extends AbstractTestNGCucumberTests {

	@DataProvider
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
