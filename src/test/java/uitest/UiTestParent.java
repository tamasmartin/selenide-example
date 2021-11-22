package uitest;

import com.codeborne.selenide.Configuration;

public class UiTestParent {

    static {
        Configuration.baseUrl = "https://www.epam.com/";
        Configuration.browser = "chrome";
        Configuration.fastSetValue = true;
        Configuration.timeout = 5000;
        Configuration.screenshots = true;
    }
}
