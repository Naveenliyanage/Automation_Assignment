package cart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;


public class AddToCartTest extends BaseTests {
    private static final String PRODUCT1_NAME = "Sauce Labs Backpack";
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void cartPageTest() {
        openPage(url);
        loginPage.successLogin("standard_user", "secret_sauce");
        productsPage.clickOnAddToCartBtn();
        cartPage.clickShoppingCartBtn();
        Assert.assertEquals(cartPage.getProduct1Text(), PRODUCT1_NAME);

    }
}
