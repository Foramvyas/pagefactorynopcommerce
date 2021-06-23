package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(linkText = "Desktops")
    WebElement deskTopLink;
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[2]/a")
    WebElement noteBooksLink;
    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
    WebElement noteBookText;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[3]/a")
    WebElement softwareLink;
    @FindBy(xpath = "//h1[contains(text(),'Software')]")
    WebElement softwareText;

    public void clickOnDesktopsLink() {
        Reporter.log("Clicking on Desktops link : " + deskTopLink.toString() + "<br>");
        clickOnElement(deskTopLink);
        log.info("Clicking on Desktops link : " + deskTopLink.toString());
    }

    public String verifyTextDesktops() {
        Reporter.log("Getting text from : " + desktopsText.toString() + "<br>");
        log.info("Getting text from : " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void clickOnNoteBooksLink() {
        Reporter.log("Clicking on Notebook link : " + noteBooksLink.toString() + "<br>");
        clickOnElement(noteBooksLink);
        log.info("Clicking on login link : " + noteBooksLink.toString());
    }

    public String verifyTextNoteBooks() {
        Reporter.log("Getting text from : " + noteBookText.toString() + "<br>");
        log.info("Getting text from : " + noteBookText.toString());
        return getTextFromElement(noteBookText);
    }

    public void clickOnSoftwareLink() {
        Reporter.log("Clicking on Software link : " + softwareLink.toString() + "<br>");
        clickOnElement(softwareLink);
        log.info("Clicking on login link : " + softwareLink.toString());
    }

    public String verifyTextSoftware() {
        Reporter.log("Getting text from : " + softwareText.toString() + "<br>");
        log.info("Getting text from : " + softwareText.toString());
        return getTextFromElement(softwareText);
    }


}
