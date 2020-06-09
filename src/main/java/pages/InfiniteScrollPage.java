package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InfiniteScrollPage extends BasePage{
    public InfiniteScrollPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindAll(@FindBy(className = "jscroll-added"))
    List<WebElement> textBlocks;

    /**
     * Scrolls until paragraph with index specified is in view
     * @param index 1-based
     */
    public void scrollToParagraph(int index){
        while(getNumberOfParagraphsPresent()<index)
            scrollDown();
    }

    public int getNumberOfParagraphsPresent(){
        return textBlocks.size();
    }
}
