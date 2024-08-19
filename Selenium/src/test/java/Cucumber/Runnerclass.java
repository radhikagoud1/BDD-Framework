package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features=	
	glue="Amazon_step_Defination",	
	tags=	
		)

public class Runnerclass extends AbstractTestNGCucumberTests {

}
