package test;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileToUploadTest extends BaseClass {

    @Test
    public void uploadFile(){
        uploaderPage.getFileToUpload("C:\\Users\\PC\\IdeaProjects\\UploadFile\\src\\test\\resources\\cruise.jpeg");
        uploaderPage.clickOnUploadFileButton();
        String actualFileName  = uploaderPage.verifyUploadedFile();
        String expectedFileName  = "cruise.jpeg";

        Assert.assertEquals(actualFileName,expectedFileName);
    }
}
