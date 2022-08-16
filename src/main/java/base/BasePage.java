package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    protected static WebDriver driver;

    public static void iniWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    public void quitWebDriver() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public void openPage(String url){
        driver.get(url);
    }

    public void clickElement(By locator){
        driver.findElement(locator).click();
    }

    public String errorText(By locator){
    return driver.findElement(locator).getText();
    }

    public boolean isVisible(By location){
       return driver.findElement(location).isDisplayed();
    }


}