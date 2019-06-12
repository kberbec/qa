package com.jsystems.qa.frontend.test;

import com.jsystems.frontend.Configuration;
import com.jsystems.qa.frontend.page.LoginPage;
import com.jsystems.qa.frontend.page.MainWordpressPage;
import com.jsystems.qa.frontend.test.ConfigFrontend;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrontendTest extends ConfigFrontend {


//
//    @BeforeAll
//    public static void setUpAll(){
//
//        System.setProperty("webdriver.chrome.driver", ClassLoader.getSystemClassLoader().getResource("driver/chromedriver.exe").getFile());
//    }


//    WebDriver driver;
    MainWordpressPage wordpressPage;
    LoginPage loginPage;

    @Test
    public void firstFrontTest(){
//        WebDriverManager.chromedriver().setup();




        driver.get("https://wordpress.com/");
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MainWordpressPage = new MainWordpressPage(driver);
        assertTrue(MainWordpressPage.buildEWebsite.isDisplayed());
        assertEquals(MainWordpressPage.buildEWebsite.getText(), "Build a website,");

        assertTrue(MainWordpressPage.login.isDisplayed());
        assertEquals(MainWordpressPage.login.getText(), "Log In");
        MainWordpressPage.login.click();


        driver.quit();
    }


}
@Test
public void loginTest(){

        wordpressPage = new MainWordpressPage(driver);
        wordpressPage.waitForVisibilityofElement(wordpressPage.login,30);
        wordpressPage.login.click();
        loginPage.waitForVisibilityofElement(loginPage.emailInput,30);
        loginPage.loginInput.clear();
        loginPage.emailInput.sendKeys(Configuration.LOGIN);
        loginPage.buttonContine.click();

        loginPage.waitForVisibilityofElement();
        loginPage.passwordInput.clear();
        loginPage.passwordInput.SendKeys(Configuration.PASSWORD);
        loginPage.buttonContine.click();

        }


