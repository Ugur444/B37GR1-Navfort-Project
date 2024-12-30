package com.navfort.step_definitions;

import com.github.javafaker.Business;
import com.navfort.pages.AccountsPage;
import com.navfort.pages.DashboardPage;
import com.navfort.pages.LoginPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US61_AccountsPageFilterStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    AccountsPage accountsPage = new AccountsPage();

    @When("the user is on the accounts page")
    public void the_user_is_on_the_accounts_page() {
        BrowserUtils.waitFor(5);
        dashboardPage.goToAccounts();
        BrowserUtils.sleep(3);
    }

    @Then("the user clicked on the Manage filters button")
    public void theUserClickedOnTheManageFiltersButton() {
        accountsPage.filterButton.click();
        accountsPage.manageFiltersButton.click();
    }

    @Then("the user should see below options displayed")
    public void theUserShouldSeeBelowOptionsDisplayed(List<String> expectedOptions) {

        List<String> actualOptionsString =  BrowserUtils.getElementsText(accountsPage.filterCheckBoxOptions);

        Assert.assertEquals(actualOptionsString, expectedOptions);

    }






}
