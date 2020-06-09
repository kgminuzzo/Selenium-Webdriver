package frame;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTests {

    @Test
    public void testEditor(){
        var textEditor = homePage.clickWysiwigEditor();
        textEditor.clearEditor();

        String text1 = "hello ";
        String text2 = "world";

        textEditor.typeInEditor(text1);
        textEditor.descreaseIdention();
        textEditor.typeInEditor(text2);
        assertEquals(textEditor.getEditorText(), text1+text2);
    }
}
