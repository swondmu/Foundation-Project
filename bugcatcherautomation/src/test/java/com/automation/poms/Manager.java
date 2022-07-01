package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    @FindBy(id = "defect")
    public WebElement defectInput;

    @FindBy(id = "tname")
    public WebElement testerInput;

    @FindBy(id = "assignBt")
    public WebElement assignButton;

    public Manager(WebDriver driver){
        PageFactory.initElements(driver,this); 
    }

    public void enterDefect(String defect){
        this.defectInput.sendKeys(defect);
    }

    public void enterTester(String tester){
        this.testerInput.sendKeys(tester);
    } 

    public void clickAssignBtn(){
      this.assignButton.click(); 
       
    }

    
}
