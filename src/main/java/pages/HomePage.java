package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Form Authentication")
    WebElement formAuthenticationLink;
    @FindBy(linkText = "Dropdown")
    WebElement dropdown;
    @FindBy(linkText = "Hovers")
    WebElement hovers;
    @FindBy(linkText = "Key Presses")
    WebElement keyPresses;
    @FindBy(linkText = "JavaScript Alerts")
    WebElement javaScriptAlert;
    @FindBy(linkText = "File Upload")
    WebElement fileUploader;
    @FindBy(linkText = "Context Menu")
    WebElement contextMenu;
    @FindBy(linkText = "WYSIWYG Editor")
    WebElement wysiWigEditor;
    @FindBy(linkText = "Large & Deep DOM")
    WebElement largeDeepDom;
    @FindBy(linkText = "Infinite Scroll")
    WebElement infiniteScroll;
    @FindBy(linkText = "Dynamic Loading")
    WebElement dynamicLoading;

    public LoginPage clickFormAuthentication() {
        click(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        click(hovers);
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        click(keyPresses);
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        click(javaScriptAlert);
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploaderPage clickFileUpload(){
        click(fileUploader);
        return new FileUploaderPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        click(contextMenu);
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWysiwigEditor(){
        click(wysiWigEditor);
        return new WYSIWYGEditorPage(driver);
    }

    public LargeDeepDOMPage clickLargeDeepDom(){
        click(largeDeepDom);
        return new LargeDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        click(infiniteScroll);
        return new InfiniteScrollPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        click(dynamicLoading);
        return new DynamicLoadingPage(driver);
    }
}
