package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// this class is my Java login webpage
public class Login {

    private WebDriver driver;

    @FindBy(id="userName")
    public WebElement usernameInput;

    @FindBy(id="passWord")
    public WebElement passwordInput;

    @FindBy(id = "btn")
    public WebElement loginButton;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);  

    }

    public void enterUsername(String username){
        this.usernameInput.sendKeys(username);

    }

    public void enterPasswor(String password){
        this.passwordInput.sendKeys(password);
        
    }

    public void clickButton(){
        this.loginButton.click();
        
        
    }
}
