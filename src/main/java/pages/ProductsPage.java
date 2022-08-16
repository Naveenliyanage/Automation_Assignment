package pages;

import base.BasePage;
import org.openqa.selenium.By;


public class ProductsPage extends BasePage {

   private static final By ADD_TO_CART_BTN = By.id("add-to-cart-sauce-labs-backpack");


    public void  clickOnAddToCartBtn(){
        driver.findElement(ADD_TO_CART_BTN).click();

    }
}
