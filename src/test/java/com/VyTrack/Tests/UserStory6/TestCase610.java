package com.VyTrack.Tests.UserStory6;

import com.VyTrack.Pages.DashboradPage;
import com.VyTrack.Pages.LoginPage;
import com.VyTrack.Pages.VecihleCostPage;
import com.VyTrack.Tests.TestBase;
import com.VyTrack.Utilities.BrowserUtils;
import com.VyTrack.Utilities.ConfigurationReader;
import com.VyTrack.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase610 extends TestBase  {

    @Test()
    public  void tets(){

//         Driver.get().get("https://qa2.vytrack.com/user/login");
//         BrowserUtils.waitFor(4);
//
//         Actions actions=new Actions(driver);
//
//         actions.click(new LoginPage().emailBox)
//                 .sendKeys("salesmanager101",Keys.TAB)
//                 .sendKeys("UserUser123",Keys.ENTER).perform();
//
//
//        BrowserUtils.waitFor(4);

        LoginPage loginPage=new LoginPage();
        loginPage.loginOptional("salesmanager");
        BrowserUtils.waitFor(4);


        Actions act=new Actions(driver);
        act.moveToElement(new DashboradPage().modules.get(1)).perform();
        BrowserUtils.waitFor(8);

        new DashboradPage().selectSubModule("Vehicle Costs");
        BrowserUtils.waitFor(10);

        //String expecteddUrl="https://qa2.vytrack.com/entity/Extend_Entity_VehiclesOdometer";
        //String actualUrl= driver.getCurrentUrl();
        //Assert.assertEquals(actualUrl,expecteddUrl);

        new VecihleCostPage().selectVehicle(5);
        BrowserUtils.waitFor(6);


       new VecihleCostPage().moreActions.click();
        BrowserUtils.waitFor(6);
       new VecihleCostPage().addAttachment.click();
       BrowserUtils.waitFor(4);

       //1 dynamic
      // String path="\"C:\\Users\\Gökhan\\Desktop\\trendyol.xlsx\"";
      // new VecihleCostPage().chooseFile.sendKeys(path);
       //2.

       String path1=System.getProperty("user.dir");
       String path2="src/test/resources/Spartans.xlsx";
       String   path3=path1+"/"+path2;
        new VecihleCostPage().chooseFile.sendKeys(path3);

       new  VecihleCostPage().commentBox.sendKeys("new work",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);












    }


}
