package tests;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import screens.MainScreen;
import screens.OnboardingScreen;
import screens.components.OnboardingComponent;


@DisplayName("Проверки Wikipedia")
public class WikipediaTests extends TestBase {

    OnboardingComponent onboardingComponent = new OnboardingComponent();
    MainScreen mainScreen = new MainScreen();
    OnboardingScreen onboardingScreen = new OnboardingScreen();

    @Test
    @DisplayName("Проверка прохождения онбординга приложения")
    public void OnboardingTest() {
        onboardingScreen.checkOnboardingStep("The Free Encyclopedia");
        onboardingComponent.clickContinueButton();
        onboardingScreen.checkOnboardingStep("New ways to explore");
        onboardingComponent.clickContinueButton();
        onboardingScreen.checkOnboardingStep("Reading lists with sync");
        onboardingComponent.clickContinueButton();
        onboardingScreen.checkOnboardingStep("Data & Privacy");
        onboardingComponent.clickGetStartedButton();

        mainScreen.checkSuccessfulOpenMainScreen();
    }

}
