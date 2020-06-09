package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertsPage extends BasePage{
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//button[text()='Click for JS Alert']")
    WebElement triggerAlertButton;
    @FindBy(xpath = ".//button[text()='Click for JS Confirm']")
    WebElement triggerConfirmButton;
    @FindBy(xpath = ".//button[text()='Click for JS Prompt']")
    WebElement triggerPromptButton;
    @FindBy(id = "result")
    WebElement result;

    public void triggerAlert(){
        clickButton(triggerAlertButton);
    }

    public void triggerConfirm(){
        clickButton(triggerConfirmButton);
    }

    public void triggerPrompt(){
        clickButton(triggerPromptButton);
    }

    public String getResult(){
        return getText(result);
    }

}
