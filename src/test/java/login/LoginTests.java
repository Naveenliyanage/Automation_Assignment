package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTests extends BaseTests {

    TestData testData = new TestData();
    LoginPage lgnPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void testSuccessfulLogin() {
        openPage(testData.getUrl());
        lgnPage.successLogin(testData.getUsername(), testData.getPassword());
        Assert.assertTrue(productsPage.productsTitleIsVisible(), "Login Unsuccessful...");

    }

}
