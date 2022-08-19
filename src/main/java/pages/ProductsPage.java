package pages;

import controller.Controller;
import org.openqa.selenium.By;


public class ProductsPage extends Controller {

    private static final By ADD_TO_CART_BUTTON = By.id("add-to-cart-sauce-labs-backpack");
    private static final By PRODUCTS_TITLE = By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.header_secondary_container > span.title");
    private static final By PRODUCT1_CLICK = By.cssSelector("#item_4_title_link > div");
    private static final By BACK_TO_PRODUCTS_BUTTON = By.id("back-to-products");

    public boolean productsTitleIsVisible() {
        return isVisible(PRODUCTS_TITLE);
    }

    public void clickOnAddToCartBtn() {
        driver.findElement(ADD_TO_CART_BUTTON).click();

    }

    public void selectProduct1() {
        clickElement(PRODUCT1_CLICK);
    }

    public boolean backToProductsButtonIsVisible() {
        return isVisible(BACK_TO_PRODUCTS_BUTTON);
    }
}
