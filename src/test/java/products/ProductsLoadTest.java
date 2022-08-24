package products;

import base.BaseTests;
import login.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductsLoadTest extends BaseTests {
    TestData testData = new TestData();
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void testProductsLoad() {
        openPage(testData.getUrl());
        loginPage.successLogin(testData.getUsername(), testData.getPassword());
        productsPage.selectProduct1();
        Assert.assertTrue(productsPage.backToProductsButtonIsVisible(), "Product Item not loaded...");

    }

}
