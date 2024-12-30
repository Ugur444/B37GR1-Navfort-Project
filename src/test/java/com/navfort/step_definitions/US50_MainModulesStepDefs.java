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
        BrowserUtils.sleep(2);
        List<String> actualModules = BrowserUtils.getElementsText(mainModulesPage.allModules);

        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedModules,actualModules);


    }


    @Then("user should be able to access {int} module names")
    public void userShouldBeAbleToAccessModuleNames(String Fleet, String System, String Activities, String Customers, List<String>expectedModules) {

        //List<String> actualModules = BrowserUtils.getElementsText(mainModulesPage.allModules.containsAll());

        BrowserUtils.sleep(2);



    }



}
