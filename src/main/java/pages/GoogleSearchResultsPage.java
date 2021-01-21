package pages;

import com.codeborne.selenide.SelenideElement;
import objects.SearchResult;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchResultsPage {

    private final By searchResults = By.xpath("//div[@id='search']//div[@class='g']");

    public List<SearchResult> getSearchResults() {
        return $$(searchResults).stream().map(this::convertToSearchResult)
                .collect(Collectors.toList());
    }

    private SearchResult convertToSearchResult(SelenideElement result) {
        return SearchResult.builder()
                .link(result.find("a").getAttribute("href"))
                .header(result.find("h3").getText())
                .name(result.find("h3").getText())
                .build();

    }
}
