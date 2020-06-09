package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsAlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage =  homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getResult(),"You successfuly clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetAlertText(){
        var alertPage =  homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.getAlertText();
        alertPage.dismissAlert();
        Assert.assertEquals(text,"I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputAlert(){
        var alertPage =  homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "TAU rocks!";
        alertPage.setAlertText(text);
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getResult(),"You entered: "+text, "Result text incorrect");
    }
}
