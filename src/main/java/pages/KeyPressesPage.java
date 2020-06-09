package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage extends BasePage {

    private final WebDriver driver;
    public KeyPressesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "target")
    WebElement inputField;
    @FindBy(id = "result")
    WebElement resultText;

    public void setInputText(String text) {
        setText(inputField, text);
    }

    public String getResult() {
        return getText(resultText);
    }

    public void enterPi() {
        setInputText(Keys.chord(Keys.ALT, "p"));
    }

}
