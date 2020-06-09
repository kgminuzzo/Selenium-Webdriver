package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LargeDeepDOMPage extends BasePage{
    public LargeDeepDOMPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "large-table")
    WebElement largeTable;

    public void scrollToTable(){
        scrollDown(largeTable);
    }


}
