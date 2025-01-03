package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage extends LoginPage {

    public VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[.='Learn how to use this space'])[1]")
    public WebElement pinbarLink;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement pinbarInstructHead;

    @FindBy(xpath = "//p[contains(text(), 'Use pin icon')]")
    public WebElement pinbarInstructText;

    @FindBy(xpath = "//img[contains(@src, 'pinbar-location.jpg')]")
    public WebElement pinbarInstructImg;


}
