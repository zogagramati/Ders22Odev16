package Odevler;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ButtonsPage {


    private final SelenideElement buttonsMenuItem =
            $(By.xpath("//span[text()='Buttons']"));


    private final SelenideElement clickMeButton =
            $x("//button[text()='Click Me']");


    private final SelenideElement dynamicClickMessage =
            $("#dynamicClickMessage");


    public ButtonsPage openButtonsSection() {
        open("https://demoqa.com/elements");
        buttonsMenuItem.shouldBe(visible).click();
        return this;
    }


    public ButtonsPage clickOnClickMeButton() {
        clickMeButton.shouldBe(visible).click();
        return this;
    }


    public ButtonsPage verifyClickMessage(String expectedMessage) {
        dynamicClickMessage.shouldBe(visible)
                .shouldHave(text(expectedMessage));
        return this;
    }
}
