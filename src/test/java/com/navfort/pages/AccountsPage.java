package com.navfort.pages;

import com.navfort.utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage extends DashboardPage {

    public AccountsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterButton;

    @FindBy(linkText = "Manage filters")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public List<WebElement> filterCheckBoxOptions;








}
