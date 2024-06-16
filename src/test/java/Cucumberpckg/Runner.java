package Cucumberpckg;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
	 //   plugin = {"html:target/cucumber-htmll-report.html","pretty"},//Pretty is used to print the gherkin with additional colours
	    //to create report need to give path and name of report target-folder 
	 //   monochrome=true,  ///it will remove unreadable character
	   features="src/test/java/Cucumberpckg", // to give path offeature file location
	   glue="Cucumberpckg",
	   //  to give the path for  step definations
	  tags="@Ninja" ///Its like grouping if we want to group the scenario and run use tags e,g @smoke 
	    
	    
	)
public class Runner {
	
		

}
