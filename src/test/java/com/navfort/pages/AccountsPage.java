package com.navfort.pages;

import com.navfort.utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {

    public AccountsPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@title='Filters']/i")
    public WebElement filterButton;

    @FindBy(linkText = "Manage filters")
    public WebElement manageFiltersButton;








}
