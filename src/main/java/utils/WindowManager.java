package utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

@Setter
@Builder
@AllArgsConstructor
public class WindowManager {

    private final WebDriver driver;
    private final WebDriver.Navigation navigate;

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }
}
