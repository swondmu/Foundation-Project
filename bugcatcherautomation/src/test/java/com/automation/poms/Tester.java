package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {

    @FindBy(id = "table1")
    public WebElement tableInput;

    @FindBy(id = "defects")
    public WebElement testerInput;

    @FindBy(id = "pendingsubmitbutton")
    public WebElement submitButton;

    private Object statusInput;

    public Tester(WebDriver driver){
        PageFactory.initElements(driver,this); 
    }

    public void enterTable(String table){
        this.tableInput.sendKeys(table);

    }
    public void enterStatus(String Status){
        ((WebElement) this.statusInput).sendKeys(Status);

    }

    public void clickAssignBtn(){
        this.submitButton.click(); 
    
}

    public void enterAccept(String string) {
    }

    public void enterFixed(String string) {
    }
}
