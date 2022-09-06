package controller;

import base.BasePage;
import org.openqa.selenium.By;

import java.io.IOException;

import static util.ConfigReader.getUrl;

public class Controller extends BasePage {
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public boolean isVisible(By location) {
        return driver.findElement(location).isDisplayed();
    }

    public void openPage() throws IOException {
        driver.get(getUrl());
    }

}
