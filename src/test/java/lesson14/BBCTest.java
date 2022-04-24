package lesson14;

import com.codeborne.selenide.Condition;
import lesson14.pages.BBCHomePage;
import lesson14.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BBCTest {

    final static String BBC_HOMEPAGE_URL = "https://www.bbc.com/";
    final static String LOGIN = "turlotv@mail.ru";
    final static String PASSWORD = "TTV161090";
    final static String EXPECTED_USER_NAME = "Your account";

    @BeforeAll
    static void setUp() {
        open(BBC_HOMEPAGE_URL);
    }

    @Test
    void loginTest() {
        BBCHomePage bbcHomePage = new BBCHomePage();
        bbcHomePage.getSignInBTN().shouldBe(Condition.visible).click();
        LoginPage loginPage = new LoginPage();
        loginPage.logIn(LOGIN, PASSWORD);

        assertEquals(EXPECTED_USER_NAME,bbcHomePage.getSignInBTN().getText());
    }


}
