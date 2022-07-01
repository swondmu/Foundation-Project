package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testerSteps {

    @Given("the tester logged in the homepage")
public void the_tester_logged_in_the_homepage() {
    TestRunner.driver.get("File://C:/Users/swond/OneDrive/Desktop/Revature53122/automation-Project/bugcatcherautomation/src/test/resources/webPage/tester-example.html");
    
}


@When("the tester accept or decline assigned defect")
public void the_tester_accept_or_decline_assigned_defect() {
    TestRunner.tester.enterAccept("accept"); 
}
@When("the tester has to work on defects")
public void the_tester_has_to_work_on_defects() {
    TestRunner.tester.enterFixed("status");
}
@When("the tester see a status change")
public void the_tester_see_a_status_change() {
    TestRunner.clickSubmitbutton();

}
@Then("the tester has update defects")
public void the_tester_has_update_defects() {
    
    TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));
    String text = TestRunner.driver.getTitle();
    Assert.assertEquals("Tester Page",text);

}
    
}
