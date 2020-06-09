package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage extends BasePage{

    public SecureAreaPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Page Elements
    @FindBy(id="flash")
    WebElement statusAlert;

    public String getStatusAlertText(){ return getText(statusAlert);}

}
