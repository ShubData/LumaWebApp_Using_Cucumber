package stepdef;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.DashboardModule;
import modules.LoginModule1;
import testCases.TestBaseClass;
import org.junit.Assert;



public class StepDef1 {
	@Given("user open browser")
	public void user_open_browser() {
		TestBaseClass.setup();
	}
	@When("user enter username {string}")
	public void user_enter_username(String string) {
	  LoginModule1.enterUsername(TestBaseClass.driver, string);
	}
	@When("user enter password {string}")
	public void user_enter_password(String string) {
		LoginModule1.enterPassword(TestBaseClass.driver, string);
	    
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	    LoginModule1.clickLogin(TestBaseClass.driver);
	  
	}
	@Then("user should see dashboard page")
	public void user_should_see_dashboard_page() {
	  boolean br=  DashboardModule.verifyProductLabel(TestBaseClass.driver);

	//  Assert.assertTrue(br);
	  Assert.assertTrue("its not working", br);
	}
	@Then("user should see all menu")
	public void user_should_see_all_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
