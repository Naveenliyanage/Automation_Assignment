package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {

    protected static WebDriver driver;

    public static void initWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void quitWebDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }


}