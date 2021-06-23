package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerText;
    @FindBy(id = "FirstName")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageFirstName;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessfullyMessage;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement loginSuccessfully;


    public void clickOnRegisterButton() {
        Reporter.log("Clicking on register button : " + registerButton.toString() + "<br>");
        log.info("Clicking on register button : " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getTextFirstNameFiledEmpty() {
        Reporter.log("Verify error message first name filed empty : " + errorMessageFirstName.toString() + "<br>");
        log.info("Verify error message first name filed empty : " + errorMessageFirstName.toString());
        return getTextFromElement(errorMessageFirstName);
    }

    public String getTextRegister() {
        Reporter.log("Verify register page navigation  : " + registerText.toString() + "<br>");
        log.info("Getting text from : " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String name) {
        Reporter.log("Enter First name" + name + "to email field" + firstName.toString() + "<br>");
        log.info("Entering email address : " + name + " to email field : " + firstName.toString());
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String lastname) {
        Reporter.log("Enter First name" + lastname + "to email field" + lastName.toString() + "<br>");
        log.info("Entering email address : " + lastname + " to email field : " + lastName.toString());
        sendTextToElement(lastName, lastname);
    }

    public void enterConfirmPassword(String passwordConfirm) {
        Reporter.log("Entering confirm password : " + passwordConfirm + " to password field : " + confirmPassword.toString() + "<br>");
        log.info("Entering password : " + passwordConfirm + " to password field : " + confirmPassword.toString());
        sendTextToElement(confirmPassword, passwordConfirm);
    }
    public String getTextRegisterSuccessfully() {
        Reporter.log("Verify register page navigation successfully : " + registerText.toString() + "<br>");
        log.info("Getting text from : " + registerSuccessfullyMessage.toString());
        return getTextFromElement(registerSuccessfullyMessage);
    }
    public void clickOnLogOutButton() {
        Reporter.log("Clicking on logOut button : " + logOut.toString() + "<br>");
        log.info("Clicking on login button : " + logOut.toString());
        clickOnElement(logOut);
    }

    public String getTextLoginSuccessfully() {
        Reporter.log("Verify Login successfully : " + loginSuccessfully.toString() + "<br>");
        log.info("Getting text from login page : " + loginSuccessfully.toString());
        return getTextFromElement(loginSuccessfully);
    }

}