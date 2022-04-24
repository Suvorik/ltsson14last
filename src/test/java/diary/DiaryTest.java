package diary;


import com.codeborne.selenide.Condition;
import diary.pages.DiaryHomePage;
import diary.pages.LoginPageDiary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    final static String DIARY_HOMEPAGE_URL = "https://diary.ru/";
    final static String LOGIN = "TyrloTV";
    final static String PASSWORD = "kfTeh9rrcu";
    final static String EXPECTED_USER_NAME = "Популярное";

    @BeforeAll
    static void setUp() {
        open(DIARY_HOMEPAGE_URL);
    }

    @Test
    void loginTest() throws InterruptedException {
        DiaryHomePage diaryHomePage = new DiaryHomePage();
        diaryHomePage.getSignInBTN().shouldBe(Condition.visible).click();
        LoginPageDiary loginPageDiary = new LoginPageDiary();
        loginPageDiary.logInDiary(LOGIN, PASSWORD);


    }
}
