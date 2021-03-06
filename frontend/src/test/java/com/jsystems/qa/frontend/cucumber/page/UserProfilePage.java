package com.jsystems.qa.frontend.cucumber.page;

import com.jsystems.qa.frontend.cucumber.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfilePage extends BasePage {
    public  UserProfilePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "button.form-button.is-primary")
    public WebElement buttonSave;

    @FindBy(css = ".material-icon.material-icon-notifications")
    public WebElement notification;
}

