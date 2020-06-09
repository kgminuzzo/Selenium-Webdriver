package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        windowManager().goBack();
        windowManager().refreshPage();
        windowManager().goForward();
        windowManager().goTo("https://google.com");
    }
}
