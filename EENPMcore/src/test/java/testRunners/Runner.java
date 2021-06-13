package testRunners;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "FeatureFiles"
		 ,glue={"StepDefinitions"},
		 plugin = {"pretty","json:target/cucumber.json","html:target/htmlreport"} 
		)

public class Runner {
	
	
}


//@CucumberOptions(features = {"src/test/java/features"}, glue = {"steps"})