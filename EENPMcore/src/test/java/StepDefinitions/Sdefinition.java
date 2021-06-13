package StepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import StepDefinitions.NPMLogin;

public class Sdefinition {
	static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	NPMLogin obj1 = new NPMLogin();
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
	    //obj1.Setup();
	    //throw new io.cucumber.java.PendingException();
		System.out.println("user is on the login page");
	}

	@When("^user enters correct \"([^\"]*)\" and user enters corret \"([^\"]*)\"$")
	public void user_enters_correct_and_user_enters_corret(String arg1, String arg2) throws Throwable {
	   // obj1.Login("613687292","Apeksha@1994");
	    //throw new PendingException();
		System.out.println("user enters creds"+arg1+" and "+arg2);	
	}

	@When("^user clicks on the Manage KPI button$")
	public void user_clicks_on_the_Manage_KPI_button() {
	    //obj1.Manage();
	    //throw new io.cucumber.java.PendingException();
		System.out.println("clicks on manage api");
	}

	@Then("^user should be able to enter KPI name and description$")
	public void user_should_be_able_to_enter_KPI_name_and_description() {
	  // obj1.Creation();
	    //throw new io.cucumber.java.PendingException();
		System.out.println("able to enter KPI name and description");
	}

	@When("user clicks on the Configuration tab")
	public void user_clicks_on_the_Configuration_tab() {
	  // obj1.Config();
	    //throw new io.cucumber.java.PendingException();
		System.out.println("user clicks on the Configuration tab");
	}

	@When("user should be able to create a Formula")
	public void user_should_be_able_to_create_a_Formula() {
	  // obj1.Formula();
	    //throw new io.cucumber.java.PendingException();
		System.out.println("user should be able to create a Formula");
	}

	@When("the formula is created succesfully user should be able to click on the save button")
	public void the_formula_is_created_succesfully_user_should_be_able_to_click_on_the_save_button() {
	   //obj1.Save();
	    //throw new io.cucumber.java.PendingException();
		System.out.println("the formula is created succesfully user should be able to click on the save button");
	}
	
	@Then("^user should be able to edit the KPI$")
	public void user_should_be_able_to_edit_the_KPI() throws Throwable {
	  // obj1.Edit();
	    //throw new PendingException();
		System.out.println("user should be able to edit the KPI");
	}
	@When("^user clicks on admin settings and Create Dashboard$")
	public void user_clicks_on_admin_settings_and_Create_Dashboard() throws Throwable {
	   // obj1.Adminset();
		System.out.println("user clicks on admin settings and Create Dashboard");
	}

	@Then("^user should enter Dashboard name$")
	public void user_should_enter_Dashboard_name() throws Throwable {
	   //obj1.Dashname();
	    //throw new PendingException();
		System.out.println("user should enter Dashboard name");
	}

	@When("^user enters the Report Name")
	public void user_enters_the_Report_Name() throws Throwable {
	  // obj1.Rep1Name();
	    //throw new PendingException();
		System.out.println("user enters the Report Name");
	}

	@Then("^user should be able to add the requited reports to the Dashboard$")
	public void user_should_be_able_to_add_the_requited_reports_to_the_Dashboard() throws Throwable {
	   //obj1.Drag1();
	    //throw new PendingException();
	   System.out.println("user should be able to add the requited reports to the Dashboard");
	}

	@When("^the user clicks on Add another reports section$")
	public void the_user_clicks_on_Add_another_reports_section() throws Throwable {
	   //obj1.addmore();
	    //throw new PendingException();
		System.out.println("the user clicks on Add another reports section");
	}

	@Then("^user should be able to give Report Name$")
	public void user_should_be_able_to_give_Report_Name() throws Throwable {
	  // obj1.Rep2Name();
	    //throw new PendingException();
	   System.out.println("should be able to give Report Name");
	}

	@Then("^to add few more reports into another section and Create Dashboard$")
	public void to_add_few_more_reports_into_another_section_and_Create_Dashboard() throws Throwable {
	   // obj1.createdash();
	    //throw new PendingException();
		System.out.println("add few more reports into another section and Create Dashboard");
	}
	
	@Then("^User selects required access$")
	public void user_selects_required_access() throws Throwable {
	    //obj1.Access();
	    //throw new PendingException();
		System.out.println("selects required access");
}
}