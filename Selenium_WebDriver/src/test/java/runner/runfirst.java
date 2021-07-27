package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="featurebbd",glue="defstep")
public class runfirst extends AbstractTestNGCucumberTests{

}
