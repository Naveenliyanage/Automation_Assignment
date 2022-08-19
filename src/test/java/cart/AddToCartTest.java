package cart;

import base.BaseTests;
import login.LoginTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;


public class AddToCartTest extends BaseTests {
    LoginTests loginTests = new LoginTests();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void cartPageTest() {
        loginTests.testSuccessfulLogin();
        productsPage.clickOnAddToCartBtn();
        cartPage.clickShoppingCartBtn();
        Assert.assertEquals(cartPage.getProduct1Text(), "Sauce Labs Backpack");

    }
}
