package products;

import base.BaseTests;
import login.LoginTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductsLoadTest extends BaseTests {
    LoginTests loginTests = new LoginTests();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void testProductsLoad() {
        loginTests.testSuccessfulLogin();
        productsPage.selectProduct1();
        Assert.assertTrue(productsPage.backToProductsButtonIsVisible(), "Product Item not loaded...");

    }

}
