package pages;

import base.BasePage;
import org.openqa.selenium.By;


public class CartPage extends BasePage {

    private static final By PRODUCT_ONE= By.cssSelector("#item_4_title_link > div");
    private static final By SHOPPING_CART_BTN = new By.ByXPath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");

     public String getProduct1Text()
     { return driver.findElement(PRODUCT_ONE).getText();
     }

     public void clickShoppingCartBtn(){
         clickElement(SHOPPING_CART_BTN);
     }
}
