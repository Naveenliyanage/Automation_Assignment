package products;

import base.BaseTests;
import login.LoginTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsLoadTest extends BaseTests {
  LoginTests loginTests=new LoginTests();
  @Test
    public void testProductsLoad() {
        loginTests.testSuccessfulLogin();
        clickElement(new By.ByXPath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
        Assert.assertTrue(isVisible(By.id("back-to-products")),"Product Item not loaded...");

    }


}
