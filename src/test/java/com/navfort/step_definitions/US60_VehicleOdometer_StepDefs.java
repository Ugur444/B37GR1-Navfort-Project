package com.navfort.step_definitions;

import com.navfort.pages.VehicleOdometerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US60_VehicleOdometer_StepDefs {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

    @When("user go to do Fleet")
    public void user_go_to_do_fleet() {
        System.out.println("Go to the Fleet option");

    }

    @When("user go to the Vehicle Odometer")
    public void user_go_to_the_vehicle_odometer() {

    }

    @Then("user should see error massage")
    public void user_should_see_error_massage() {

    }
}
