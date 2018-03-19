package com.application.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="application.feature",
		glue={"com.application.stepdefination"},
		monochrome=true
		)

public class StepRunner {


}