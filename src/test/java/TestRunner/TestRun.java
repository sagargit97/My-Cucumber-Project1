package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources/Features/Login.feature",
glue = "StepDef",
plugin ={ "pretty","html:target/cucumber.html"})

public class TestRun extends AbstractTestNGCucumberTests {





}
