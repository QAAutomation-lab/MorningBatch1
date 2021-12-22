package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		 features = {"src/test/resources/features/GoogleSearch.feature"},//feature file folder name
			        glue = {"stepdefinitions"},//step definition package name
			       plugin = {"html:target/cucumber-html-report"},// reporting
			        monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
