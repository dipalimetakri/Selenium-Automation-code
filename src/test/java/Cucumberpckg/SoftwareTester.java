package Cucumberpckg;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareTester {
	
	@Given("^I am a \"([a-zA-Z]{1,})\" software tester$")
	public void I_am_a_Good_software_tester(String SoftwareType){
		System.out.println("<<--I am a "+SoftwareType + "software tester");
	}
	
	@When("^I go to work$")
	public void I_go_to_work() {
		System.out.println("<<--I go to work ");
     
	}
	//\"([^\"]*)\"  -  It accept any type of value alphabet,no,character,special character
	//\"([a-zA-Z]{1,})\" - It accept only higher and lower letter
	
	@And("^I \"([^\"]*)\" with it$")
	
	public void I_involve_with_it(String Worktype) {
		System.out.println("I"+Worktype +"with_it");
	}
	
	@Then("^My boss \"([a-zA-Z]{1,})\" me$")
	public void My_boss_loves_me(String BossReaction) {
		System.out.println("My boss "+BossReaction +" me");
		
	}

}
