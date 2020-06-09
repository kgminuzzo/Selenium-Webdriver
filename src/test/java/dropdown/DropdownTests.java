package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        var dropdownPage = homePage.clickDropdown();
        String selectedOption = "Option 2";
        dropdownPage.selectFromDropdown(selectedOption);
        var selectedItems = dropdownPage.getDropdownSelectedItems();
        assertEquals(selectedItems.size(), 1, "Incorrect number of selections");
        assertTrue(selectedItems.contains(selectedOption), "Option not selected");
    }

}
