package Odevler;

import org.testng.annotations.Test;

public class ClickButtonSelenideTest extends SelenideOdev16BaseTest {

    @Test
    public void clickButtonMessageShouldBeCorrect() {
        new ButtonsPage()
                .openButtonsSection()
                .clickOnClickMeButton()
                .verifyClickMessage("You have done a dynamic click");
    }
}
