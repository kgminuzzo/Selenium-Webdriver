package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptTest extends BaseTests {

    @Test
    public void testScrollToTable(){
        var largeDeepDOM = homePage.clickLargeDeepDom();
        largeDeepDOM.scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
        var infiniteScroll = homePage.clickInfiniteScroll();
        infiniteScroll.scrollToParagraph(5);
        assertEquals(infiniteScroll.getNumberOfParagraphsPresent(),5);
    }


}
