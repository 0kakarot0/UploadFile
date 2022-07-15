package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.FileUploaderPage;

public class BaseClass {
    private WebDriver driver;
    protected FileUploaderPage uploaderPage;

    @BeforeSuite
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/upload");

        uploaderPage = new FileUploaderPage(driver);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
