package com.VyTrack.Pages;

import com.VyTrack.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VecihleCostPage extends BasePage {

    @FindBy(xpath = "(//*[@class='btn-group'])[1]")
    public WebElement moreActions;

    @FindBy(css= "[title='Add attachment']")
    public WebElement addAttachment;

    @FindBy(css = "[type='file']")
    public WebElement chooseFile;

    @FindBy(tagName= "textarea")
    public WebElement commentBox;






    public void selectVehicle(int num){
        String path="//table//tbody/tr['"+num+"']";
        WebElement element= Driver.get().findElement(By.xpath(path));
        element.click();

    }


}
