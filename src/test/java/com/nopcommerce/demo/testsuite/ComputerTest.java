package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    HomePage homePage;
    ComputerPage computerPage;

    @BeforeMethod(alwaysRun = true)
    public void setNewPages() {

        homePage = new HomePage();
        computerPage = new ComputerPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserNavigateToDeskTopPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnDesktopsLink();
        Thread.sleep(1000);
        String expecteddesktopText = "Desktops";
        String actualdesktopText = computerPage.verifyTextDesktops();
        Assert.assertEquals(expecteddesktopText, actualdesktopText);
    }

    @Test(groups = {"smoke", "regression"})
    //This method fail for screenshot purpose
    public void UserShouldNavigateToNoteBookPageSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnNoteBooksLink();
        Thread.sleep(1000);
        String expectedMessage = "Notebook";
        String actualMessage = computerPage.verifyTextNoteBooks();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = "regression")
    public void UserShouldNavigateToSoftWarePageSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnSoftwareLink();
        Thread.sleep(1000);
        String expectedMessage = "Software";
        String actualMessage = computerPage.verifyTextSoftware();
        Assert.assertEquals(actualMessage, expectedMessage);
    }


}
