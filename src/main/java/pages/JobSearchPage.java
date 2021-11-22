package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class JobSearchPage {


    private By inputKeyWordBy = By.cssSelector("input[placeholder='Keyword']");

    private By ddSelectLocation = By.cssSelector("span.select2-selection--single");

    private String btnFind = "button.recruiting-search__submit";

    private String foundJob = "h1.search-result__heading";

    public JobSearchPage() {

    }

    public void typeSearchKeyword(String text) {
        $(inputKeyWordBy).sendKeys(text);
    }

    public void clickFind() {
        $(btnFind).shouldBe(Condition.visible).click();
//        executeJavaScript("");
    }

    public String getFindingHeading() {
        return $(foundJob)
                .shouldBe(Condition.visible, Duration.ofSeconds(10))
                .getText();
    }

    public void selectLocation(String location) {
        $(ddSelectLocation).click();
        $("ul.select2-results__options li[title='" + location + "']").shouldBe(Condition.visible).click();
    }
}
