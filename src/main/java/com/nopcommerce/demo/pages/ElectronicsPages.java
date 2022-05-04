package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPages extends Utility {

    By electronicsText = By.xpath("//h1[contains(text(),'Electronics')]");

    public String getElectronicsText(){
        return getTextFromElement(electronicsText);
    }


    //        2.3 Verify the text “Cell phones”
    By cellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    public String verifyCellPhones(){
        return getTextFromElement(cellPhone);
    }

//        2.4 Click on List View Tab
    By listView = By.xpath("//a[contains(text(),'List')]");
    public void selectListView(){
        clickOnElement(listView);
    }

//        2.5 Click on product name “Nokia Lumia 1020” link
    By product = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    public void selectNokiaLumia() {
        mouseHoverToElement(product);
        clickOnElement(product);
    }

//        2.6 Verify the text “Nokia Lumia 1020”

By nokiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    public String verifyNokiaText (){
        return getTextFromElement(nokiaText);
    }


//        2.7 Verify the price “$349.00”
    By price =By.xpath("//span[@id='price-value-20']");
    public String verifyPrice (){
        return getTextFromElement(price);
    }

//        2.8 Change quantity to 2
    By qty = By.xpath("//input[@id='product_enteredQuantity_20']");
    public void changeQty (String value){
        clearValue(qty);
        sendTextToElement(qty,value);
    }

//        2.9 Click on “ADD TO CART” tab
    By addtocart = By.id("add-to-cart-button-20");
    public void clickAddToCart() {
     clickOnElement(addtocart);
    }

//        2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By message = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    public String verifyShoppingCartMessage (){
        return getTextFromElement(message);
    }

//        After that close the bar clicking on the cross button.
    By cross = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void selectCrossButton() {
     clickOnElement(cross);
    }

//        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By shoppingcart = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void clickShoppingChart() {
        mouseHoverToElement(shoppingcart);
        clickOnElement(shoppingcart);
    }



}
