package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {


    By giftCardsText = By.xpath("//h1[contains(text(),'Gift Cards')]");


    public String getGiftCardsText(){
        return getTextFromElement(giftCardsText);
    }


}
