package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTests extends BaseTests {

    public String url = "https://www.saucedemo.com/";
    LoginPage lgnPage = new LoginPage();
    @Test
    public void testSuccessfulLogin(){
        openPage(url);
        lgnPage.successLogin("standard_user","secret_sauce");
        Assert.assertTrue(isVisible(By.id("inventory_container")),"Login Page not loaded...");

    }

}
