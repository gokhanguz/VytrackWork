package com.VyTrack.Pages;

import com.VyTrack.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboradPage extends BasePage{


    @FindBy(css = "[class='title title-level-1']")
    public List<WebElement>  modules;


    public void selectSubModule(String ModuleName){

        String path="//*[text()='"+ModuleName+"']";

       WebElement element= Driver.get().findElement(By.xpath(path));
       element.click();

    }






}




