package controller;

import base.BasePage;
import org.openqa.selenium.By;

public class Controller extends BasePage {
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public String getErrorText(By locator) {
        return driver.findElement(locator).getText();
    }

    public boolean isVisible(By location) {
        return driver.findElement(location).isDisplayed();
    }

}
