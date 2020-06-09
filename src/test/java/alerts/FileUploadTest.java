package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\karina_minuzzo\\Desktop\\New 1.sql");
        assertEquals(uploadPage.getUploadedFiles(),"New 1.sql","File uploaded is not correct.");
    }
}
