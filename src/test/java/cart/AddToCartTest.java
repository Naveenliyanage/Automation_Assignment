package cart;

import base.BaseTests;
import login.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;


public class AddToCartTest extends BaseTests {
    private static final String PRODUCT1_NAME = "Sauce Labs Backpack";
    TestData testData = new TestData();
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void cartPageTest() {
        openPage(testData.getUrl());
        loginPage.successLogin(testData.getUsername(), testData.getPassword());
        productsPage.clickOnAddToCartBtn();
        cartPage.clickShoppingCartBtn();
        Assert.assertEquals(cartPage.getProduct1Text(), PRODUCT1_NAME);

    }
}
