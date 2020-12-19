package com.VyTrack.Pages;

import com.VyTrack.Utilities.BrowserUtils;
import com.VyTrack.Utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput")
    public WebElement emailBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement submitButton;


    public void loginOptional(String userType){
        String username;
        String password;
        switch (userType) {
            case "storemanager":
                username= ConfigurationReader.get("storemanager_username");
                password= ConfigurationReader.get("storemanager_password");
                break;
            case "salesmanager":
                username= ConfigurationReader.get("salesmanager_username");
                password= ConfigurationReader.get("salesmanager_password");
                break;
            case "driver":
                username= ConfigurationReader.get("driver_username");
                password= ConfigurationReader.get("driver_password");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userType);
        }
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }


    }



