package screens;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainScreen {
    @Step("Успешное открытие главной страницы Wikipedia")
    public void checkSuccessfulOpenMainScreen() {
        $(id("org.wikipedia.alpha:id/main_toolbar")).shouldBe(visible);

    }

}
