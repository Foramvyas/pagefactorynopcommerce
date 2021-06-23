package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginBtn;
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)")
    WebElement errorMessage;

    public void enterEmailId(String email) {
        Reporter.log("Enter Email" + email + "to email field" + emailField.toString() + "<br>");
        log.info("Entering email address : " + email + " to email field : " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
         Reporter.log("Entering password : " + password + " to password field : " + passwordField.toString() + "<br>");
         log.info("Entering password : " + password + " to password field : " + passwordField.toString());
         sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button : " + loginBtn.toString() + "<br>");
        log.info("Clicking on login button : " + loginBtn.toString());
        clickOnElement(loginBtn);
    }

    public String getWelcomeText() {
        Reporter.log("Getting text from : " + welcomeText.toString() + "<br>");
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }

    public String getErrorMessageText() {
        Reporter.log("Getting text from : " + errorMessage.toString() + "<br>");
        log.info("Getting text from : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }




}
