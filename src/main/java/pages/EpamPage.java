package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class EpamPage {

    private String careersLink = "//ul[@class='top-navigation__row']//a[text() = 'Careers']";

    public void openPage() {
        open("/");
    }

    public JobSearchPage clickCareersLink() {
        $x(careersLink).shouldBe(Condition.visible).click();
        return new JobSearchPage();
    }
}
