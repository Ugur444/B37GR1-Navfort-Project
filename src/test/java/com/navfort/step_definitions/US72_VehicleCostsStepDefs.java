package com.navfort.step_definitions;

import com.navfort.pages.VehicleCostsPage;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US72_VehicleCostsStepDefs {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Given("user is on the homepage")
    public void userIsOnTheHomepage() {

        Driver.getDriver().get("https:qa.navfort.com");

        vehicleCostsPage.username.sendKeys("user1");
        vehicleCostsPage.password.sendKeys("UserUser123");
        vehicleCostsPage.loginButton.click();
    }

    @When("user clicks on the {string} link")
    public void user_clicks_on_the_link(String expLink) {

        String actLink = vehicleCostsPage.pinbarLink.getAttribute("innerText");

        Assert.assertEquals(expLink, actLink);
        vehicleCostsPage.pinbarLink.click();
    }

    @Then("user should see the header {string}")
    public void userShouldSeeTheHeader(String expHeader) {
        vehicleCostsPage.pinbarInstructHead.isDisplayed();

        String actHeader = vehicleCostsPage.pinbarInstructHead.getAttribute("innerText");
        Assert.assertEquals(expHeader, actHeader);
    }


    @And("user should see the instruction text {string}")
    public void userShouldSeeTheInstructionText(String expText) {
        vehicleCostsPage.pinbarInstructText.isDisplayed();

        String actText = vehicleCostsPage.pinbarInstructText.getAttribute("innerText").trim();
        Assert.assertEquals(expText, actText);
    }

    @And("user should see an image {string}")
    public void userShouldSeeAnImage(String expSource) {

        vehicleCostsPage.pinbarInstructImg.isDisplayed();

        String actualSource = vehicleCostsPage.pinbarInstructImg.getAttribute("src");
        Assert.assertTrue(actualSource.contains(expSource));

    }

}









