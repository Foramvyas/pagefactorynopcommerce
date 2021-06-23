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

public class RegistrationTest extends TestBase {

    HomePage homePage;
    ComputerPage computerPage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void setPages() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserNavigateToRegisterPageSuccessfully() {

        homePage.clickOnRegisterLink();
        String expectedVerificationMessage = "Register";
        String actualVerificationMessage = registerPage.getTextRegister();
        Assert.assertEquals(actualVerificationMessage, expectedVerificationMessage);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyErrorMessageWithFirstNameFiledEmpty() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(1000);
        registerPage.clickOnRegisterButton();
        String actualMessage = "First name is required.";
        String expectedMessage = registerPage.getTextFirstNameFiledEmpty();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = "regression")
    public void VerifyUserSuccessfullyRegister() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(1000);
        registerPage.enterFirstName("Ravi");
        registerPage.enterLastName("Vyas");
        Thread.sleep(1000);
        loginPage.enterEmailId("ravi.vyas" + randomInt + "@gmail.com");
        loginPage.enterPassword("abc1234");
        registerPage.enterConfirmPassword("abc1234");
        registerPage.clickOnRegisterButton();
        String expectedRegistrationMessage = "Your registration completed";
        String actualRegistrationMessage = registerPage.getTextRegisterSuccessfully();
        Assert.assertEquals(actualRegistrationMessage, expectedRegistrationMessage);

    }

}













