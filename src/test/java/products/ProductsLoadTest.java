package products;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductsLoadTest extends BaseTests {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void testProductsLoad() {
        openPage(url);
        loginPage.successLogin("standard_user", "secret_sauce");
        productsPage.selectProduct1();
        Assert.assertTrue(productsPage.backToProductsButtonIsVisible(), "Product Item not loaded...");

    }

}
