package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class BasePage {

	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	
	public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,3);
        js = (JavascriptExecutor) driver;
    }
	
	public void click (WebElement element) {
		waitVisibility(element).click();
	}
	
	public void clickButton (WebElement element) {
		waitVisibility(element);
		js.executeScript("arguments[0].click();", element);
	}
	
	public void selectInDropdown(WebElement element, String value) {
		try {
			WebElement dropdown = wait.until(ExpectedConditions.visibilityOf(element));
			Select ddSelect = new Select(dropdown);
			ddSelect.selectByVisibleText(value);
		}catch(NoSuchElementException e) {
			System.out.println(value + " is not a valid value");
		}
	}

	public List<String> getDropdownSelectedOptions(WebElement element){
			WebElement dropdown = wait.until(ExpectedConditions.visibilityOf(element));
			Select ddSelect = new Select(dropdown);
			List<WebElement> selectedElements = ddSelect.getAllSelectedOptions();
			return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
	}

	public void scrollDown(WebElement element){
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void scrollDown(){
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public boolean isAttributeEmpty(WebElement element, String attribute) {  
		return wait.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));		
	}
	
	public String getAttribute(WebElement element, String attribute) {  
		return (isAttributeEmpty(element, attribute)? element.getAttribute(attribute) : "");		
	}
	
    public WebElement waitVisibility(WebElement elementBy) {
        return wait.until(ExpectedConditions.visibilityOf(elementBy));
    }

    public void setText(WebElement element, String text) {
        waitVisibility(element).sendKeys(text);
    }
 
    public String getText(WebElement element) {
        return waitVisibility(element).getText();
    }

    public void acceptAlert(){
		driver.switchTo().alert().accept();
	}

	public void dismissAlert(){
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText(){
		return driver.switchTo().alert().getText();
	}

	public void setAlertText(String text){
		driver.switchTo().alert().sendKeys(text);
	}

	public void rightClick(WebElement element){
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void switchToFrame(String id){
		driver.switchTo().frame(id);
	}

	public void switchOutFrame(){
		driver.switchTo().parentFrame();
	}

}
