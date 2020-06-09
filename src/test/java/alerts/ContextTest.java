package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextTest extends BaseTests {

    @Test
    public void testContext(){
        var context = homePage.clickContextMenu();
        context.rightClickBox();
        assertEquals(context.getAlertText(),"You selected a context menu");
        context.acceptAlert();
    }
}
