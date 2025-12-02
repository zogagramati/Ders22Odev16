package Odevler;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class SelenideOdev16BaseTest {

    @BeforeMethod
    public void setup() {

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;


        Configuration.holdBrowserOpen = true;
        Configuration.screenshots = true;


        open("about:blank");
    }
}
