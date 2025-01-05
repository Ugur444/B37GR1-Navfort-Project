package com.navfort.step_definitions;

import com.navfort.pages.VehicleOdometerPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US60_VehicleOdometer_StepDefs {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();


    @When("user go to do Fleet")
    public void user_go_to_do_fleet() {
        BrowserUtils.sleep(5);
        vehicleOdometerPage.fleetOption.click();

    }

    @When("user go to the Vehicle Odometer")
    public void user_go_to_the_vehicle_odometer() {
        BrowserUtils.sleep(5);
        vehicleOdometerPage.vehicleOption.click();

    }

    @Then("user should see {string} error massage")
    public void user_should_see_error_massage(String expectedMessage) {

        Assert.assertEquals(expectedMessage, vehicleOdometerPage.errorMessage.getText());

        System.out.println("expectedMessage = " + expectedMessage);
        String actualMessage = vehicleOdometerPage.errorMessage.getText();
        System.out.println("actualMessage = " + actualMessage);


    }




    @When("user go to do Fleet option")
    public void user_go_to_do_fleet_option() {
        BrowserUtils.sleep(7);
        vehicleOdometerPage.newFleetOption.click();


    }

    @When("user go to the Vehicle Odometer option")
    public void user_go_to_the_vehicle_odometer_option() {
        BrowserUtils.sleep(3);
        BrowserUtils.waitForTitleContains("Dashboard");
        vehicleOdometerPage.newVehicleOption.click();


    }
    @Then("user sees Page 1 on the Vehicle Odometer")
    public void user_sees_page_on_the_vehicle_odometer() {


    }


}
