package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public WebElement acceptButton;

    //create constructor
    //initiliza the driver instance and this class instance using PageFactory.init
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //we can start locating web elements using @FindBy annotation

    @FindBy(xpath = "//div[.='Accept all']")
    public WebElement acceptAll;


    @FindBy(name = "q")
    public WebElement searchBox;


}
