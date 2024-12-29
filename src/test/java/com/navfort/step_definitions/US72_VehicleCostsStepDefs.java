package com.navfort.step_definitions;

import com.navfort.pages.VehicleCostsPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class US72_VehicleCostsStepDefs {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @When("user clicks on the {string} link")
    public void user_clicks_on_the_link(String expLink) {

        BrowserUtils.sleep(5);

        Assert.assertEquals(expLink, vehicleCostsPage.pinbarLink.getText());
        vehicleCostsPage.pinbarLink.click();
    }

    @Then("user should see the header {string}")
    public void userShouldSeeTheHeader(String expHeader) {

        vehicleCostsPage.pinbarInstructHead.isDisplayed();

        Assert.assertEquals(expHeader, vehicleCostsPage.pinbarInstructHead.getText());
    }

    @And("user should see the instruction text {string}")
    public void userShouldSeeTheInstructionText(String expText) {

        vehicleCostsPage.pinbarInstructText.isDisplayed();

        Assert.assertEquals(expText, vehicleCostsPage.pinbarInstructText.getText());
    }

    @And("user should see an image {string}")
    public void userShouldSeeAnImage(String expSource) {

        vehicleCostsPage.pinbarInstructImg.isDisplayed();

        String actualSource = (String) ((JavascriptExecutor) Driver.getDriver())
                .executeScript("return arguments[0].src;", vehicleCostsPage.pinbarInstructImg);

        Assert.assertTrue(actualSource != null && actualSource.contains(expSource));
    }


}









