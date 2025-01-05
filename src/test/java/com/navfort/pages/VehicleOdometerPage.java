package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetOption;



    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement vehicleOption;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;


    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement newFleetOption;



    @FindBy(xpath = "//span[@class='title title-level-2']")
    public WebElement newVehicleOption;











}
