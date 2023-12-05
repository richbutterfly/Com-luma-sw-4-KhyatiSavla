package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.PantsPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 2. Write down the following test into ‘MenTest’
 * class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * Mouse Hover on Men Menu
 * Mouse Hover on Bottoms
 * Click on Pants
 * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on size
 * 32.
 * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on colour
 * Black.
 * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on
 * ‘Add To Cart’ Button.
 * Verify the text
 * ‘You added Cronus Yoga Pant to your shopping cart.’
 * Click on ‘shopping cart’ Link into
 * message
 * Verify the text ‘Shopping Cart.’
 * Verify the product name ‘Cronus Yoga Pant’
 * Verify the product size ‘32’
 * Verify the product colour ‘Black’
 */
public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {

        //Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        //* Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();
        //* Click on Pants
        homePage.clickOnPants();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        pantsPage.ClickOnProductName();
        pantsPage.clickOnSize32();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        pantsPage.ClickOnProductName();
        pantsPage.clickOnBlackColour();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        pantsPage.ClickOnProductName();
        pantsPage.clickOnAddToCartButton();
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = pantsPage.getTextAddedPantToShoppingCart();
        Assert.assertEquals(actualText, expectedText);
        //* Click on ‘shopping cart’ Link into message
        pantsPage.clickOnShoppingCart();
        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCartPage.getTextShoppingCart(),"Shopping Cart");
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.getTextCronusYogaPant(),"Cronus Yoga Pant");
        //* Verify the product size ‘32’
        Assert.assertEquals(shoppingCartPage.getTextSize32(),"32");
        //* Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.getTextBlack(),"Black");

    }
}