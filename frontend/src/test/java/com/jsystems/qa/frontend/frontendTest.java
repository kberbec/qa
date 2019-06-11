package com.jsystems.qa.frontend;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class frontendTest {
    @BeforeAll
    public static void setUPall(){
        System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
    }
    WebDriver driver;
    @Test
    public void firstFronttest(){
        System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

        driver.get("https://wordpress.com");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            driver.findElement

            driver.quit();
    }

}
