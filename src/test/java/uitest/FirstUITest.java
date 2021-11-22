package uitest;


import org.testng.annotations.Test;
import pages.EpamPage;
import pages.JobSearchPage;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstUITest extends UiTestParent {

    @Test
    public void testEpamJobSearchPage() {
        EpamPage epamPage = new EpamPage();
        epamPage.openPage();
        JobSearchPage jobSearchPage = epamPage.clickCareersLink();
        jobSearchPage.typeSearchKeyword("Test automation");
        jobSearchPage.selectLocation("All Cities in United States");
        jobSearchPage.clickFind();
        String findingHeading = jobSearchPage.getFindingHeading();
        System.out.println(findingHeading);
        assertThat(findingHeading).contains("8");
    }
}
