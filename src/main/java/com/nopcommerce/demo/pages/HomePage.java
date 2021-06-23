package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Computers")
    WebElement computerLink;
    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;
    @FindBy(linkText = "Apparel")
    WebElement apparelLink;
    @FindBy(linkText = "Digital downloads")
    WebElement digitalDownloadsLink;
    @FindBy(linkText = "Books")
    WebElement booksLink;
    @FindBy(linkText = "Jewelry")
    WebElement jewelryLink;
    @FindBy(linkText = "Gift Cards")
    WebElement giftCardsLink;
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registrationLink;




    public void mouseHoverOnComputerLink(){
       Reporter.log("MouseHover on computer link : " + computerLink.toString() + "<br>");
       log.info("Clicking on login link : " + computerLink.toString());
        mouseHoverToElement(computerLink);
    }

    public void clickOnComputerLink() {
        Reporter.log("Clicking on computer link : " + computerLink.toString() + "<br>");
        clickOnElement(computerLink);
        log.info("Clicking on login link : " + computerLink.toString());
    }
    public void clickOnElectronicsLink() {
        Reporter.log("Clicking on electronics link : " + electronicsLink.toString() + "<br>");
        clickOnElement(electronicsLink);
        log.info("Clicking on login link : " + electronicsLink.toString());
    }

    public void clickOnApparelLink() {
        Reporter.log("Clicking on Apparel link : " + apparelLink.toString() + "<br>");
        clickOnElement(apparelLink);
        log.info("Clicking on login link : " + apparelLink.toString());
    }
    public void clickOnDigitalDownloadsLink() {
        Reporter.log("Clicking on digitalDownloads link : " + digitalDownloadsLink.toString() + "<br>");
        clickOnElement(digitalDownloadsLink);
        log.info("Clicking Digital Downloads link : " + digitalDownloadsLink.toString());
    }
    public void clickOnBooksLink() {
        Reporter.log("Clicking on Books link : " + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
        log.info("Clicking on Books link : " + booksLink.toString());
    }
    public void clickOnJewelryLink() {
        Reporter.log("Clicking on Jewelry link : " + jewelryLink.toString() + "<br>");
        clickOnElement(jewelryLink);
        log.info("Clicking on Jewelry link : " + jewelryLink.toString());
    }
    public void clickOnGiftCardsLink() {
        Reporter.log("Clicking on GiftCards link : " + giftCardsLink.toString() + "<br>");
        clickOnElement(giftCardsLink);
        log.info("Clicking on GiftCards  link : " + giftCardsLink.toString());
    }

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link : " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on login link : " + registrationLink.toString() + "<br>");
        clickOnElement(registrationLink);
        log.info("Clicking on login link : " + registrationLink.toString());
    }









}
