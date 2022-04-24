package lesson14.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BBCHomePage {

   private final SelenideElement signInBTN = $(By.xpath("//*[@id='idcta-username']"));

    public SelenideElement getSignInBTN() {
        return signInBTN;
    }
}
