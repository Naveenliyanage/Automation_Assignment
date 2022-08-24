package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTests {

    TestData testData = new TestData();
    LoginPage loginPage = new LoginPage();

    @Test
    public void LoginWithEmptyUsername() {
        openPage(testData.getUrl());
        loginPage.successLogin("", testData.getPassword());
        Assert.assertEquals(loginPage.errorMessage(), "Epic sadface: Username is required");

    }

    @Test
    public void LoginWithEmptyPassword() {
        openPage(testData.getUrl());
        loginPage.successLogin(testData.getUsername(), "");
        Assert.assertEquals(loginPage.errorMessage(), "Epic sadface: Password is required");

    }

    @Test
    public void LoginWithEmptyUsernameAndPassword() {
        openPage(testData.getUrl());
        loginPage.successLogin("", "");
        Assert.assertEquals(loginPage.errorMessage(), "Epic sadface: Username is required");
    }
}
