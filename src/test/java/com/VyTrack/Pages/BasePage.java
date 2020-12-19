package com.VyTrack.Pages;

import com.VyTrack.Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public  BasePage(){

      PageFactory.initElements(Driver.get(),this);

    }


}
