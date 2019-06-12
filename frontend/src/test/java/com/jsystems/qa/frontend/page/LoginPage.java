package com.jsystems.qa.frontend.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
        public LoginPage(WebDriver driver) {
            super(driver);

        }

        public WebElement emailInput = driver.findElement(By.id("usernameOrEmail"));
        public WebElement buttonContine = driver.findElement(By.className("button form-button is-primacy:"));
    }
@FindBy (id ="password");
public WebElement


