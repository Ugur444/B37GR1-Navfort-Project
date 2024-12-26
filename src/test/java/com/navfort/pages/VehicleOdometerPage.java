package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "title title-level-1")
    public WebElement fleetOption;
    public void navigateToFleet(){
        fleetOption.click();

    }


    @FindBy(linkText = "Vehicle Odometer")
    public WebElement vehicleOption;

    public void goToVehicleOption(){
        vehicleOption.click();
    }

}
