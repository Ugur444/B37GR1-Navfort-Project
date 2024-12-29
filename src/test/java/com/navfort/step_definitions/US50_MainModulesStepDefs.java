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

    @When("user enters {string} information")
    public void userEntersInformation(String arg0) {

        loginPage.userName.sendKeys("store_manager_username");
        loginPage.password.sendKeys("store_manager_password");
        BrowserUtils.sleep(2);
        loginPage.submit.click();

    }


    @Then("user should be able to access {string}")
    public void userShouldBeAbleToAccess(List<String> expectedModules) {

        BrowserUtils.sleep(2);
        List<String> actualModules = BrowserUtils.getElementsText(MainModulesPage.allModules);

        Assert

    }
}
