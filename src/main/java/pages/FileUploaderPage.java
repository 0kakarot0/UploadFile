package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploaderPage {
    private WebDriver driver;

    private By fileToUpload = By.id("file-upload");
    private By uploadFileBtn = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getFileToUpload(String fileName){
        driver.findElement(fileToUpload).sendKeys(fileName);
    }

    public void clickOnUploadFileButton(){
        driver.findElement(uploadFileBtn).click();
    }

    public String verifyUploadedFile(){
        WebElement getFileElement= driver.findElement(uploadedFile);
        return getFileElement.getText();
    }
}
