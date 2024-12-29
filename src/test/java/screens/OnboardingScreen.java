package screens;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static com.codeborne.selenide.Condition.text;

public class OnboardingScreen {
    @Step("Проверка текста шага онбординга")
    public OnboardingScreen checkOnboardingStep(String text) {
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(text));

        return this;
    }

}
