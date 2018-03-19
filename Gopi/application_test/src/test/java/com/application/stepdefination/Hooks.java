package com.application.stepdefination;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.ITestResult;

import com.application.declaration.WrapperClassApp;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends WrapperClassApp {
	
	@Before
	public void openbrowser() throws FileNotFoundException, IOException
	{
		loadObjects();
		invokeApp("chrome");
	}
	
	@After
	public void closebrowser()
	{
		//results.getStatus();
		driver.close();
		driver.get("file:///E:/Gopi/application_test/reports/result.html");
	}

}
