package pages;


import controller.Controller;
import org.openqa.selenium.By;

public class LoginPage extends Controller {

    private static final By USER_NAME = By.id("user-name");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");
    private static final By ERROR_MESSAGE = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]");


    private void setUsername(String username) {
        driver.findElement(USER_NAME).sendKeys(username);
    }

    private void setPassword(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
    }


    private void clickLoginButton() {
        clickElement(LOGIN_BUTTON);
    }

    public void successLogin(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

    public String errorMessage() {
        return getErrorText(ERROR_MESSAGE);
    }

}
