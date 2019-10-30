package myRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\s.srinadhuni\\eclipse-workspace\\Selenium_Nextgen\\cucjenkins\\features", 
glue={"stepDefs"},
monochrome=true,
plugin= {"pretty","json:target/cucumber.json"}
			)

public class myRunner {

}

