package lesson14.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginField = $(By.id("user-identifier-input"));
    private final SelenideElement passwordField = $(By.id("password-input"));
    private final SelenideElement enterBTN = $(By.id("submit-button"));


    public void logIn(String login, String password) {
        loginField.shouldBe(Condition.visible).click();
        loginField.sendKeys(login);
        passwordField.shouldBe(Condition.visible).click();
        passwordField.sendKeys(password);
        enterBTN.shouldBe(Condition.visible).click();
    }
}
