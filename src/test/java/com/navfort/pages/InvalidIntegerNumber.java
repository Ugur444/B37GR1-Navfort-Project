package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidIntegerNumber {

    public InvalidIntegerNumber() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//li[contains(@class,'dropdown-level-1')]//span[normalize-space(text())='Activities']")
    public WebElement ActivitiesDropDown;

    @FindBy(xpath = "//span[text()='Calendar Events']")
    public WebElement calendarEventsLink;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventsLink;

    @FindBy(xpath="(//div[@class='controls']/input)[5]")
    public WebElement checkbox;


    @FindBy(xpath ="(//input[@value='1'])[2]")
    public WebElement InputField;

    @FindBy(xpath ="(//button[@type='submit'])[1]")
    public WebElement SaveAndClose;


    @FindBy(xpath ="//span[text()='The value have not to be less than 1.']")
    public WebElement invalidMessage1;

    @FindBy(xpath ="//span[text()='The value have not to be more than 99.']")
    public WebElement invalidMessage2;



}
