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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US61_AccountsPageFilterStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    AccountsPage accountsPage = new AccountsPage();
    LoginPage loginPage = new LoginPage();

    @When("the user is on the accounts page")
    public void the_user_is_on_the_accounts_page() {
        BrowserUtils.waitFor(2);
        dashboardPage.goToAccounts();
    }

    @Then("the user clicked on the Manage filters button")
    public void theUserClickedOnTheManageFiltersButton() {
        accountsPage.manageFiltersButton.click();
    }

    @Then("the user should see {int} options selected")
    public void theUserShouldSeeOptionsSelected(int numberOfOptions) {
        for (WebElement each : accountsPage.filterCheckBoxOptions) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @And("the user should see these options are clickable")
    public void theUserShouldSeeTheseOptionsAreClickable() {
        for (WebElement each : accountsPage.filterCheckBoxOptions) {
            Assert.assertTrue(each.isSelected());
        }

    }


    @Then("the user should see below options selected")
    public void theUserShouldSeeBelowOptionsSelected(List<String> expectedOptions) {

        List<WebElement> actualOptionsWebElement = accountsPage.filterCheckBoxOptions;
        List<String> actualOptions = new ArrayList<>();
        for (WebElement actualOption : actualOptionsWebElement) {

            actualOptions.add(actualOption.getText());

        }
        Assert.assertEquals(actualOptions, expectedOptions);


    }


}
