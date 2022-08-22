package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTests {

    LoginPage loginPage = new LoginPage();

    @Test
    public void LoginWithEmptyUsername() {
        openPage(url);
        loginPage.successLogin("", "secret_sauce");
        Assert.assertEquals(loginPage.errorMessage(), "Epic sadface: Username is required");

    }

    @Test
    public void LoginWithEmptyPassword() {
        openPage(url);
        loginPage.successLogin("standard_user", "");
        Assert.assertEquals(loginPage.errorMessage(), "Epic sadface: Password is required");

    }

    @Test
    public void LoginWithEmptyUsernameAndPassword() {
        openPage(url);
        loginPage.successLogin("", "");
        Assert.assertEquals(loginPage.errorMessage(), "Epic sadface: Username is required");
    }
}
