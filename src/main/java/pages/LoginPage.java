package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Page Elements
    @FindBy(id="username")
    WebElement usernameField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(css = "#login button")
    WebElement loginButton;

    public void setUserName(String username) {
        setText(usernameField, username);
    }
    public void setPassword(String password) {
        setText(passwordField, password);
    }
    public SecureAreaPage clickLogin() {
        clickButton(loginButton);
        return new SecureAreaPage(driver);
    }

}
