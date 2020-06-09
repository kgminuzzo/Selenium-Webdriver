package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploaderPage extends BasePage{
    public FileUploaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "file-upload")
    WebElement inputField;
    @FindBy(id = "file-submit")
    WebElement uploadButton;
    @FindBy(id = "uploaded-files")
    WebElement uploadedFiles;

    public void clickUploadButton(){
        clickButton(uploadButton);
    }

    public void uploadFile(String absolutePathOfFile){
        setText(inputField,absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return getText(uploadedFiles);
    }
}
