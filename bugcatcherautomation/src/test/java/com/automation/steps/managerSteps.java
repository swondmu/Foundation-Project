package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class managerSteps {

    @Given("the manager on the manager page")
public void the_manager_on_the_manager_page() {
    TestRunner.driver.get("File://C:/Users/swond/OneDrive/Desktop/Revature53122/automation-Project/bugcatcherautomation/src/test/resources/webPage/manager-page.html");
}


@When("the manager enters a defect name")
public void the_manager_enters_a_defect_name() {
    TestRunner.manager.enterDefect("loginDefect");
    
}
@When("the manager enters a tester name")
public void the_manager_enters_a_tester_name() {
    TestRunner.manager.enterTester("rore");
    
}
@When("the manager clicks the assign button")
public void the_manager_clicks_the_assign_button() {
    TestRunner.manager.clickAssignBtn();
    
}
@Then("the manager see an alert defect has been assign")
public void the_manager_see_an_alert_defect_has_been_assign() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    String text = TestRunner.driver.switchTo().alert().getText();
    Assert.assertEquals("Tester successfully assigned to Defect", text);
    TestRunner.driver.switchTo().alert().accept();
    
}

}
