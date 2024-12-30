package com.navfort.step_definitions;

import com.navfort.pages.InvalidIntegerNumber;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
public class US58_InvalidIntegerNumberStepDefs {



    InvalidIntegerNumber invalidIntegerNumber = new InvalidIntegerNumber();



    @When("user click on the {string} Dropdown")
    public void user_click_on_the_dropdown(String DropDown) {

        BrowserUtils.waitFor(5);
        invalidIntegerNumber.ActivitiesDropDown.click();
        BrowserUtils.waitFor(5);
    }

    @Then("the {string} option should be visible")
    public void the_option_should_be_visible(String optionName) {

        if (invalidIntegerNumber.ActivitiesDropDown.isDisplayed()) {

            invalidIntegerNumber.calendarEventsLink.click();
            BrowserUtils.waitFor(10);
        }
    }

    @Then("user should click on the {string} button.")
    public void user_should_click_on_the_button(String calendarbutton) {

        invalidIntegerNumber.createCalendarEventsLink.click();
        BrowserUtils.waitFor(5);

    }


    @Given("user should put a tick in the Repeat checkbox.")
    public void userShouldPutATickInTheRepeatCheckbox() {

        if (!invalidIntegerNumber.checkbox.isSelected()) {
            invalidIntegerNumber.checkbox.click();
            BrowserUtils.waitFor(5);
        }

    }



    @And("user should enter an invalid digit \\(less than 1) into the Repeat every field.")
    public void userShouldEnterAnInvalidDigitLessThanIntoTheRepeatEveryField() {

        invalidIntegerNumber.InputField.clear();
        invalidIntegerNumber.InputField.sendKeys("-1");
        invalidIntegerNumber.InputField.sendKeys(Keys.ENTER);
        invalidIntegerNumber.SaveAndClose.click();
        BrowserUtils.waitFor(5);
    }




    @Then("user should see an error message \\(The value have not to be less than 1.)")
    public void userShouldSeeAnErrorMessageTheValueHaveNotToBeLessThan() {



//        String ExpectedMessage = "span";
//        String ActualMessage = invalidIntegerNumber.invalidMessage1.getTagName();
//        BrowserUtils.waitFor(5);
//
//        Assert.assertEquals("Message is not Equal!", ExpectedMessage, ActualMessage);

       Assert.assertTrue( "Message is not diplayed",invalidIntegerNumber.invalidMessage1.isDisplayed());

    }




    @And("user should enter an invalid digit \\(more than 99) into the Repeat every field.")
    public void userShouldEnterAnInvalidDigitMoreThanIntoTheRepeatEveryField() {

        invalidIntegerNumber.InputField.clear();
        invalidIntegerNumber.InputField.sendKeys("100");
        invalidIntegerNumber.InputField.sendKeys(Keys.ENTER);
        invalidIntegerNumber.SaveAndClose.click();
        BrowserUtils.waitFor(5);
    }

    @Then("user should see an error message\\(The value have not to be more than 99.)")
    public void userShouldSeeAnErrorMessageTheValueHaveNotToBeMoreThan() {

//        String ExpectedMessage = "span";
//        String ActualMessage =invalidIntegerNumber.invalidMessage2.getTagName();
//        BrowserUtils.waitFor(5);
//
//        Assert.assertEquals("Message is not Equal!", ExpectedMessage, ActualMessage);

        Assert.assertTrue("Message is not diplayed",invalidIntegerNumber.invalidMessage2.isDisplayed());

    }


}
