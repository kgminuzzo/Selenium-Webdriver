package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DropdownPage extends BasePage {

    private final WebDriver driver;

    public DropdownPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public void selectFromDropdown(String option) {
        selectInDropdown(dropdown, option);
    }

    public List<String> getDropdownSelectedItems() {
        return getDropdownSelectedOptions(dropdown);
    }

}
