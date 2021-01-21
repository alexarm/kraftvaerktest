import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.GoogleMainPage;
import pages.GoogleSearchResultsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTests extends InitTests {

    private GoogleMainPage mainPage;
    private GoogleSearchResultsPage searchResultsPage;

    private static final String SEARCH_QUERY = "yandex";
    private static final String YANDEX_URL = "https://yandex.ru/";

    @BeforeClass(alwaysRun = true)
    public void setup() {
        mainPage = new GoogleMainPage();
        searchResultsPage = new GoogleSearchResultsPage();
    }


    @Test
    public void searchForYandexTest() {
        mainPage.open();
        mainPage.search(SEARCH_QUERY);

        assertThat(searchResultsPage.getSearchResults().get(0).getLink())
                .isEqualTo(YANDEX_URL);
    }
}
