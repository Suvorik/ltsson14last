package diary.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DiaryHomePage {

    private final SelenideElement signInBTN = $(By.xpath("//*[@id=\"navbar_user-collapse\"]/ul[1]/li[1]"));

    public SelenideElement getSignInBTN() {
        return signInBTN;
    }
}