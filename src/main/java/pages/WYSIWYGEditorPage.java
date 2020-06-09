package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WYSIWYGEditorPage extends BasePage{

    private final static String EDITOR_FRAME_ID = "mce_0_ifr";

    public WYSIWYGEditorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tinymce")
    WebElement textArea;
    @FindBy(css = "#mceu_12 button")
    WebElement descreaseIdentionButton;

    public void typeInEditor(String text){
        switchToFrame();
        textArea.sendKeys(text);
        switchOutFrame();
    }

    public void clearEditor(){
        switchToFrame();
        textArea.clear();
        switchOutFrame();
    }

    public void descreaseIdention(){
        clickButton(descreaseIdentionButton);
    }

    public String getEditorText(){
       switchToFrame(EDITOR_FRAME_ID);
       String text = getText(textArea);
       switchOutFrame();
       return text;
    }

    private void switchToFrame(){
        switchToFrame(EDITOR_FRAME_ID);
    }


}
