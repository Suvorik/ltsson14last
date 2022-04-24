package diary.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageDiary {

    private final SelenideElement loginField = $(By.id("loginform-username"));
    private final SelenideElement passwordField = $(By.id("loginform-password"));
    private final SelenideElement enterR = $(By.xpath("//iframe[@title=\"reCAPTCHA\"]"));
    private final SelenideElement enterBTN = $(By.id("login_btn"));


    public void logInDiary(String login, String password) throws InterruptedException {
        loginField.shouldBe(Condition.visible).click();
        loginField.sendKeys(login);
        passwordField.shouldBe(Condition.visible).click();
        passwordField.sendKeys(password);
        enterR.shouldBe(Condition.visible).click();
        TimeUnit.SECONDS.sleep(2);
        enterBTN.shouldBe(Condition.visible).click();
    }
}