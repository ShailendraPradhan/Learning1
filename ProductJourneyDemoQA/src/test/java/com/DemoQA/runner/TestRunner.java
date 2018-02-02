package com.DemoQA.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resource"
		,glue={"src/main/java"}
		)
 
public class TestRunner {
 
}