package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;


public class LoginTests extends BaseTests {

    public String url = "https://www.saucedemo.com/";
    LoginPage lgnPage = new LoginPage();
    ProductsPage productsPage=new ProductsPage();

    @Test
    public void testSuccessfulLogin() {
        openPage(url);
        lgnPage.successLogin("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.productsTitleIsVisible(), "Login Unsuccessful...");

    }

}
