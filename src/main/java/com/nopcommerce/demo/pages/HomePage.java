package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By registrationTab = By.linkText("Register");
    By loginTab = By.linkText("Log in");
    By computerTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By electronicsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparelTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    By digitalDownloadsTab= By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");
    By booksTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By jewelryTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");
    By giftCardsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");
    By cellPhone =By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");


    public void clickOnRegistrationTab(){
        clickOnElement(registrationTab);
    }
    public void clickOnLoginTab(){
        clickOnElement(loginTab);
    }
    public void clickOnComputerTab(){
        clickOnElement(computerTab);
    }
    public void clickOnElectronicsTab (){
        clickOnElement(electronicsTab);
    }
    public void clickOnApparelTab (){
        clickOnElement(apparelTab);
    }
    public void clickOnDigitalDownloadsTab (){
        clickOnElement(digitalDownloadsTab);
    }
    public void clickOnBooksTab (){
        clickOnElement(booksTab);
    }
    public void  clickOnJewelryTab (){
        clickOnElement(jewelryTab);
    }
    public void clickOnGiftCardsTab (){
        clickOnElement(giftCardsTab);
    }

    public void electronicsTabMousehover(){
        mouseHoverToElement(electronicsTab);
    }

    public void cellPhoneMouseHover(){
        mouseHoverToElement(electronicsTab);
    clickOnElement(cellPhone);

    }


    //        2.44 Verify the URL is “https://demo.nopcommerce.com/”



//    String expectedMessage17 = "https://demo.nopcommerce.com/";
//    String actualMessage17 = driver.getCurrentUrl();
//        Assert.assertEquals(actualMessage17, expectedMessage17);


}
