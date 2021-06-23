package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void setPageObject() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyErrorMessageWithInValidCredentials() throws InterruptedException {

        homePage.clickOnLoginLink();
        Thread.sleep(1000);
        loginPage.enterEmailId("ravi.vyas@gmail.com");
        loginPage.enterPassword("abc1234");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessageText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test(groups = "regression")
    public void verifyUserLoginSuccessfully() throws InterruptedException {

        homePage.clickOnRegisterLink();
        Thread.sleep(1000);
        registerPage.enterFirstName("Ravi");
        registerPage.enterLastName("Vyas");
        loginPage.enterEmailId("ravi.vyas" + randomInt + "@gmail.com");
        loginPage.enterPassword("abc1234");
        registerPage.enterConfirmPassword("abc1234");
        registerPage.clickOnRegisterButton();
        registerPage.clickOnLogOutButton();
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("ravi.vyas" + randomInt + "@gmail.com");
        loginPage.enterPassword("abc1234");
        loginPage.clickOnLoginButton();
        String expectedMessage="Welcome to our store";
        String actualMessage= registerPage.getTextLoginSuccessfully();
        Assert.assertEquals(actualMessage,expectedMessage);


    }


}








