package screens.components;

import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingComponent {

    @Step("Нажатие кнопки 'Continue' на экране онбординга")
    public OnboardingComponent clickContinueButton() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Нажатие кнопки 'Get Started' на экране онбординга")
    public OnboardingComponent clickGetStartedButton() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();

        return this;
    }

}
