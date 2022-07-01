package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps{

    // user agnotic below
        @Given("the employee is on the login page")
        public void the_employee_is_on_the_login_page() {
            TestRunner.driver.get("File://C:/Users/swond/OneDrive/Desktop/Revature53122/automation-Project/bugcatcherautomation/src/test/resources/webPage/login-page.html");
    }

    @When("the employee clicks the login button")
    public void the_employee_clicks_the_login_button() {
        TestRunner.login.clickButton();
    }
    /* 
        manager steps below
    */
    @When("the manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
        TestRunner.login.enterUsername("use456");
    }

    @When("the manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        TestRunner.login.enterPasswor("root");
    }

    @Then("the manager should be logged in to the manager home page")
    public void the_manager_should_be_logged_in_to_the_manager_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("manager-page"));

        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("manager-page", title);
    }

   /*  Testers Steps

    */

        @When("the tester enters his correct username")
    public void the_tester_enters_his_correct_username() {
        TestRunner.login.enterUsername("rore");
    }
    @When("the tester enters his correct password")
    public void the_tester_enters_his_correct_password() {
        TestRunner.login.enterPasswor("root");
    }

    @Then("the tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_tester_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));

        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Tester Page", title);
       
    }
    
}