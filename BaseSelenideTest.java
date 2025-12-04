package Odevler;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseSelenideTest {

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome";
        Configuration.timeout = 8000;


        open("/elements");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
