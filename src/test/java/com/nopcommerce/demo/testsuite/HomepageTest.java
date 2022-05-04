package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomepageTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicsPages electronicsPages = new ElectronicsPages();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();


@Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //‘Computers’ Tab

        //Find Computers tab link and click it
        homePage.clickOnComputerTab();

        //Verify the text ‘Computers’
        String expectedMessage = "Computers";
        String actualMessage= computerPage.getComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully (){
        //‘Electronics’ Tab

        //Find Electronics tab link and click it
        homePage.clickOnElectronicsTab();

        //Verify the text ‘Electronics’
        String expectedMessage = "Electronics";
        String actualMessage= electronicsPages.getElectronicsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully (){
        //‘Apparel’ Tab

        //Find Apparel tab link and click it
        homePage.clickOnApparelTab();

        //Verify the text ‘Apparel’
        String expectedMessage = "Apparel";
        String actualMessage= apparelPage.getApparelText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully (){
        //‘Digital downloads’ Tab

        //Find Digital downloads tab link and click it
        homePage.clickOnDigitalDownloadsTab();

        //Verify the text ‘Digital downloads’
        String expectedMessage = "Digital downloads";
        String actualMessage= digitalDownloadsPage.getDigitaldownloadsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }


    @Test
    public void userShouldNavigateToBooksPageSuccessfully (){
        //‘Books’ Tab

        //Find Digital downloads tab link and click it
        homePage.clickOnBooksTab();

        // Verify the text ‘Books’
        String expectedMessage = "Books";
        String actualMessage= booksPage.getBooksText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //‘Jewelry’ Tab

        //Find Jewelry tab link and click it
        homePage.clickOnJewelryTab();

        // Verify the text ‘Jewelry’
        String expectedMessage = "Jewelry";
        String actualMessage= jewelryPage.getJewelryText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully (){
        //‘Gift Cards’ Tab

        //Find Gift Cards tab link and click it
        homePage.clickOnGiftCardsTab();

        // Verify the text ‘Gift Cards’
        String expectedMessage = "Gift Cards";
        String actualMessage= giftCardsPage.getGiftCardsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }


}


