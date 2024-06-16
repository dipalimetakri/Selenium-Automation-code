package Cucumberpckg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/Cucumberpckg",
		glue="Cucumberpckg",
		tags="@Register"
		)



public class TestNGRunner extends AbstractTestNGCucumberTests {

}
