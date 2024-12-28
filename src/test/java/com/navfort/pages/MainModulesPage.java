package com.navfort.pages;

import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage {

    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   // @FindBy(name ="username")
    //public WebElement InputUsername;

   // @FindBy(name = "_password")
   // public WebElement inputPassword;

    //@FindBy(id = "_submit")
   // public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement Dashboards;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement Fleet;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement Customers;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement Sales ;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement Activities;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[6]")
    public WebElement Marketing;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[7]")
    public WebElement ReportsSegments;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[8]")
    public WebElement System;

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> allModules;


    }

