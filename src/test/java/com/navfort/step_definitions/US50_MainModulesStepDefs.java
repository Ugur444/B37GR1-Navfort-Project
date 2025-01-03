package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.MainModulesPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US50_MainModulesStepDefs {

    LoginPage loginPage = new LoginPage();
    MainModulesPage mainModulesPage = new MainModulesPage();



    @Then("user should be able to access all the following modules")
    public void userShouldBeAbleToAccessAllTheFollowingModules(List<String> expectedModules) {
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.sleep(2);
        List<String> actualModules = BrowserUtils.getElementsText(mainModulesPage.allModules);
        System.out.println("actualModules = " + actualModules);
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedModules,actualModules);


    }


    @Then("user should be able to access four module names")
    public void userShouldBeAbleToAccessModuleNames(List<String>expectedModules) {
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.sleep(2);

        List<String> actualModules = BrowserUtils.getElementsText(mainModulesPage.driverModuleNames);



        Assert.assertEquals(expectedModules,actualModules);



    }



}
